package calcapp.main;
// import文はパッケージ名の入力補助の役割
import calcapp.logics.CalcLogic;

public class Calc {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		
		// 別パッケージからメソッドを呼び出す場合の書き方
		// パッケージ名.クラス名.メソッド(引数, 引数);
		// importを使用すれば完全限定クラス名がなくてもOK
		int total = CalcLogic.tasu(a, b);
		int delta = calcapp.logics.CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
	
}
