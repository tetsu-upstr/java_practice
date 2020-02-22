package collection;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		// ArrayListを準備
		ArrayList<String> names = new ArrayList<String>();
		// addで挿入
		names.add("たなか");
		names.add("すずき");
		names.add("さいとう");
	
		System.out.println(names.get(0));
		
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		points.add(27);
		// setで上書き
		points.set(1,99);
		int k = points.size();
		for (int i : points) {
			System.out.println(i);
		}
		System.out.println("格納されている要素数は" + k);
	}
}