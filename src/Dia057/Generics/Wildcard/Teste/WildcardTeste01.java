package Dia057.Generics.Wildcard.Teste;


abstract class Animal {
    public abstract void consulta();
}

class  Cachorro extends  Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}


public class WildcardTeste01 {

    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        printConsuta(cachorros);
        printConsuta(gatos);
        Animal[] animals = {new Gato(), new Cachorro()};
        printConsuta(animals);
    }

    private static void printConsuta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
        //animals[1] = new Gato();
    }
}
