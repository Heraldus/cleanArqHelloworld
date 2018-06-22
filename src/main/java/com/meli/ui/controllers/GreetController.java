package com.meli.ui.controllers;

import com.meli.business.boundaries.UseCase;
import com.meli.business.boundaries.requestors.GreetRequest;
import com.meli.business.interactors.GreetRequestImp;
import com.meli.business.interactors.GreetUserInteractor;
import com.meli.gatewaysimp.userGatewayImp;
import com.meli.ui.presenters.GreetPresenter;

public class GreetController {

    public void greet() {
        UseCase useCase = new GreetUserInteractor(new GreetPresenter(), new userGatewayImp());
        useCase.execute(new GreetRequestImp("ID_XXX"));
        System.out.println("Bye.");
    }
}
