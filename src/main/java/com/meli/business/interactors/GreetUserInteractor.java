package com.meli.business.interactors;

import com.meli.business.boundaries.*;
import com.meli.business.boundaries.requestors.GreetRequest;
import com.meli.business.boundaries.responders.GreetResponder;
import com.meli.business.boundaries.responders.GreetResponse;
import com.meli.business.entities.User;
import com.meli.gateways.UserGateway;

public class GreetUserInteractor implements UseCase {

    GreetResponder responder;
    UserGateway userGateway;

    public GreetUserInteractor(GreetResponder responder,UserGateway userGateway){
        this.userGateway = userGateway;
        this.responder = responder;
    }


    @Override
    public void execute(GreetRequest request) {
        User u = userGateway.getUser(request.getId());
        GreetResponse response = new GreetResponseImp("Hola " + u.getName());
        responder.present(response);
    }

}
