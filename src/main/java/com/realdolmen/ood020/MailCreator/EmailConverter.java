package com.realdolmen.ood020.MailCreator;

/**
 * Created by vdabcursist on 11/08/2017.
 */

//DIRECTOR


public class EmailConverter {

    private EmailFormat emailformat;

    public EmailConverter(EmailFormat emailformat) {
        this.emailformat = emailformat;
    }

    public void convertEmail (Email email) {
        emailformat.createHeader();
        emailformat.createFrom(email.getFrom());
        emailformat.createTo (email.getTo());
        emailformat.createBody(email.getBody());
        emailformat.createSubject(email.getSubject());
        emailformat.createFooter();
    }

}
