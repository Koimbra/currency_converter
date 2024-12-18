package currencyconverter.models;

import java.util.Scanner;

public class Menu {

    private boolean runningMenu;
    private String option;

    public Menu(boolean runningMenu) {
        this.runningMenu = runningMenu;
    }

    public boolean isRunningMenu() {
        return runningMenu;
    }

    public void setRunningMenu(boolean runningMenu) {
        this.runningMenu = runningMenu;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void displayMenu(Scanner scanner, Conversion conversor) {
        System.out.println("******** WELCOME TO THE CURRENCY CONVERTER ********");
        while (isRunningMenu()) {
            System.out.println("___________________________________________________" +
                    "\nSelect the currency you want to convert:" +
                    "\n[1] - Dollar >>> Argentine peso" +
                    "\n[2] - Argentine peso >>> Dollar" +
                    "\n[3] - Dollar >>> Brazilian real" +
                    "\n[4] - Brazilian real >>> Dollar" +
                    "\n[5] - Dollar >>> Colombian peso" +
                    "\n[6] - Colombian peso >>> Dollar" +
                    "\n[7] - Choose currencies for conversion" +
                    "\n[8] - Exit");
            setOption(scanner.nextLine());
            conversor.makeConversion(scanner, this);
        }
    }
}
