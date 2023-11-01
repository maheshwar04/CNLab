import java.util.Scanner;

public class ThreadClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Create two threads
        Thread calculatorThread = new SumCalculatorThread(num1, num2);
        Thread printerThread = new SumPrinterThread(num1, num2);
        
        // Start the threads
        calculatorThread.start();
        printerThread.start();
    }
}

class SumCalculatorThread extends Thread {
    private int num1, num2;

    public SumCalculatorThread(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    }
}

class SumPrinterThread extends Thread {
    private int num1, num2;

    public SumPrinterThread(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        System.out.println("Numbers entered: " + num1 + " and " + num2);
    }
}