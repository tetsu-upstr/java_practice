package object;

public class Main {
	public static void main(String[] args) {
		// ソードインスタンスを生成
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		
		// 勇者インスタンスを生成
		// クラス名 変数名 = new クラス名();
		Hero h1 = new Hero("ミナト");
		
		Hero h2 = new Hero();
		
		// フィールドに初期値を設定
		h1.sword = s;
		System.out.println("勇者" + h1.name + "を生み出しました！");
		System.out.println("勇者" + h2.name + "を生み出しました！");
		System.out.println("現在の武器は" + h1.sword.name);
		
		// お化けキノコを生成・初期化
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		// お化けキノコ2匹目
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		// 勇者のメソッドの呼び出し
		h1.attack();
		m1.run();
		m2.run();
		h1.run();
	}
}
