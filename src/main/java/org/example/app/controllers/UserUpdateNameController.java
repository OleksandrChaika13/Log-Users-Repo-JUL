package org.example.app.controllers;

import org.example.app.services.UserUpdateNameService;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.views.UserUpdateNameView;

public class UserUpdateNameController {

    UserUpdateNameService service;
    UserUpdateNameView view;

    public UserUpdateNameController(UserUpdateNameService service, UserUpdateNameView view) {
        this.service = service;
        this.view = view;
    }

    public void updateUserName() {
        String str = service.updateUserName(view.getData());
        if (str.equals(Constants.DB_ABSENT_MSG)) {
            view.getOutput(str);
            System.exit(0);
        } else {
            view.getOutput(str);
            AppStarter.startApp();
        }
    }
}