package Dia019.Teste;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        try{
            throw new IllegalArgumentException();
        }catch (ArrayIndexOutOfBoundsException| IllegalArgumentException| ArithmeticException  e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException| ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvelLanceException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void talvelLanceException() throws SQLException, FileNotFoundException{

    }
}
