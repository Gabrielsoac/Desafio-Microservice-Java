package com.gabrielsoac.orders.domain;

public enum OrderStatus {

    CONCLUED(1),
    PENDING(2),
    CANCELED(3);

    public final int value;

    OrderStatus(int value){
        this.value = value;
    }

}
