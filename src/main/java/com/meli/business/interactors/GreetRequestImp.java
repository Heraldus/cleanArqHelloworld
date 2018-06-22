package com.meli.business.interactors;

import com.meli.business.boundaries.requestors.GreetRequest;

public class GreetRequestImp  implements GreetRequest {

    String id;
    @Override
    public String getId() {
        return id;
    }

    public GreetRequestImp(String id){
        this.id = id;
    }


}
