//Maheshwar Nag
//2141014002
//N
import java.io.*;
public class Ex2o3 {
    public static void main(String[] args) {
   String filepath="file.txt";
   long startTime=System.currentTimeMillis();
   int ch;
   try{
    FileInputStream fin=new FileInputStream(filepath);
    while((ch=fin.read())!=-1){}
    }
    catch(IOException e){
        System.out.println(e);
    }
    long endTime=System.currentTimeMillis();
    long duration =endTime-startTime;
    System.out.println("Time take without buffering "+duration+" milliseconds");
   }
  }
