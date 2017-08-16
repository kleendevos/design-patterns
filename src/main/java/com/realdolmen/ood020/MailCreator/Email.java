package com.realdolmen.ood020.MailCreator;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public class Email {
    private String from;
    private String to;
    private String Subject;
    private String body;

    public Email(String from, String to, String subject, String body) {
        this.from = from;
        this.to = to;
        Subject = subject;
        this.body = body;
    }

    public Email() {

    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
