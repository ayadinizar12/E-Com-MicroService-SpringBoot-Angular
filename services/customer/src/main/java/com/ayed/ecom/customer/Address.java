package com.ayed.ecom.customer;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder
public class Address {
    private String street;
    private String houseNumber;
    private String zipCode;
}
