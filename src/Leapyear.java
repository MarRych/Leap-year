
    import java.util.Scanner;

    public class Leapyear{

        public static void main(String[] args) {
            //Create the program which checks if the year is a leap-year.


            Scanner scanner = new Scanner(System.in);
            int rok;
            System.out.println("Enter the year:");
            rok = scanner.nextInt();
            //conditions
            //year is divisible by 4 and not divisible by 100
            //or number is divisible by 400

            if (rok%4 == 0 && rok%100!=0) {
                System.out.println("Yes, this is a leap-year!");
            }
            else if(rok%400 == 0) {
                System.out.println("This is a normal year.");
            }
            else {
                System.out.println("This is a normal year.");
            }

        }
    }

