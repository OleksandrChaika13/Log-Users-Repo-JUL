package org.example.app.views;

import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserUpdateView {

    Scanner scanner;
    int option;

    public int chooseOption() {
        scanner = new Scanner(System.in);
        showSubMenu();
        try {
            option = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println(Constants.INCORRECT_VALUE_MSG);
            AppStarter.startApp();
        }
        return option;
    }

    private void showSubMenu() {
        System.out.print("""
                                
                ______ MENU ___________
                1 - Update all user`s data.
                2 - Update only user`s name.
                3 - Update only user`s phone.
                4 - Update only user`s email.
                0 - Return to main menu.
                """);
    }

    public void getOutput(int choice, String output) {
        if (choice == 0) {
            System.out.println(output);
            AppStarter.startApp();
        }
    }
}