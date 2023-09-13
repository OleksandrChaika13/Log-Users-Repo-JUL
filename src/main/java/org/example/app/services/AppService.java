package org.example.app.services;

import org.example.app.controllers.*;
import org.example.app.exceptions.OptionException;
import org.example.app.repositories.*;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.views.*;

public class AppService {

    public void createUser() {
        UserCreateRepository repository = new UserCreateRepository();
        UserCreateService service = new UserCreateService(repository);
        UserCreateView view = new UserCreateView();
        UserCreateController controller = new UserCreateController(service, view);
        controller.createUser();
    }

    public void getNoSuchOption(int choice) {
        int[] menuChoices = {0, 1};
        if (!contains(menuChoices, choice)) {
            try {
                throw new OptionException(Constants.INCORRECT_VALUE_MSG);
            } catch (OptionException e) {
                System.out.println(e.getMessage());
                AppStarter.startApp();
            }
        }
    }

    public static boolean contains(final int[] options, final int value) {
        boolean result = false;
        for (int i : options) {
            if (i == value) {
                result = true;
                break;
            }
        }
        return result;
    }
}