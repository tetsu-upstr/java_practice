package code5_5;

public class practice5_2 {
	public static void main(String[] args) {
		email();
	}
	
	public static void email() {
		String title = "テスト件名";
		String address = "test@gmail.com";
		String text = "テストを送信しました";
		
		System.out.println( address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
}
