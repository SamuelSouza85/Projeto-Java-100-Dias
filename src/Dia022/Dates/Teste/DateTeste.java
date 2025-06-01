package Dia022.Dates.Teste;

import java.util.Date;

public class DateTeste {
    public static void main(String[] args) {
        Date date = new Date(1748791987530L); // long 1000000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
