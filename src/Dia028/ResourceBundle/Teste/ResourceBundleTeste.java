package Dia028.ResourceBundle.Teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));

        System.out.println("-----------------------");

        bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        System.out.println("-----------------------");

        System.out.println(bundle.getString("hi"));
    }
}
