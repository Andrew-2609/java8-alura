package com.ndrewcoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

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

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }

}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }

}
