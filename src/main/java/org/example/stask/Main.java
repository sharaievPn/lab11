package org.example.stask;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Oles Dobosevych", 30, Client.Gender.MALE);
        MailInfo birthdayMail = new MailInfo(client, 1);
        MailInfo giftMail = new MailInfo(client, 2);

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(birthdayMail);
        mailBox.addMailInfo(giftMail);

        mailBox.sendAll();
    }
}
