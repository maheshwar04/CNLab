//By Thread
// public class Ex3o1 extends Thread {
//      public void run(){
//         System.out.println("Running");
//      }
//     public static void main(String[] args) {
//        Ex3o1 t1 = new Ex3o1();
//         t1.start();   
//     }
// }
//By Runnable Interface
// public class Ex3o1 implements Runnable {
//      public void run(){
//         System.out.println("Running");
//      }
//     public static void main(String[] args) {
//         Thread t1 = new Thread(new Ex3o1());
//         t1.start();   
//     }
// }
//                   By priority
// public class Ex3o1 extends Thread {
//      public void run(){
//         System.out.println("Running : "+Thread.currentThread().getPriority());
//      }
//     public static void main(String[] args) {
//        Ex3o1 t1 = new Ex3o1();
//        Ex3o1 t2 = new Ex3o1();
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MAX_PRIORITY);
//        t1.start(); 
//        t2.start();  
//     }
// }
public class Ex3o1 extends Thread {
     public void run(){
        System.out.println("Running Thread is : "+ Thread.currentThread().getId());
     }
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
        Ex3o1 t1 = new Ex3o1();
        t1.start();  
        } 
    }
}
