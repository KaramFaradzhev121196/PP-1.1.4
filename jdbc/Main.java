package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Ivan", "Abramov", (byte) 25);
        userService.saveUser("Azamat", "Musagaliev", (byte) 34);
        userService.saveUser("Sergey", "Matveev", (byte) 42);
        userService.saveUser("Natasha", "Martynova", (byte) 18);

        userService.getAllUsers();
        userService.dropUsersTable();
        userService.cleanUsersTable();
    }
}
