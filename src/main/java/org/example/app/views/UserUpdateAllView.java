package org.example.app.views;

import java.util.Scanner;

public class UserUpdateAllView {

    public String[] getData() {

        Scanner scanner = new Scanner(System.in);

        String title = "Enter user's ID: ";
        System.out.print(title);
        String id = scanner.nextLine();

        title = "Enter new user`s name: ";
        System.out.print(title);
        String name = scanner.nextLine();

        title = "Enter new phone in format xxx xxx-xxxx: ";
        System.out.print(title);
        String phone = scanner.nextLine();

        title = "Enter new email: ";
        System.out.print(title);
        String email = scanner.nextLine();

        return new String[] {id, name, phone, email};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}