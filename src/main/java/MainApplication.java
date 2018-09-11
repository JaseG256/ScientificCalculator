public class MainApplication {

    public static void main(String[] args) {

        System.out.println("Welcome to my calculator!");

        Calculator calculator = new Calculator();
        calculator.runCommandLoop();
    }
}
