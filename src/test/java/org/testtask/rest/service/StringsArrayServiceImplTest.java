package org.testtask.rest.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testtask.rest.facade.ServiceFacade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

class StringsArrayServiceImplTest {

    @Test
    void sortAndModifyTest() {
        StringsArrayService stringsArrayService = new StringsArrayServiceImpl();

        String[] result = new String[]{
                "(3): Ага", "(4): Буга", "(5): Вилка", "(5): Ножка", "(7): Ложкарь"
        };

        String[] example = new String[]{
                "Ножка", "Буга", "Ложкарь", "Вилка", "Ага"
        };
        Assertions.assertArrayEquals(result, stringsArrayService.sortAndModify(example));
    }

    @Test
    void getMonthTest(){
        MonthModifyService monthModifyService = new MonthModifyServiceImpl();

        Assertions.assertEquals
                ("Я-Н-В-А-Р-Ь",
                        monthModifyService.monthModify(1));
    }
}