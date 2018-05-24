package jp.ac.uryukyu.ie.e175751;
import java.util.Scanner;
public class ChatBot{
    public static void main(String[] args){
	String charName ="アスナ";
	System.out.println (charName +": 「おはよう、キリト君」");
	String input = "";
	Scanner in = new Scanner(System.in);
	int num = 0;
	while(!(input.equals("bye."))){
	    num++;
	    System.out.println("(入力待ち)"); 
	    input = in.nextLine();
	    answer(input,charName);
	    if (input.equals("bye.")==true){
		break;
	    }
	}

		System.out.println("今日はキリト君と"+ num +"回しか話してないよ");
    }
    public static void answer(String input , String charName){
	if (input.equals("アスナ好きだよ")==true){
	    System.out.println(charName +"「もぉ〜、キリト君ってば〜」");
	}else if(input.equals("bye.")==true){
	    System.out.println(charName +"「じゃ、ALOでまた会おうっか」");
	}else if(input.equals("キバオウ")==true){
	    System.out.println(charName +"「なんでや」");
	 }else{
	     System.out.println(charName +"「へへっ、そうなんだ」");
	    return;
	 }
    }
}
	

