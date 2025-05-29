package Dia019.Teste;

import Dia019.Leitor01;
import Dia019.Leitor02;

import java.io.*;

public class TryWithResourcesTeste {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        try(Leitor02 leitor02 = new Leitor02();
            Leitor01 leitor01 = new Leitor01()) {

        }catch (IOException e){

        }
    }
    public static void  lerArquivo02(){
        Reader reader = null;
        try{
            reader = new BufferedReader(new FileReader("Teste.txt"));
        }catch (FileNotFoundException e ){
            e.printStackTrace();
        }finally {
            try{
                if (reader != null) {
                    reader.close();
            }
        }catch (IOException exception){
                exception.printStackTrace();
            }
        }
    }
}
