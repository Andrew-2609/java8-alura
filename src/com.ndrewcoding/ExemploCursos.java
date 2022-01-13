package com.ndrewcoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        System.out.println("Quantidade de alunos dos Cursos que possuem mais de 30 alunos:");
        cursos.stream()
                .map(Curso::getQuantidadeDeAlunos)
                .filter(quantidadeDeAlunos -> quantidadeDeAlunos > 40)
                .forEach(System.out::println)
        ;

        System.out.println("Total de alunos de todos os cursos:");
        int totalDeAlunos = cursos.stream()
                .mapToInt(Curso::getQuantidadeDeAlunos).sum();
        System.out.println(totalDeAlunos);

        cursos = cursos.stream()
                .filter(curso -> curso.getQuantidadeDeAlunos() > 75)
                .collect(Collectors.toList())
        ;

        System.out.println("Cursos com mais de 75 alunos:");
        cursos.forEach(curso -> System.out.println(curso.getNome()));

    }
}
