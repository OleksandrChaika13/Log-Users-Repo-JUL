package org.example.app.controllers;

import org.example.app.services.UserUpdateService;
import org.example.app.utils.Constants;
import org.example.app.views.UserUpdateView;


public class UserUpdateController {

    UserUpdateView view;
    UserUpdateService service;

    public UserUpdateController(UserUpdateView view, UserUpdateService service) {
        this.view = view;
        this.service = service;
    }

    public void runSubMenu() {
        filterSubMenuChoice(view.chooseOption());
    }

    private void filterSubMenuChoice(int choice) {
        switch (choice) {
            case 1 -> service.updateAllData();
            case 2 -> service.updateName();
            case 3 -> service.updatePhone();
            case 4 -> service.updateEmail();
            case 0 -> view.getOutput(choice, Constants.MENU_RETURN_MSG);
            default -> service.getNoSuchOption(choice);
        }
    }
}