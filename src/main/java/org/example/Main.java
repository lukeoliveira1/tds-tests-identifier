package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Identifier id = new Identifier();

        ArrayList<String> testData = new ArrayList<String>();
        testData.add("string");
        testData.add("stringmuitogrande");
        testData.add("");
        testData.add("1test");
        testData.add("l");
        testData.add("###");
        testData.add("#test");
        testData.add("test t");
        testData.add("test");
        testData.add("test10");
        testData.add("t1e2s3");
        testData.add("123456");

        testData.forEach((data) -> {
            System.out.print("Teste com " + data + ": ");

            if(id.validateIdentifier(data)){
                System.out.println("Válido");
            } else {
                System.out.println("Invalido");
            }
        });
    }
}