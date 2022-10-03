package com.poit.shop.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Criteria {
    private final String groupSearchName;
    private final Map<String, Object> criteriaMap = new HashMap<>();

    public void add(String searchCriteria, Object value) {
        criteriaMap.put(searchCriteria, value);
    }
}
