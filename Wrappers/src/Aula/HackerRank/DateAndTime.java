package Aula.HackerRank;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateAndTime {
    // Exercício HackerRank - 10/09/2026
    // Não preciso da instância/objeto para invocar o método
    public static String findDay(int month, int day, int year){
        // return LocalDate.of(year, month, day).getDayOfWeek().name();

        LocalDate data = LocalDate.of(year, month, day);

        DayOfWeek dw = data.getDayOfWeek();
        String diaDaSemana = dw.name();

        return diaDaSemana;

    }

    public static void main(String [] args){

        System.out.println(findDay(9,10,2026));

    }
}
