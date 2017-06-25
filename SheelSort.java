package sort;

/**
 * 希尔排序
 * 缩小增量排序
 * @author Ranger
 *
 */
public class SheelSort {

	public static void main(String[] args) {
		int[] a = { 12, 20, 5, 16, 15, 1, 30, 45, 23, 9 };
		shellSort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static void shellSort(int[] a) {
		int d = a.length / 2;// 设置增量
		int temp;
		while (d != 0) {
			for (int i = 0; i < a.length; i++) {
				for (int j = i + d; j < a.length; j += d) {
					if (a[j - d] > a[j]) {
						temp = a[j - d];
						a[j - d] = a[j];
						a[j] = temp;
					}
				}
			}
			d /= 2;
		}
	}
}
