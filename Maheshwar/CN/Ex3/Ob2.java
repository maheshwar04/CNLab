public class Ob2 {
       public static void main(String[] args) {
            Thread workThread=new Thread(new worker());
            workThread.start();
       try{
          workThread.join();
          int result=worker.getResult();
          System.out.println("Result from the Thread : "+result);
       }catch(Exception e){
              e.printStackTrace();
       }
}
}
class worker implements Runnable{
         static int  result;
         public void run(){
            try{
                Thread.sleep(2000);
            }catch(Exception e){
              e.printStackTrace();
            }
            result=42;
}    
 public static  int getResult(){
       return result;
 }   
}

