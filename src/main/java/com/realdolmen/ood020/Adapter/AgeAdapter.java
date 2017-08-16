package com.realdolmen.ood020.Adapter;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class AgeAdapter implements HasAge {

    private HasBirthday hasBirthday;

    public AgeAdapter(HasBirthday hasBirthday) {
        this.hasBirthday = hasBirthday;
    }


    @Override
    public long getAge() {
        return ChronoUnit.YEARS.between(hasBirthday.getBirthdate(),LocalDate.now());
    }


    }

