import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Boolean IsgoingOn = true;

        while (IsgoingOn) {
            try {
                System.out.println("Enter the number: ");
                double n = scanner.nextInt();

                System.out.println("Enter the number: ");
                double y = scanner.nextInt();

                double z = n / y;
                System.out.println("Result: " + z);
            }
            //Mathematical exception (Devide by zero)
            catch (ArithmeticException e) {
                System.out.println("You can't divide by zero idiot");
            }
            //Input does not match expected type of data
            catch(InputMismatchException e){
                System.out.println("You can't enter a string idiot");
            }
            //Adittional Loop for endless mode
            System.out.println("Do you want to continue? (y/n)");
            String answer = scanner.next();
            if (answer.equals("n")) {
                IsgoingOn = false;
            }

            }
        }
    }