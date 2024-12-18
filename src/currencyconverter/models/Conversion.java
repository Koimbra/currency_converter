package currencyconverter.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Conversion {

    private Menu menu;
    private String api_key;
    private double amount;
    private String base_code;
    private String target_code;

    public Conversion(Menu menu) {
        this.menu = menu;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public void makeConversion(Scanner scanner, Menu menu) {

        setApi_key("d617bd7a6742ed1882bd57a7");

        switch (menu.getOption()){
            case "1":
                setBase_code("USD");
                setTarget_code("ARS");
                break;

            case "2":
                setBase_code("ARS");
                setTarget_code("USD");
                break;

            case "3":
                setBase_code("USD");
                setTarget_code("BRL");
                break;

            case "4":
                setBase_code("BRL");
                setTarget_code("USD");
                break;

            case "5":
                setBase_code("USD");
                setTarget_code("COP");
                break;

            case "6":
                setBase_code("COP");
                setTarget_code("USD");
                break;

            case "7":
                System.out.print("Enter the currency to be converted: ");
                setBase_code(scanner.nextLine().toUpperCase());
                System.out.print("Enter the currency for conversion: ");
                setTarget_code(scanner.nextLine().toUpperCase());
                break;

            case "8":
                System.out.println("Exiting...");
                menu.setRunningMenu(false);
                return;

            default:
                System.out.println("Please enter a valid input.");
                return;
        }

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/"+getApi_key()+"/latest/"+getBase_code()))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Currency currency = gson.fromJson(response.body(), Currency.class);

            System.out.print("Enter the amount you want to convert: ");
            setAmount(scanner.nextDouble());
            scanner.nextLine();

            Calculator calculator = new Calculator();
            double target_rate = currency.conversion_rates().get(getTarget_code());
            double amountCalculated = calculator.calculate(getAmount(), target_rate);

            System.out.println("\n******** CONVERSION ********\n" +
                    getBase_code() + " = " + getAmount() + " >>> " + getTarget_code() + " = " + amountCalculated);

        } catch (IOException | InterruptedException e) {
            System.out.println("Sorry, something went wrong.");
        }
    }
}
