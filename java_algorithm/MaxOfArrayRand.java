import java.util.Random;
import java.util.Scanner;
class MaxOfArrayRand{

    static int  maxof(int[] a){
	//引数配列の中で一番大きい数字を調べる
	int max = a[0];
	for(int j=0;j<a.length;j++){
	    if(a[j] > max){
		max=a[j];
	    }
	    return max;
	}

    public static void main(String[] args){
	//乱数値を入力し、大きいやつを表示する
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);

	System.out.println("身長の最大値を求めます");
	System.out.print("人数は:");
	int num = scan.nextInt();
	System.out.println("身長は次のようになっています");
	int[] height = new int[num];

	for(int i=0;i<num;i++){
	    height[i] = 100 + rand.nextInt(90);
	    System.out.println("height[" + i + "]" + height[i]);
	}

	System.out.println("最大値は" + maxof(height) + "です");

    }
}
