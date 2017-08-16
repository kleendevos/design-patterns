package com.realdolmen.ood020.MailCreator;

/**
 * Created by vdabcursist on 11/08/2017.
 */

//BUILDER


public abstract class EmailFormat {

    public abstract void createHeader();
    public abstract void createFooter();
    public abstract void createFrom(String from);
    public abstract void createTo (String to);
    public abstract void createBody (String body);
    public abstract void createSubject (String Subject);



}
