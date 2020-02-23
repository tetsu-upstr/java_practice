package jenerics;

//public class Pocket {
//	private Object data;
//	public void put(Object d) {
//		this.data = d;
//	}
//	public Object get() {
//		return this.data;
//	}
//}

// ジェネリクスを使ったPocketクラス
public class Pocket<E> {
	private E data;
	public void put(E d) {
		this.data = d;
	}
	public E get() {
		return this.data;
	}
 }

// class Pocket<E>の「E」は、仮の引数。<String>や<int>などに置換して利用する