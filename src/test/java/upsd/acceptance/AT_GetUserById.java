package upsd.acceptance;

import org.junit.Test;
import upsd.domain.User;
import upsd.helpers.Helper;

import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.is;

public class AT_GetUserById {

    @Test
    public void return_200_and_user_found_for_specified_id() {
        Helper.add(new User(1, "sam"));


        get("/users/1").then()
                .statusCode(200)
                .contentType("application/json")
                .body("id", is(1))
                .body("name", is("sam"));
    }
}
