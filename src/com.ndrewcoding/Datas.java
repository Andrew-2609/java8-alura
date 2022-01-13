package com.ndrewcoding;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println("Data de hoje: " + hoje);

        LocalDate olimpiadasDoRio = LocalDate.of(2016, Month.JUNE, 5);
        int anosDesdeAOlimpiadaDoRio = hoje.getYear() - olimpiadasDoRio.getYear();
        System.out.println("Fazem uns " + anosDesdeAOlimpiadaDoRio + " anos que as Olimpíadas do Rio aconteceram.");

        Period periodo = Period.between(olimpiadasDoRio, hoje);
        System.out.println("Fazem cerca de *" + periodo.getYears() + "* anos que as Olimpíadas do Rio aconteceram");

        LocalDate daquiADoisAnos = hoje.plusYears(2);
        System.out.println("A data daqui a 2 anos será: " + daquiADoisAnos);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        String valorFormatado = daquiADoisAnos.format(formatter);
        System.out.println("Data de daqui a 2 anos formatada: " + valorFormatado);

        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Agora, mas num formato melhor: " + agora.format(DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss")));

        LocalTime horarioDoIntervalo = LocalTime.of(15, 30);
        System.out.println("O intervalo será às: " + horarioDoIntervalo);

    }
}
