import java.util.*;
import java.io.*;
public class SumRun{
    static class SumThread implements Runnable{
            int a;
            int b;
    public SumThread(int a,int b){
         this.a=a;
         this.b=b;
    }
    public void run(){
         int sum=a+b;
         System.out.println("Sum is : "+sum);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st n.o");
        int a=sc.nextInt();
        System.out.println("Enter 2nd n.o");
        int b=sc.nextInt();
        sc.close();
        SumThread t1=new SumThread(a,b);
        Thread t2=new Thread(t1);
        t2.start();
        
    }
    }
}
