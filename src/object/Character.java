package object;

public abstract class Character {
	// 抽象クラス
	private String name;
	int hp;
	
	public String getName() {
		return this.name;
	}
	
	public void run() {
		System.out.println(this.getName() + "は逃げ出した！");
	}
	public abstract void attack(Monster m);
}
