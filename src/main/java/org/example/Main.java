package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Identifier id = new Identifier();

        ArrayList<String> testData = new ArrayList<String>();
        testData.add("");
        testData.add("a");
        testData.add("1");
        testData.add("a123bcd");
        testData.add("a123bc");
        testData.add("a*1bc");
        ;

        testData.forEach((data) -> {
            System.out.print("Teste com " + data + ": ");

            if (id.validateIdentifier(data)) {
                System.out.println("Válido");
            } else {
                System.out.println("Invalido");
            }
        });
    }
}