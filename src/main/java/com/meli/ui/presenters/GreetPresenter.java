package com.meli.ui.presenters;

import com.meli.business.boundaries.responders.GreetResponder;
import com.meli.business.boundaries.responders.GreetResponse;

public class GreetPresenter implements GreetResponder {
    @Override
    public void present(GreetResponse response) {
        System.out.println(response.getGreeting());
    }
}
