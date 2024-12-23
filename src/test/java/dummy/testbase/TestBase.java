package dummy.testbase;


import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

/**
 * Created by jenny
 */
public class TestBase {


    @BeforeClass
    public void inIt(){
        RestAssured.baseURI="http://dummy.restapiexample.com/";

        RestAssured.basePath="/api/v1";
    }

}