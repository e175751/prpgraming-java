import java.util.Scanner;

class ReverseArray{

  public static void swap(int[] a , int top , int back){
    //引数変換を行う
    int t = a[top];
    a[top] = a[back];
    a[back] = t;
  }

  public static void revers(int[] a){
    //配列引数を並べ換える
    for(int i=0; i<a.length/2; i++){
      swap(a , i , a.length - i - 1);
    }
  }

  public static void main(String[] args){
    //ユーザーから入力を貰い、入れ替えた配列を表示する
    Scanner scan = new Scanner(System.in);
    System.out.print("要素数は :");
    int num = scan.nextInt();

    int[] x = new int[num];
    for(int i=0; i<num; i++){
      System.out.print("x["+i+"]:");
      x[i] = scan.nextInt();
    }

    revers(x);
    System.out.println("要素の並べ替えは終わりました");
    for(int j=0; j<num; j++){
      System.out.println("x["+j+"]="+x[j]);
    }
  }
}
