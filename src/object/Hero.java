package object;

public class Hero {
	String name;
	int hp = 100;
	// 勇者が装備している剣の情報
	Sword sword;
	
	// 戦う
	public void attack(Matango m) {
		System.out.println(this.name + "は" + sword.name + "で攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name +  "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した！");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
	
	// newで生成された直後に自動で実行される処理メソッド（コンストラクタ）
	// コンストラクタ条件1.メソッド名がクラス名と完全に等しい
	// コンストラクタ条件2.メソッド宣言に戻り値が記述されていない
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	public Hero() {
		// JVMにコンストラクタを呼び出すように依頼する
		this("ダミー");
	}
}
