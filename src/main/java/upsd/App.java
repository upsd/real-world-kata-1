package upsd;

import upsd.api.Server;
import upsd.repositories.UserRepository;

public class App {

    public static void main(String[] args) {
        new Server(new UserRepository()).startOn(3000);
    }
}
