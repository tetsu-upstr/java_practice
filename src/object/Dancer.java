package object;

public class Dancer extends Character {
	private String name;
	private int hp;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnull。処理を中断。");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
		}

		this.name = name;
	}
	
	
	public void dance() {
		System.out.println(this.getName() + "は情熱的に踊った！");
	}

	@Override
	public void attack(Monster m) {
		System.out.println(this.getName() + "の攻撃");
		System.out.println("敵に3ポイントのダメージ！");
		m.hp -= 3;
		
	}
	
}
