import java.util.Scanner;

class maxOf{
  public static int maxof(int[] a){
    int max = a[0];
    for (int i = 1; i < a.length; i++)
      if(a[i]>max)
        max=a[i];
    return max;
  }

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("今から身長を調べます");
    System.out.print("人数は？");
    int num = scan.nextInt();

    int[] height = new int[num];
    for(int i=0; i<num; i++){
      System.out.print("height["+i+"]:");
      height[i] = scan.nextInt();
    }
    System.out.println("最大値は"+maxof(height)+"です");
  }
}
