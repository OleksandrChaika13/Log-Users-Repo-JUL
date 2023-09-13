package org.example.app.controllers;

import org.example.app.services.UserUpdatePhoneService;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.views.UserUpdatePhoneView;

public class UserUpdatePhoneController {

    UserUpdatePhoneService service;
    UserUpdatePhoneView view;

    public UserUpdatePhoneController(UserUpdatePhoneService service, UserUpdatePhoneView view) {
        this.service = service;
        this.view = view;
    }

    public void updateUserPhone() {
        String str = service.updateUserPhone(view.getData());
        if (str.equals(Constants.DB_ABSENT_MSG)) {
            view.getOutput(str);
            System.exit(0);
        } else {
            view.getOutput(str);
            AppStarter.startApp();
        }
    }
}