package Dia015.Interface.Teste;

import Dia015.Interface.DatabaseLoader;
import Dia015.Interface.FileLoader;

public class DataLoaderTeste {
    public static void main(String[] args) {
        DatabaseLoader databaseloader = new DatabaseLoader();
        FileLoader fileLoader =new FileLoader();
        databaseloader.load();
        fileLoader.load();
        databaseloader.remove();
        fileLoader.remove();

        databaseloader.checkPermission();
        fileLoader.checkPermission();
    }
}
