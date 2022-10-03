package com.poit.shop.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Oven extends Product {
    private int width;
    private int height;
    private int depth;
    private int weight;
    private float capacity;
    private float powerConsumption;
}
