package org.testtask.rest.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.TreeMap;

@Service
public class StringService {

//    public String[] sort(String[] strings) {
//        Arrays.sort(strings, (s1, s2) -> s1.length() == s2.length() ? s1.compareTo(s2) :
//                s1.length() > s2.length() ? 1 : -1);
//        return strings;
//    }

    public TreeMap<String, String> sort(String[] strings) {
        var result = new TreeMap<String, String>(((o1, o2) -> o1.length() == o2.length() ?
                o1.compareTo(o2) : Integer.compare(o1.length(), o2.length())));
        for (String string : strings) {
            result.put(string,"(" + string.length() + ")");
        }
        return result;
    }
}
