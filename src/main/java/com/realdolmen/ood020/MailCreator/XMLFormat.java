package com.realdolmen.ood020.MailCreator;

/**
 * Created by vdabcursist on 11/08/2017.
 */
// XMLBUILDER

public class XMLFormat extends EmailFormat {
    private String XML = "";

    @Override
    public void createHeader() {
        XML+="<?xml version=”1.0” encoding=“UTF-8”?> <message>";
    }

    @Override
    public void createFrom(String from) {
        XML+="<from>"+ from + "</from>";
    }

    @Override
    public void createTo(String to) {
        XML+="<to>"+ to + "</to>";

    }

    @Override
    public void createBody(String body) {
        XML+="<body>"+ body + "</body>"
       ;

    }

    @Override
    public void createSubject(String subject) {
        XML+="<subject>"+ subject + "</subject>";
    }

    @Override
    public void createFooter() {
        XML+="</message>";
    }


    public String getXML(){
        return XML;
    }
}

