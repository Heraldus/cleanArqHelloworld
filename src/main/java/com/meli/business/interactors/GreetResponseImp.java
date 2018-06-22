package com.meli.business.interactors;

import com.meli.business.boundaries.responders.GreetResponse;

public class GreetResponseImp implements GreetResponse {

    String message;
    public GreetResponseImp(String message){
        this.message = message;
    }

    public  String getGreeting(){
        return message;
    }
}
