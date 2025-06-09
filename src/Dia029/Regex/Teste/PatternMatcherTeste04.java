package Dia029.Regex.Teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste04 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \d = Tudo o que não for dígitos
        // \s = Espacos em branco \t \f \n \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo que não for incluso no \w
        // []
        // ? zero ou uma
        // * zero ou main
        // + uma ou mais
        // {n,m} de n até m
        // () agrupamento
        // | o(v|c)o, ovo |oco
        // $
        String regex = "0[xX]([0-9A-F])+(\\s|$)";
        String texto = "0X 0x 12 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher( texto);
        System.out.println("texto:  "+texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " +regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+": "+matcher.group()+"\n");
        }
    }
}
