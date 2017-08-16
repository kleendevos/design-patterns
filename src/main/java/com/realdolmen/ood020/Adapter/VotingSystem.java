package com.realdolmen.ood020.Adapter;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class VotingSystem {

    public static boolean canVote(HasAge hasAge){
        return hasAge.getAge()>=18;
    }


}
