package upsd.repositories;

import upsd.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    public void add(User userToAdd) {
        users.add(userToAdd);
    }

    public Optional<User> getBy(int id) {
        return users.stream()
                .filter(u -> u.id() == id)
                .findFirst();
    }
}
