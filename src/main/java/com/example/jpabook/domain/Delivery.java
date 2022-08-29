package com.example.jpabook.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.nio.MappedByteBuffer;

@Entity
@Getter
@Setter
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

//    @Enumerated(EnumType.STRING)
//    private DeliveryStatus status; //배송준비, 배송
}
