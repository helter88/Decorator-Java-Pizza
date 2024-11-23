package org.example;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public class Jawlery {

    private String name;
    private BigDecimal prize;
    private String description;
}
