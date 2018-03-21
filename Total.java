/**
 *
 * @author xekid78
 *
 */
public class Total {

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
