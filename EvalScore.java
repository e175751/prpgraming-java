/* 複数のint型要素を用意して、中身が偶数だった時は数値を出力し、奇数だった時は「奇数」と出力するプログラム。 */
/* 100点満点採点した学生の成績をチェックし、A~F判定を返す関数。 */
package jp.ac.uryukyu.ie.e175751;

public class EvalScore {
    public static void main(String[] args) {
        int[] scores = {100, 70, 50};
        int i;
        char answer;
        for(i=0; i<scores.length; i++){
            answer = eval(scores[i]);
            System.out.println(scores[i] + " -> " + answer);
        }
    }

    public static char eval(int score) {
        char answer = 'F';
        if( score >= 90 ){
            answer = 'A';
        }else if( score >= 80 ){
            answer = 'B';
        }else if( score >= 70 ){
            answer = 'C';
        }else if( score >= 60 ){
            answer = 'D';
        }else{
            answer = 'F';
        }
        return answer;
    }
}