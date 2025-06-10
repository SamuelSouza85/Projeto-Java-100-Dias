package Dia031.IO.Teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter br = new BufferedWriter(fw)){
            fw.write("Jordan é o GOAT");
            br.newLine();
            fw.flush();

        } catch (IOException ex) {
            throw new RuntimeException();
        }
    }
}
