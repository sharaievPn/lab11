package org.example.stask;

import lombok.Getter;

@Getter
public class Client {
    private static int counter = 0;
    private final int id;
    private final String name;
    private final int age;
    private final Gender sex;

    public Client(String name, int age, Gender sex) {
        this.id = counter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public enum Gender {
        MALE, FEMALE
    }
}
