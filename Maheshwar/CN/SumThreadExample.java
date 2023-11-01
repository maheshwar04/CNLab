import java.util.Scanner;

public class SumThreadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        Thread thread1 = new Thread(new SumCalculator(num1, num2));
        Thread thread2 = new Thread(new SumPrinter(num1, num2));
        
        thread1.start();
        thread2.start();
    }
}

class SumCalculator implements Runnable {
    private int num1, num2;

    public SumCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    }
}

class SumPrinter implements Runnable {
    private int num1, num2;

    public SumPrinter(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        System.out.println("Numbers entered: " + num1 + " and " + num2);
    }
}