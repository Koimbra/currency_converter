package currencyconverter.main;

import currencyconverter.models.Conversion;
import currencyconverter.models.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Menu menuTest = new Menu(true);
        Conversion converterTest = new Conversion(menuTest);
        menuTest.displayMenu(scanner, converterTest);

    }
}
