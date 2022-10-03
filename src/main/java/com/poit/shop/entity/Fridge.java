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
public class Fridge extends Product {
    private int width;
    private int height;
    private int weight;
    private float freezerCapacity;
    private float overallCapacity;
    private float powerConsumption;
}

