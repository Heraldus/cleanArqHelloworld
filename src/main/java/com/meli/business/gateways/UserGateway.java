package com.meli.gateways;

import com.meli.business.entities.User;

public interface UserGateway {

    User getUser(String id);
}
