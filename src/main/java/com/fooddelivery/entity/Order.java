package com.fooddelivery.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String customerName;
    private String status;
    private String items;
    @ManyToOne
    @JoinColumn(name = "chef_id")
    private Chef assignedChef;
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private DeliveryDriver assignedDriver;
}
