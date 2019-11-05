package api;

import api.repository.IUserRepository;
import api.repository.impl.UserRepository;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        IUserRepository userRepository = new UserRepository();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // create menu with next options: 1 - add, 2 - delete, 3 - update, 4 - findAll, 5 - exit
    }
}
