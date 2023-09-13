package org.example.app.controllers;

import org.example.app.services.UserUpdateEmailService;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.views.UserUpdateEmailView;

public class UserUpdateEmailController {

    UserUpdateEmailService service;
    UserUpdateEmailView view;

    public UserUpdateEmailController(UserUpdateEmailService service, UserUpdateEmailView view) {
        this.service = service;
        this.view = view;
    }

    public void updateUserEmail() {
        String str = service.updateUserEmail(view.getData());
        if (str.equals(Constants.DB_ABSENT_MSG)) {
            view.getOutput(str);
            System.exit(0);
        } else {
            view.getOutput(str);
            AppStarter.startApp();
        }
    }
}