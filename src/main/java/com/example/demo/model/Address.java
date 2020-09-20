package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Builder
@Getter
@Data
public class Address {

    private final String address;

}
