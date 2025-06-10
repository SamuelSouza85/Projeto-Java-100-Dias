package Dia031.IO.Teste;

import java.io.*;

public class BufferedReaderTeste1 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fw = new FileReader(file);
             BufferedReader br = new BufferedReader(fw)){
            String linha;
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
