package upsd.repositories;

import org.junit.Test;
import upsd.domain.User;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserRepositoryShould {

    @Test
    public void retrieve_added_user() {
        UserRepository userRepository = new UserRepository();
        User user = new User(1, "new user");
        userRepository.add(user);


        User userFound = userRepository.getBy(1).get();


        assertThat(userFound, is(user));
    }
}