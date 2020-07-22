package org.testtask.rest.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.testtask.rest.service.MonthModifyService;
import org.testtask.rest.service.StringsArrayService;

@Service
public class ServiceFacade {

    @Autowired
    StringsArrayService stringsArrayService;

    @Autowired
    MonthModifyService monthModifyService;

    public String[] getSortedModifiedArr(String[] strings) {
        return stringsArrayService.sortAndModify(strings);
    }

    public String getMonthDashedName(int monthNumber) {
        return monthModifyService.monthModify(monthNumber);
    }
}
