package com.ndrewcoding;

import java.util.ArrayList;
import java.util.List;

public class OrdenaString {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Alura");
        palavras.add("Portfólio");
        palavras.add("Ajax");

        palavras.sort(String::compareTo);

        palavras.forEach(System.out::println);

    }
}
