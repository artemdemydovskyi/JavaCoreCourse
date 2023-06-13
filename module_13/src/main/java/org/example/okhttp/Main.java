package org.example.okhttp;

import static org.example.httpurlconnection.UserCrudApp.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(UserCrudApp2.createUser());
        System.out.println(UserCrudApp2.updateUser(1));
        System.out.println(UserCrudApp2.deleteUser(1));
        System.out.println(UserCrudApp2.getUsers());
        System.out.println(UserCrudApp2.getUserById(1));
        System.out.println(UserCrudApp2.getUserByUsername("Karianne"));
    }
}
