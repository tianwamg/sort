package sort;

import java.util.Random;

/**
 * 选择第一个数为key，小于key的放在左边，大于key的放在右边
 * 递归的将jey两边的数都按照前一步进行，直至递归结束
 * @author Ranger
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		// int[] a = { 12, 20, 5, 16, 15, 1, 30, 45, 23, 9 };
		int[] a = new int[6000];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(6000) + 1;
		}
		int low = 0;
		int high = a.length - 1;
		long s = System.currentTimeMillis();

		quickSort(a, low, high);
		long e = System.currentTimeMillis();
		System.out.println("快速排序耗时:" + (e - s) + " ms");
		// for (int i = 0; i < a.length; i++) {
		// System.out.print(a[i] + " ");
		// }
	}

	public static void quickSort(int[] arr, int head, int tail) {
		int i = head;
		int j = tail;
		if (i > j) {
			return;
		}
		int key = arr[i];
		while (i < j) {
			while (i < j && key <= arr[j]) {
				j--;
			}
			if (i < j) {
				arr[i++] = arr[j];
			}
			while (i < j && key >= arr[i]) {
				i++;
			}
			if (i < j) {
				arr[j--] = arr[i];
			}
		}
		arr[j] = key;
		quickSort(arr, head, j - 1);
		quickSort(arr, j + 1, tail);

	}
}
