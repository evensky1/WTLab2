package com.poit.shop.entity;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "className")
public abstract class Product {
    protected int price;
    protected String manufacturer;
    protected String model;
}
