package org.example.stask;

class BirthdayGreetingStrategy implements MailContentStrategy {
    @Override
    public String generateContent(Client client) {
        return "Happy Birthday " + client.getName() + "! " + "Special gift for you: Not a talon!";
    }
}
