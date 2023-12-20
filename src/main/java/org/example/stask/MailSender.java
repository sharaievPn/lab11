package org.example.stask;

import java.util.HashMap;
import java.util.Map;

public class MailSender {
    private final Map<Integer,
            MailContentStrategy> strategyMap = new HashMap<>();

    public MailSender() {
        strategyMap.put(1, new BirthdayGreetingStrategy());
        strategyMap.put(2, new GiftLetterStrategy());
    }

    public void sendMail(MailInfo mailInfo) {
        MailContentStrategy strategy = strategyMap.get(mailInfo.getMailCode());
        if (strategy != null) {
            String content = strategy.generateContent(mailInfo.getClient());
            System.out.println("Sending mail to "
                    + mailInfo.getClient().getName() + ": " + content);
        } else {
            System.out.println("Mail code not recognized.");
        }
    }
}
