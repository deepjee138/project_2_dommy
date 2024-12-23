package dummy.employessinfo;

import dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetEmployeeTest extends TestBase {


@Test
    public void verifyAllEmployeeList(){
    Response response = given()
            .header("cookie", "humans_21909=1")
            .when()
            .get("/employees");
    response.prettyPrint();
    response.then().statusCode(200);
}
}

