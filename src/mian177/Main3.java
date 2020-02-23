package mian177;
import java.util.function.*;

public class Main3 {
	public static void main(String[] args) {
		// 2つの引数の差を求める処理の実体を生み出し、代入する
		IntBinaryOperator func = (int a, int b) -> {
			return a-b;
		};
		int a = func.applyAsInt(5, 3);
		System.out.println("5-3は" + a);
	}
}

// 関数の定義と実体の即自生成 
// ラムダ式の構文
//
// (型 引数1, 型 引数2, ...) -> {
//	処理1;
//	処理2;
//	
//	return　戻り値;
// }
