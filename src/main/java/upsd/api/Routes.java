package upsd.api;

import upsd.controllers.UserController;
import upsd.repositories.UserRepository;

import static spark.Spark.get;

class Routes {

    private UserController userController;

    Routes(UserRepository userRepository) {
        userController = new UserController(userRepository);
    }

    void setup() {
        get("/users/:id", (req, res) -> userController.getById(req, res));
    }
}
