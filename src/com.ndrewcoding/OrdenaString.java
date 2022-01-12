package com.ndrewcoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Alura");
        palavras.add("Portfólio");
        palavras.add("Ajax");

        palavras.sort(new ComparadorPorTamanho());

        System.out.println(palavras);

    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }

}
