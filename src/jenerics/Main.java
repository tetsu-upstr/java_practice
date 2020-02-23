package jenerics;

//public class Main {
//	public static void main(String[] args) {
//		Pocket p = new Pocket();
//		p.put("1192");
//		String s = (String) p.get();
//		System.out.println(s);
//	}
//}

// ジェネリクスを使ったキャスト不要のMainクラス
public class Main {
	public static void main(String[] args) {
		Pocket<String> p = new Pocket<String>();
		p.put("1192");
		String s = p.get();
		System.out.println(s);
	}
}