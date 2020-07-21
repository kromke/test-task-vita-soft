package org.testtask.rest.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class StringServiceTest {

    private String[] result = new String[] {
            "Ага", "Буга", "Вилка", "Ножка", "Ложкарь"
    };

    private String[] example =  new String[] {
            "Ножка", "Буга", "Ложкарь", "Вилка", "Ага"
    };


    StringService stringService = new StringService();

    @Test
    void sortTest() {
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(stringService.sort(example)));
        Assertions.assertArrayEquals(result, stringService.sort(example));
    }
}