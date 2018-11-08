package upsd.controllers;

import com.eclipsesource.json.JsonObject;
import org.junit.Before;
import org.junit.Test;
import spark.Request;
import spark.Response;
import upsd.domain.User;
import upsd.repositories.UserRepository;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UserControllerShould {

    private Request request;
    private Response response;
    private UserController userController;
    private final User USER = new User(1, "bob");
    private UserRepository userRepository;

    @Before
    public void setUp() {
        request = mock(Request.class);
        response = mock(Response.class);
        userRepository = mock(UserRepository.class);
        userController = new UserController(userRepository);
    }

    @Test
    public void return_user_for_supplied_id() {
        given(request.params(":id")).willReturn("1");
        given(userRepository.getBy(1)).willReturn(Optional.of(USER));


        String actual = userController.getById(request, this.response);


        verify(response).type("application/json");
        assertThat(actual, is(jsonStringFor(USER)));
    }

    private String jsonStringFor(User user) {
        return new JsonObject()
                .add("id", user.id())
                .add("name", user.name())
                .toString();
    }
}
