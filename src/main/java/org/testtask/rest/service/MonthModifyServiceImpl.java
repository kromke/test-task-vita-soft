package org.testtask.rest.service;

import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

@Service
public class MonthModifyServiceImpl implements MonthModifyService {


    private final Locale locale = new Locale("ru");

    private final SimpleDateFormat afterModify = new SimpleDateFormat("MM", locale);

    private final SimpleDateFormat pastModify = new SimpleDateFormat("MMMM", locale);

    @Override
    public String monthModify(int monthNumber) {

        try {
            return String.join("-", pastModify
                    .format(afterModify.parse(String.valueOf(monthNumber)))
                    .toUpperCase()
                    .split(""));
        } catch (ParseException pe) {
            return pe.getMessage() + " " + pe.getErrorOffset();
        }
    }
}
