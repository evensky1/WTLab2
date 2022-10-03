package com.poit.shop.entity.criteria;

public final class SearchCriteria {

    public enum OvenCriteria {
        POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    public enum FridgeCriteria {
        POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
    }

    public enum KettleCriteria {
        COLOR, VOLUME, BOTTOM_DIAMETER
    }

    private SearchCriteria() {}
}
