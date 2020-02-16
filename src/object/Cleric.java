package object;
import java.util.*;

public class Cleric {
	String name = "トム";
	int hp = 50;
	int mp = 10;
	final int MAXHP = 50;
	final int MAXMP = 10;
	
	public void serfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = this.MAXHP;
		System.out.println(this.name + "のHPが最大まで回復した！");
	}
	public int pray(int sec) {
		System.out.println(this.name + "は、" + sec + "秒間天に祈った！");
		
		// 回復量を乱数を用いて決定
		int recover = new Random().nextInt(3) + sec;
		
		// 実際の回復量を計算
		int recoverActual = Math.min(this.MAXMP - this.mp, recover);
		
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した！");
		return recoverActual;
	}
}
