package Dia023.Formatacao.Teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste {
    public static void main(String[] args) {
        String pattern = "'Amsterdam' 'dia' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Amsterdam dia 02 de junho de 2025"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
