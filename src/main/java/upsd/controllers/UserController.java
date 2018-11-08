package upsd.controllers;

import com.eclipsesource.json.JsonObject;
import spark.Request;
import spark.Response;
import upsd.domain.User;
import upsd.repositories.UserRepository;

public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getById(Request req, Response res) {
        int id = Integer.parseInt(req.params(":id"));

        User userFound = userRepository.getBy(id).get();

        res.type("application/json");

        return jsonStringFor(userFound);
    }

    private String jsonStringFor(User user) {
        return new JsonObject()
                .add("id", user.id())
                .add("name", user.name())
                .toString();
    }
}
