public class Calculator extends Operations {

    private OneNumber one;
    private TwoNumbers two;

    public Calculator() {
    }

    public void runCommandLoop() {
        while (true) {
            System.out.print("Enter a command now. Hurry Up!: ");
            String command = scan.next();

            if (!isError) {
                if (command.equalsIgnoreCase("exit")) {
                    System.out.print("Thanks for calculating with us!");
                    break;
                }

                if (command.equalsIgnoreCase("clear")) {
                    calc.clear();
                }

                if (command.equalsIgnoreCase("invert")) {
                    calc.invertSign();
                }

                if (command.equalsIgnoreCase("inverse")) {
                    calc.inverse(currentNumber);
                }

                if (command.equalsIgnoreCase("save")) {
                    calc.remember();
                }

                if (command.equalsIgnoreCase("recall")) {
                    calc.recall();
                }

                if (command.equalsIgnoreCase("save2")) {
                    calc.addToNumInMemory();
                }

                if (command.equalsIgnoreCase("mode")) {
                    calc.switchDisplayMode();
                }

                if (command.equalsIgnoreCase("units")) {
                    calc.switchUnitsMode();
                }

                if (command.equalsIgnoreCase("add")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // read second number
                        secondNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.add(firstNumber, secondNumber);
                    } else {
                        firstNumber = currentNumber;
                        secondNumber = input.nextDouble();
                        calc.add(firstNumber, secondNumber);
                    }
                }

                if (command.equalsIgnoreCase("subtract")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // read second number
                        secondNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.subtract(firstNumber, secondNumber);
                    } else {
                        firstNumber = currentNumber;
                        secondNumber = input.nextDouble();
                        calc.subtract(firstNumber, secondNumber);
                    }


                }

                if (command.equalsIgnoreCase("multiply")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // read second number
                        secondNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.multiply(firstNumber, secondNumber);
                    } else {
                        firstNumber = currentNumber;
                        secondNumber = input.nextDouble();
                        calc.multiply(firstNumber, secondNumber);
                    }
                }

                if (command.equalsIgnoreCase("divide")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // read second number
                        secondNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.divide(firstNumber, secondNumber);
                    } else {
                        firstNumber = currentNumber;
                        secondNumber = input.nextDouble();
                        calc.divide(firstNumber, secondNumber);
                    }
                }
                if (command.equalsIgnoreCase("square")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.square(firstNumber);
                    } else {
                        firstNumber = currentNumber;
                        calc.square(firstNumber);
                    }
                }

                if (command.equalsIgnoreCase("round")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.round(firstNumber);
                    } else {
                        firstNumber = currentNumber;
                        calc.round(firstNumber);
                    }
                }

                if (command.equalsIgnoreCase("up")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.roundUp(firstNumber);
                    } else {
                        firstNumber = currentNumber;
                        calc.roundUp(firstNumber);
                    }
                }

                if (command.equalsIgnoreCase("down")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.roundDown(firstNumber);
                    } else {
                        firstNumber = currentNumber;
                        calc.roundDown(firstNumber);
                    }
                }

                if (command.equalsIgnoreCase("log")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.log(firstNumber);
                    } else {
                        firstNumber = currentNumber;
                        calc.log(firstNumber);
                    }
                }

                if (command.equalsIgnoreCase("power")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // call the add method on calc and display
                        secondNumber = input.nextDouble();
                        calc.power(firstNumber, secondNumber);
                    } else {
                        firstNumber = currentNumber;
                        secondNumber = input.nextDouble();
                        calc.power(firstNumber, secondNumber);
                    }
                }

                if (command.equalsIgnoreCase("sin")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.sin(firstNumber);
                    } else {
                        firstNumber = currentNumber;
                        calc.sin(firstNumber);
                    }
                }

                if (command.equalsIgnoreCase("invsin")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.asin(firstNumber);
                    } else {
                        firstNumber = currentNumber;
                        calc.asin(firstNumber);
                    }
                }

                if (command.equalsIgnoreCase("cos")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.cos(firstNumber);
                    } else {
                        firstNumber = currentNumber;
                        calc.cos(firstNumber);
                    }
                }

                if (command.equalsIgnoreCase("invcos")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.acos(firstNumber);
                    } else {
                        firstNumber = currentNumber;
                        calc.acos(firstNumber);
                    }
                }

                if (command.equalsIgnoreCase("tan")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.tan(firstNumber);
                    } else {
                        firstNumber = currentNumber;
                        calc.tan(firstNumber);
                    }
                    // and on and on
                }

                if (command.equalsIgnoreCase("invtan")) {
                    if (currentNumber == 0) {
                        firstNumber = input.nextDouble();
                        // call the add method on calc and display
                        calc.atan(firstNumber);
                    } else {
                        firstNumber = currentNumber;
                        calc.atan(firstNumber);
                    }
                }
            } else {
                System.out.println("Error! Clear Error!");
                if (command.equalsIgnoreCase("clear")) {
                    calc.clear();
                }
            }
        }
    }
}
