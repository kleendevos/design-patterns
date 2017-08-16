package com.realdolmen.ood020.MailCreator;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class Main {
    public static void main(String[] args) {
        Email email = new Email("From: trainer@realdolmen.com","To: gof@patterns.com","Subject: Congratulations","Enlightning book!");
        XMLFormat xmlFormat = new XMLFormat(); //builder
        EmailConverter emailConverter = new EmailConverter(xmlFormat); //director
        emailConverter.convertEmail(email);
        System.out.println(xmlFormat.getXML());
    }
}
