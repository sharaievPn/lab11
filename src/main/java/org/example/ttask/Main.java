package org.example.ttask;

public class Main {
    public static void main(String[] args) {
        MyImage image = new ProxyImage("/test.jpeg");
        image.display();
    }
}