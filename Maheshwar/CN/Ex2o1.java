import java.util.*;
import java.io.*;
public class Ex2o1 {
  public static void main(String[] args) throws IOException {
   // FileOutputStream f=new FileOutputStream("file.txt");
    BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the text and put @ to end");
    //char ch;
    String str;
    while(true){
    str=sc.nextLine();
    writer.write(str);
    writer.close();
    // ch=(char)sc.next().charAt(0);
    // if(ch!='@'){
    //     f.write(ch);
    // }else{
    //     break;
    // }
    //f.close();
    //}
    System.out.println("the file is sucessfully saved");
    
  }
}
}