package Dia053.Colecoes.Teste;

import java.util.HashMap;
import java.util.Map;

public class MapTeste01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc2", "você");
//        System.out.println(map);
//        for (String key : map.keySet()) {
//            System.out.println(key + " : "+ map.get(key));
//        }

        System.out.println("----------------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}
