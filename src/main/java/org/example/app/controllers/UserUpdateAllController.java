package org.example.app.controllers;

import org.example.app.services.UserUpdateAllService;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.views.UserUpdateAllView;

public class UserUpdateAllController {

    UserUpdateAllService service;
    UserUpdateAllView view;

    public UserUpdateAllController(UserUpdateAllService service, UserUpdateAllView view) {
        this.service = service;
        this.view = view;
    }

    public void updateUser() {
        String str = service.updateUser(view.getData());
        if (str.equals(Constants.DB_ABSENT_MSG)) {
            view.getOutput(str);
            System.exit(0);
        } else {
            view.getOutput(str);
            AppStarter.startApp();
        }
    }
}