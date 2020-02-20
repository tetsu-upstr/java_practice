package object;

public class Matango {
	int hp;
	final int LEVEL = 10;
	public void run() {
		System.out.println("お化けキノコは逃げ出した！");
	}
	
	public void attack(Character c) {
		System.out.println("お化けキノコの攻撃");
		System.out.println("10のダメージ");
		c.setHp() = -10;
	}
}
