import java.util.Scanner;
class SeqSearch{
  static int seqSearch(int[] a,int n, int key){
    int i=0;

    while(true){
      if(i==n){
        return -1;   //探索失敗
      }
      if(a[i] == key){
        return i;
      }
      i++;
    }
  }

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.print("要素数は:");
    int num = scan.nextInt();
    int[] x = new int[num]; //要素数の配列

    for(int i=0; i<num; i++){
      System.out.print("x["+ i +"]:");
      x[i]=scan.nextInt();
    }
    System.out.print("探す値は:");
    int ky = scan.nextInt();

    int value = seqSearch(x,num,ky);
    if(value == -1){
      System.out.println("その数はありませんでした");
    }else{
      System.out.println("その数はx["+ value +"]にあります");
    }

  }
}
