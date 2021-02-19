package kz.iitu.fakeDB;

import kz.iitu.model.User;

import java.util.ArrayList;
import java.util.List;

public class FakeDB {
    private final List<User> fakeDB = new ArrayList<>();
    public User getById(int id) {

        User result = new User();
        result.setId(-1);

        for (User user : fakeDB) {
            if (user.getId() == id) {
                result = user;
            }
        }

        return result;
    }

    public User getUserByLoginPassword(final String login, final String password) {

        User result = new User();
        result.setId(-1);

        for (User user : fakeDB) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                result = user;
            }
        }

        return result;
    }

    public boolean add(final User user) {

        for (User u : fakeDB) {
            if (u.getLogin().equals(user.getLogin()) && u.getPassword().equals(user.getPassword())) {
                return false;
            }
        }

        return fakeDB.add(user);
    }

//    public User.ROLE getRoleByLoginPassword(final String login, final String password) {
//        User.ROLE result = User.ROLE.UNKNOWN;
//
//        for (User user : store) {
//            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
//                result = user.getRole();
//            }
//        }
//
//        return result;
//    }

    public boolean userIsExist(final String login, final String password) {

        boolean result = false;

        for (User user : fakeDB) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                result = true;
                break;
            }
        }

        return result;
    }

    public User.ROLE getRoleByLoginPassword(String login, String password) {
        User.ROLE result = User.ROLE.UNKNOWN;

        for (User user : fakeDB) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                result = user.getRole();
            }
        }

        return result;
    }
}
