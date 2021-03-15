package com.xhc.java.dutySort;

import java.util.Comparator;
import java.util.Map;

public class PersonComparator implements Comparator<Person> {

    // 排序规则
    private Map<String, Integer> sortRule;

    public PersonComparator(Map<String, Integer> sortRule) {
        this.sortRule = sortRule;
    }

    public int compare(Person o1, Person o2) {
        String d1 = o1.duty.split(",")[0];
        String d2 = o2.duty.split(",")[0];
        Integer i1 = sortRule.getOrDefault(d1, Integer.MAX_VALUE);
        Integer i2 = sortRule.getOrDefault(d2, Integer.MAX_VALUE);
        if (i2 > i1) return -1;
        return 0;
    }
}
