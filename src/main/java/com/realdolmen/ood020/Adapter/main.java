package com.realdolmen.ood020.Adapter;

import java.time.LocalDate;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class main {
    public static void main(String[] args) {
        Person person = new Person(LocalDate.of(1989,12,1));

        VotingSystem votingSystem = new VotingSystem();
        System.out.println(VotingSystem.canVote(new AgeAdapter(person)));

    }
}
