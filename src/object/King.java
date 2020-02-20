package object;

public class King {
	void talk(Hero h) {
	//	System.out.println("ようこそ我が国へ、勇者" + h.name + "よ。");
	//  getName()経由でprivateのString nameへアクセス
		System.out.println("ようこそ我が国へ、勇者" + h.getName() + "よ。");	
	}
}
