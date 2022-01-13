package com.ndrewcoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Curso {

    private final String nome;
    private final int quantidadeDeAlunos;

    public Curso(String nome, int quantidadeDeAlunos) {
        this.nome = nome;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    @Override
    public String toString() {
        return "Curso(nome: " + nome + ", quantidade de alunos: " + quantidadeDeAlunos + ")";
    }
}

public class ExemploCursos {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("Java", 80));
        cursos.add(new Curso("JavaScript", 70));
        cursos.add(new Curso("Ruby", 30));

        cursos.sort(Comparator.comparing(Curso::getQuantidadeDeAlunos));

        cursos.stream()
                .map(Curso::getQuantidadeDeAlunos)
                .filter(quantidadeDeAlunos -> quantidadeDeAlunos > 40)
                .forEach(System.out::println)
        ;

        /*cursos.forEach(System.out::println);*/

    }
}
