//Maheshwar Nag
//2141014002
//N

import java.io.*;
public class Ex2o2 {
    public static void main(String[] args) {
   String filepath="file.txt";
   long startTime=System.currentTimeMillis();
   int ch;
   try{
    FileInputStream fin=new FileInputStream(filepath);
    BufferedInputStream bin=new BufferedInputStream(fin);
    while((ch=bin.read())!=-1){}
    }
    catch(IOException e){
        System.out.println(e);
    }
    long endTime=System.currentTimeMillis();
    long duration =endTime-startTime;
    System.out.println("Time take with buffering "+duration+" milliseconds");
   }
  }
