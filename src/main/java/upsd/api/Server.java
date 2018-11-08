package upsd.api;

import spark.Spark;
import upsd.repositories.UserRepository;

public class Server {

    private final UserRepository userRepository;

    public Server(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void startOn(int port) {
        Spark.port(port);
        new Routes(userRepository).setup();
    }
}
