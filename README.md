# JavaArgumentAndReturnValue
クラスで引数と戻り値の使い方

## 処理
Itemクラスを使い、リンゴやオレンジの合計を算出。

## コード
```
public class Sample27 {

	public static void main(String[] args) {
		Item apple = new Item(120, 15);
		System.out.println("リンゴの合計金額は" + apple.gokei() + "円です。");
		Item orenge = new Item(85, 32);
		System.out.println("オレンジの合計金額は" + orenge.gokei() + "円です。");

	}

}

class Item {
	private int tanka;
	private int kosu;

	public Item(int tankax, int kosuy) {
		tanka = tankax;
		kosu = kosuy;
	}

	public int gokei() {
		return tanka * kosu;
	}

}
```

## 出力結果  
```
リンゴの合計金額は1800円です。
オレンジの合計金額は2720円です。
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
