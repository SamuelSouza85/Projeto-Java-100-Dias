package Dia103.Teste;

import Dia100.Builder.Dominio.Person;
import Dia101.Concorrencia.Domino.Country;
import Dia101.Concorrencia.Domino.Currency;
import Dia101.Concorrencia.Domino.CurrencyFactory;
import Dia102.Sigleton.Dominio.Aircraft;
import Dia103.Dominio.ReportDto;

public class DataTransferObjectTeste01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder.builder()
                .firstName("Samuel")
                .lastName("Souza")
                .build();
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();
        System.out.println(reportDto);
    }
}
