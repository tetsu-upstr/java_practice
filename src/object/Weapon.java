package object;

public class Weapon extends Item {
	public Weapon() {
		// 引数がないコンストラクタは呼び出しができない
		// super()の呼び出しに明示的に引数を設定しておく
		super("ななしの剣");
	}
}
