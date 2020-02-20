package object;

public class SuperHero extends Hero {

	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	// スーパークラスに同じメソッドがあってもオーバーライドで上書きできる
	public void run() {
		System.out.println(this.getName() + "は撤退した！");
	}
	public void attack(Monster m) {
		// 親インスタンスのメソッドを呼び出す
		super.attack(m);
		if(this.flying) {
			super.attack(m);
		}
	}
}
