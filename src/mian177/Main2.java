package mian177;

	public class Main2 {
		public static int sub(int a, int b) {
		return a - b;
	}
	public static void main2(String[] args) {
		MyFunction func = Main::sub;
		
		// インターフェースのメソッドで呼び出し
		int a = func.call(5, 3);
		System.out.println("5-3は" + a);
	}
}
