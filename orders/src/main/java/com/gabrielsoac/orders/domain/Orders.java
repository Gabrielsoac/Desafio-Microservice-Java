package com.gabrielsoac.orders.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_orders")
public class Orders {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, name = "user_id")
    private Long userId;

    @OneToMany
    private final Set<Item> items = new HashSet<>();

    public OrderStatus status;

    public String getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Set<Item> getItems() {
        return items;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}