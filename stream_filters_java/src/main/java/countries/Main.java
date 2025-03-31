package countries;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> countries = new CountryRepository().getAll();

        //System.out.println(countries);
        feladat1(countries);

    }

    public static void feladat1(List<Country> countries){
        countries.stream()
                .map(Country::name).forEach(System.out::println);
    }





}
