package Dia101.Concorrencia.Domino;

public interface Currency {
    String getSyboml();
}

class Real implements Currency{

    @Override
    public String getSyboml() {
        return "R$";
    }
}

class UsDollar implements Currency{
    @Override
    public String getSyboml() {
        return "$";
    }
}

