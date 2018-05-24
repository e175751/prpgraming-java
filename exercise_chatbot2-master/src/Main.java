import java.util.Scanner;
import jp.ac.uryukyu.ie.tnal.*; //利用したいパッケージを指定。

public class Main {
    public static void main(String[] args){
        String[] dataset = {"おはよう\tおはようキリト君",
                "好きだよアスナ\tもお〜、キリト君ったら〜",
                "other\tえー、そうなの〜",
                "bye.\tうん、またALOで会おうね"};

        String input, reply; //botへの入力文、応答文を保存するための変数
        Scanner in = new Scanner(System.in);
        int count = 0;

        Chatbot bot = new Chatbot("アスナ", dataset); //インスタンス生成
        bot.greeting();
        while( true ){
            System.out.println("（入力待ち）");
            input = in.nextLine();
            count++;
            
            reply = bot.reply(input);
            System.out.println(reply);
            if( input.equals("bye.") ){
                break;
            }
        }
        System.out.println("今日はキリト君とたった" + count + "回しか話してないよ？");
    }
}
