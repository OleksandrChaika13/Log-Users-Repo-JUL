package org.example.app.views;

import java.util.Scanner;

public class UserUpdateNameView {

    public String[] getData() {

        Scanner scanner = new Scanner(System.in);

        String title = "Enter user's ID: ";
        System.out.print(title);
        String id = scanner.nextLine();

        title = "Enter a new name: ";
        System.out.print(title);
        String email = scanner.nextLine();

        return new String[] {id, email};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}