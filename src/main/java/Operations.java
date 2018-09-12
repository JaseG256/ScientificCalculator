import java.util.Scanner;

public abstract class Operations {

    protected Scanner scan = new Scanner(System.in);

    protected boolean isError = false;

    protected double currentNumber;

    protected double numInMemory;

    protected double firstNumber;

    protected double secondNumber;

    public double getCurrentNumber() {
        return currentNumber;
    }

    public  void display() {
        System.out.println(currentNumber);
    }

    public  void update(double z) {
        System.out.println(z);
        currentNumber = z;
    }

    public void switchDisplayMode() {
        System.out.print("Binary : 'Y' or 'N'");
        String choice = scan.next();
        if (choice.equalsIgnoreCase("Y")) {
            int binary = (int)currentNumber;
            System.out.println(Integer.toBinaryString(binary));
        } else if (choice.equalsIgnoreCase("N")) {
            System.out.println("Octal: 'Y' or 'N'");
            choice = scan.next();
            if (choice.equalsIgnoreCase("Y")) {

            } else if (choice.equalsIgnoreCase("N")) {
                System.out.println("Decimal: 'Y'or 'N'");
                choice = scan.next();
                if (choice.equalsIgnoreCase("Y")) {

                } else if (choice.equalsIgnoreCase("N")) {
                    System.out.println("Hexadecimal: 'Y' or 'N'");
                    choice = scan.next();
                    if (choice.equalsIgnoreCase("Y")) {

                    } else if (choice.equalsIgnoreCase("N")) {
                        System.out.println(currentNumber);
                    }
                }
            }
        }
    }

    public void switchUnitsMode() {
        System.out.print("Degrees : 'Y' or 'N'");
        String choice = scan.next();
        if (choice.equalsIgnoreCase("Y")) {
            double degree = Math.toDegrees(currentNumber);
            double regular = currentNumber;
            update(degree);
        } else if (choice.equalsIgnoreCase("N")) {
            System.out.println("Radians: 'Y' or 'N'");
            choice = scan.next();
            if (choice.equalsIgnoreCase("Y")) {
                double radians = Math.toRadians(currentNumber);
                double regular = currentNumber;
                update(radians);
            } else if (choice.equalsIgnoreCase("N")) {
                System.out.print(currentNumber);
            }
        }
    }

}
