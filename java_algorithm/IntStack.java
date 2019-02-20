import java.lang.RuntimeException;

public class IntStack{
  private int max;    //スタックの容量
  private int ptr;    //スタックポインタ
  private int[] stk;  //スタック本体

  //実行の例外処理:スタックが空
  public class EmptyIntStackException extends RuntimeException{
    public EmptyIntStackException(){}
  }


  //実行の例外処理:スタックが満杯
  public class OverFlowIntStackExption extends RuntimeException{
    public OverFlowIntStackExption(){}
  }

  //コンストラクタ
  public IntStack(int capacity){
    ptr = 0;
    max = capacity;
    try{
      stk = new int[max];  //スタック本体用の配列を生成
    }  catch (OutOfMemoryError e){
      max = 0;
    }
  }

  //スタックにxをpush
  public int push(int x) throws OverFlowIntStackExption{
    if (ptr >= max)
      throw new OverFlowIntStackExption();
    return stk[ptr++] = x;
  }

  //スタックからデータをpop
  public int pop() throws EmptyIntStackException{
    if (ptr <= 0)
      throw new EmptyIntStackException();
    return stk[--ptr];
  }

  //スタックからデータをピーク(覗き見)
  public int peek() throws EmptyIntStackException{
    if (ptr <= 0)              //データ空の時
      throw new EmptyIntStackException();
    return stk[ptr - 1];
  }

  //スタックからある値xを探す
  public int indexOf(int x){
    for (int i = ptr - 1; i >= 0; i--)
      if (stk[i] == x)
        return i;  //探索成功
    return -1;   //探索失敗
  }

  //スタックを空にする
  public void clear(){
    ptr = 0;
  }

  //スタックの容量を返す
  public int capacity(){
    return max;
  }

  //スタックに積まれているデータ数を返す
  public int size(){
    return ptr;
  }

  //スタックは空いているか
  public boolean isEmpty(){
    return ptr <= 0;
  }

  //スタックは満杯か
  public boolean isFull(){
    return ptr >= max;
  }

  public void dump(){
    if(ptr <= 0)
      System.out.println("スタックは空です");
      else{
        for (int i=0; i<ptr; i++)
          System.out.print(stk[i] + " ");
        System.out.println();
      }
  }
}
