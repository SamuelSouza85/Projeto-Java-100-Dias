package Dia017.Exception.Teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo cirado" +isCriado);
            file.createNewFile();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
