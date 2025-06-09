package Dia029.Regex.Teste;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste05 {
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
        // . 1.3 = 123, 133, 1@3, 1A3

        String regex = "([a-zA-Z0-9._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@gmail.com, 123jotaro@hotmail, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email válido:" + "#@!zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
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
