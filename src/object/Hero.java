package object;

public class Hero extends Character {
	// アクセス修飾の基本
	// フィールドはすべてprivate
	// メソッドはすべてpublic
	
	private String name;
	private int hp = 100;
	
	// getterメソッド：privateのフィールドを呼び出す為のメソッド（読み込める）
	public String getName() {
		return this.name;
	}
	
	// setterメソッド：ある特定のフィールドに値を代入するだけのメソッド（書き換えられる）
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
		// 検査完了。代入しても大丈夫
		this.name = name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	// 勇者が装備している剣の情報
	Sword sword;
	
	// 戦う
	public void attack(Monster m) {
		System.out.println(this.name + "は" + sword.name + "で攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
	
	// publicを外すとpackage privateを指定したとみなされ同じパッケージに属するクラスからの呼び出しのみ可能になる
	void sleep() {
//		this.hp = 100;
		this.setHp(100);
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec) {
//		this.hp += sec;
		this.setHp(this.getHp() + sec);
		System.out.println(this.name +  "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した！");
	}
	public void slip() {
//		this.hp -= 5;
		this.setHp(this.getHp() - 5);
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
	
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
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
