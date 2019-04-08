package by.it.agrinkevich.calc;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {

        Parser parser = new Parser();
        Printer printer = new Printer();
        Scanner scan = new Scanner(System.in);
        Var.loadFromFile();
        for (;;){
            String expression = scan.nextLine();
            if (expression.equals("end")) {
                Var.saveToFile();
                break;
            }
            Var var = null;
            try {
                var = parser.calc(expression);
            } catch (CalcException e) {
                System.out.println("Ошибка в " + expression);
                System.out.println(e.getMessage());
            }
            printer.print(var);
        }
    }
}
