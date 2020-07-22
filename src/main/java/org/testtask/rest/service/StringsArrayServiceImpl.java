package org.testtask.rest.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class StringsArrayServiceImpl implements StringsArrayService {

    private String[] array;

    public String[] sortAndModify(String[] strings) {
        this.array = strings.clone();
        sort();
        modify();
        return array;
    }

    private void sort() {
        Arrays.sort(array, (s1, s2) -> s1.length() == s2.length() ?
                s1.compareTo(s2) :
                s1.length() > s2.length() ? 1 : -1);
    }

    private void modify() {
        for (int i = 0; i < array.length; i++) {
            array[i] = "(" + array[i].length() + "): " + array[i];
        }
    }
}
