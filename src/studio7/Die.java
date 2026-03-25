public class Die {
    private int n;
    public Die(int n){
        this.n=n;
    }
    public int diceRoll(){
        return (int)(Math.random()*n+1);
    }
    public static void main(String args[]){
        Die die1 = new Die(6);
        Die die2 = new Die(4);
        System.out.println(die1.diceRoll());
        System.out.println(die2.diceRoll());
    }
}