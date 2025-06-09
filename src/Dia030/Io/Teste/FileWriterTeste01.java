package Dia030.Io.Teste;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file);){
            fw.write("Jordan é o GOAT");
            fw.flush();

        } catch (IOException ex) {
            throw new RuntimeException();
        }
    }
}
