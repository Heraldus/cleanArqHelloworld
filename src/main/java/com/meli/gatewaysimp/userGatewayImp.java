package com.meli.gatewaysimp;

import com.meli.business.entities.User;
import com.meli.gateways.UserGateway;

public class userGatewayImp  implements UserGateway {

    @Override
    public User getUser(String id) {
        return new User("Jhonny", "sss");
    }
}
