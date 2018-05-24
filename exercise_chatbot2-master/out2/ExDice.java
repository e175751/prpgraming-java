public class ExDice extends Dice {
    private int valMax; //多面ダイスの「面の数」
    public ExDice(int valMax){
        super(valMax); //親クラスのDice(int)コンストラクタを利用
        this.valMax = valMax;
    }

    public int getValMax(){ return valMax; }

    //play()メソッドを上書き(Override)して、
    //ExDiceオブジェクト生成時の最大値valMaxを元に、乱数生成。
    // @Override: 教科書p.426。詳細は後日。
    @Override
	public void play(){
        int value = (int)(Math.random() * this.getValMax()) + 1;

        //親クラスのメソッドを利用して、値を保存。
        //今回のコードでは super. で「親クラスのメソッド」であることを明示しているが、
        // 継承したExDiceクラスでも同じメソッドを使えるので、
        // 省略して書いてもかまわない。
        super.setVal(value);
        //setVal(value); //これもok。
        //this.setVal(value); //これもok。
    }
}