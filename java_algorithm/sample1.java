//import java.util.Scanner;

public class sample1{
  public static void main(String[] args){
    int a[]  = new int[5]; //配列宣言

    a[1] = 37;
    a[2] = 51;
    a[4] = a[1]*2;

    for(int i=0; i<a.length; i++)
      System.out.println("a["+i+"] =" + a[i]);
  }
}
