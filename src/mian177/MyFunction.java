package mian177;

// MyFunction型を使えるようにする為にSAMインターフェースを定義する
public interface MyFunction {
	public abstract int call(int x, int y);
}

// インターフェース名やメソッド名は自由に決めていい