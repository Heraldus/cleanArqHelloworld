package com.meli.business.gateways;

import com.meli.business.entities.User;

public interface UserGateway {

    User getUser(String id);
}
