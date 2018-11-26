package upsd.helpers;

import upsd.domain.User;
import upsd.repositories.UserRepository;

public class Helper {

    private static UserRepository userRepository;

    public Helper(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void add(User user) {
        userRepository.add(user);
    }
}
