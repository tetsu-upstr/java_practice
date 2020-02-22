package String;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "";
		
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		// 大文字と小文字を区別せず等しいか調べる
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() +"です。");
		
		if (s4.isEmpty()) {
			System.out.println("s4は空文字です。");
		}
		
		if (s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		if (s2.endsWith("Java")) {
			System.out.println("文字列s2は、Javaが末尾にあります");
		}
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
		
		// 文字列連結
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append("勉強").append("JAVA");
		}
		String s = sb.toString();
		System.out.println(s);
		
		// 現在日時の表示
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(160070542582L);
		System.out.println(past);
	}
}
