package org.example.crm.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor@NoArgsConstructor
public class Customer {
    private Integer id;
    private String name;
    private String address;
}
