package org.example.stask;

class GiftLetterStrategy implements MailContentStrategy {
    @Override
    public String generateContent(Client client) {
        return "Dear " + client.getName()
                + ", enjoy our exclusive gift! (Spoiler: not a talon)";
    }
}
