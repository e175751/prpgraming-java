import java.util.Scanner;

class SeqSearchSen{

  //番兵法を使う
  static int seqSearchsen(int[] a, int n, int key){
    a[n] = key;
    for(int j=0; j<n; j++){
      if(a[j] == key){
        return j;
      }
    }
    return -1;
  }

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.print("要素数は:");
    int num = scan.nextInt();

    int[] x = new int[num+1];

    for(int i=0; i<num; i++){
      System.out.print("x["+ i +"]:");
      x[i] = scan.nextInt();
    }

    System.out.print("探す値は:");
    int ky = scan.nextInt();

    int result = seqSearchsen(x, num, ky);
    if(result == -1){
      System.out.println("その値は存在しませんでした");
    }else{
      System.out.println("その値はx["+result+"]にあります");
    }
  }
}
