public class Exec {
    public static void main(String[] args){
        ExDice exdice = new ExDice(100);
	exdice.play();
        System.out.println(exdice.getVal());
    }
}