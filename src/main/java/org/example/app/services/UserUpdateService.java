package org.example.app.services;

import org.example.app.controllers.UserUpdateAllController;
import org.example.app.controllers.UserUpdateEmailController;
import org.example.app.controllers.UserUpdateNameController;
import org.example.app.controllers.UserUpdatePhoneController;
import org.example.app.exceptions.OptionException;
import org.example.app.repositories.UserUpdateAllRepository;
import org.example.app.repositories.UserUpdateEmailRepository;
import org.example.app.repositories.UserUpdateNameRepository;
import org.example.app.repositories.UserUpdatePhoneRepository;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.views.UserUpdateAllView;
import org.example.app.views.UserUpdateEmailView;
import org.example.app.views.UserUpdateNameView;
import org.example.app.views.UserUpdatePhoneView;

public class UserUpdateService {

    public void updateAllData() {
        UserUpdateAllRepository repository = new UserUpdateAllRepository();
        UserUpdateAllService service = new UserUpdateAllService(repository);
        UserUpdateAllView view = new UserUpdateAllView();
        UserUpdateAllController controller = new UserUpdateAllController(service, view);
        controller.updateUser();
    }

    public void updateName() {
        UserUpdateNameRepository repository = new UserUpdateNameRepository();
        UserUpdateNameService service = new UserUpdateNameService(repository);
        UserUpdateNameView view = new UserUpdateNameView();
        UserUpdateNameController controller = new UserUpdateNameController(service, view);
        controller.updateUserName();
    }

    public void updatePhone() {
        UserUpdatePhoneRepository repository = new UserUpdatePhoneRepository();
        UserUpdatePhoneService service = new UserUpdatePhoneService(repository);
        UserUpdatePhoneView view = new UserUpdatePhoneView();
        UserUpdatePhoneController controller = new UserUpdatePhoneController(service, view);
        controller.updateUserPhone();
    }

    public void updateEmail() {
        UserUpdateEmailRepository repository = new UserUpdateEmailRepository();
        UserUpdateEmailService service = new UserUpdateEmailService(repository);
        UserUpdateEmailView view = new UserUpdateEmailView();
        UserUpdateEmailController controller = new UserUpdateEmailController(service, view);
        controller.updateUserEmail();
    }

    public void getNoSuchOption(int choice) {
        int[] subMenuChoices = {0, 1, 2, 3, 4};
        if (!contains(subMenuChoices, choice)) {
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