import java.util.Scanner;

class IntStackTester{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    IntStack s = new IntStack(64);

    while (true){
      System.out.println("現在のデータ数:" + s.size() + "/" + s.capacity());

      System.out.print("(1)push (2)pop (3)peek (4)dump (0)end  ");

      int menu = scan.nextInt();
      if(menu==0)break;

      int x;
      switch (menu) {
        case 1:
          System.out.print("データ:");
          x = scan.nextInt();
          try{
            s.push(x);   //プッシュ
          } catch (IntStack.OverFlowIntStackExption e) {
            System.out.println("スタックが満杯です");
          }
            break;

        case 2:
          try{
            x = s.pop();   //ポップ
            System.out.println("ポップしたデータは" + x + "です");
          }  catch (IntStack.EmptyIntStackException e) {
            System.out.println("スタックは空です");
          }
          break;

          case 3:
            try{
              x=s.peek();  //ピーク
              System.out.println("ピークしたデータは"+ x + "です");
            } catch (IntStack.EmptyIntStackException e) {
              System.out.println("スタックは空です");
            }
            break;

          case 4:
            s.dump();   //ダンプ
            break;
      }
    }
  }
}
