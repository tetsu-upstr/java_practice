package object;

public class Main {
	public static void main(String[] args) {
		// ソードインスタンスを生成
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		
		// クラス名 変数名 = new クラス名();
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		
		Hero.money = 100;
		
		h1.setName("ミナト");
		h2.setName("アサカ");
		
		Dancer d = new Dancer();
		d.setName("アイカ");
		
//		SuperHero sh = new SuperHero();
		Character c = new SuperHero();
//		c.setName("スーパーミナト");
		
		c.run();

		h1.sit(5);
		h1.slip();
		
		Slime s1 = new Slime();
		Monster m1 = new Slime();
		s1.run();
		m1.run();
		
		
		// フィールドに初期値を設定
		h1.sword = s;
		System.out.println("勇者" + h1.getName() + "を生み出しました！");
		System.out.println("勇者" + h2.getName() + "を生み出しました！");
		System.out.println("ダンサー" + d.getName() + "を生み出しました！");
		System.out.println("スーパー勇者" + c.getName() + "を生み出しました！");
		System.out.println("現在の武器は" + h1.sword.name);
		
		System.out.println(h1.toString());
		System.out.println(Hero.money);
		
		// お化けキノコを生成・初期化
//		Matango m1 = new Matango(0);
//		m1.hp = 50;
//		m1.suffix = 'A';
		
		// お化けキノコ2匹目
//		Matango m2 = new Matango(m2.suffix);
//		m2.hp = 48;
//		m2.suffix = 'B';
		
		// 勇者のメソッドの呼び出し
//		h1.attack());
		h1.run();
	}
}
