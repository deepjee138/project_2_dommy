package dummy.employessinfo;

import dummy.model.EmployeePojo;
import dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostEmployeeTest extends TestBase {

@Test
    public void verifyCreateEmployess(){

    EmployeePojo employeePojo=new EmployeePojo();
    employeePojo.setName("Tiger Nixon");
    employeePojo.setSalary(320800);
    employeePojo.setAge(63);
    employeePojo.setImage(" ");

    Response response= given().log().all()
            .header("Content-Type", "application/json")
            .header("cookie", "humans_21909=1")
            .when()
            .body(employeePojo)
            .post("/create");
    response.prettyPrint();
    response.then().statusCode(200);



}
}
