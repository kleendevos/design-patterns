package com.realdolmen.ood020.Adapter;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class Person implements HasBirthday {

    private LocalDate birthdate;

    public Person(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public LocalDate getBirthdate() {
        return birthdate;
    }


}

