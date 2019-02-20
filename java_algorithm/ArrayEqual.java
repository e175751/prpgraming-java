import java.util.Scanner;

class ArrayEqual{
    static boolean equals(int[]a,int[]b){
	     if(a.length != b.length){
	      return false;
	     }
	       for(int i=0;i<a.length; i++){
	        if(a[i] != b[i]){
		        return false;
          }
        }
            return true;
      }

    public static void main(String[] args){
	     Scanner scan = new Scanner(System.in);

	      System.out.println("配列Aの要素");
	       int anum = scan.nextInt();

	        int[]a = new int[anum];
	         for(int i=0; i<anum; i++){
	            System.out.print("A["+ i +"]:");
	             a[i] = scan.nextInt();
	            }

	System.out.println("配列Bの要素");
	int bnum = scan.nextInt();

	int[] b = new int[bnum];
	for(int j=0; j<bnum; j++){
	    System.out.print("B["+ j +"]:");
	    b[j]  = scan.nextInt();
	}
	System.out.println("配列AとBは"+(equals(a,b) ? "等しい" : "等しくない"));
    }
}
