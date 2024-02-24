package org.example.mathExamples;

import java.util.ArrayList;
import java.util.List;

public class Massive {

    Object[] removeDuplicates(Object[] array) {
        if (array == null) {
            return null;
        }
        List<Object> uniqueItems = new ArrayList<>();
        for (Object elem: array) {
            if (!uniqueItems.contains(elem)) {
                uniqueItems.add(elem);
            }
        }
        return uniqueItems.toArray(new Object[0]);
    }
    }