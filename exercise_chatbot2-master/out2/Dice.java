//クラス例: Dice.java
public class Dice {
    private int val; //カプセル化(14.3節)
    private String color; //カプセル化

    //コンストラクタ
    public Dice(int val){
	this.val = val;
    }

    //コンストラクタのオーバーロード(14.2節)
    public Dice(){
	play();
    }

    //カプセル化によりprivate変数への操作を用意。
    //アクセサメソッドその1。getter+setter for val.
    public int getVal(){ return val; }
    public void setVal(int val){ this.val = val; }

    //アクセサメソッドその2。getter+setter for color.
    public String getColor(){ return color; }
    public void setColor(String color){ this.color = color; }

    public void play(){
	val = (int)(Math.random()*6) + 1;
    }
}