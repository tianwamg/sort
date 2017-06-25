package sort;

import java.util.Random;

/**
 * 常见算法的比较
 * 
 * @author Ranger
 *
 */
public class Compare {

	// 冒泡排序
	public static void Bubble(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	// 快速排序
	public static void Quick(int[] a, int low, int high) {
		int start = low;
		int end = high;
		if (start > end) {
			return;
		}
		int key = a[start];
		while (start < end) {
			while (start < end && key <= a[end]) {
				end--;
			}
			if (start < end) {
				a[start++] = a[end];
			}
			while (start < end && key >= a[start]) {
				start++;
			}
			if (start < end) {
				a[end--] = a[start];
			}
		}
		a[end] = key;
		Quick(a, low, end - 1);
		Quick(a, end + 1, high);
	}

	// 选择排序
	public static void Select(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	// 直接插入排序
	public static void Insert(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
	}

	// 希尔排序
	public static void Sheel(int[] a) {
		int d = a.length / 2;
		while (d != 0) {
			for (int i = 0; i < a.length; i++) {
				for (int j = i + d; j < a.length; j += d) {
					if (a[j - d] < a[j]) {
						int temp = a[j - d];
						a[j - d] = a[j];
						a[j] = temp;

					}
				}
			}
			d /= 2;
		}
	}

	public static void main(String args[]) {
		int[] arr1 = new int[6000];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = new Random().nextInt(6000) + 1;
		}
		long a = System.currentTimeMillis();
		Bubble(arr1);
		long b = System.currentTimeMillis();
		System.out.println("冒泡排序的时间为： " + (b - a) + " ms");
		int[] arr2 = new int[6000];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = new Random().nextInt(6000) + 1;
		}
		long c = System.currentTimeMillis();
		int low = 0;
		int high = arr2.length - 1;
		Quick(arr2, low, high);
		long d = System.currentTimeMillis();
		System.out.println("快速排序的时间为： " + (d - c) + " ms");
		int[] arr3 = new int[6000];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = new Random().nextInt(6000) + 1;
		}
		long e = System.currentTimeMillis();
		Select(arr3);
		long f = System.currentTimeMillis();
		System.out.println("选择排序的时间为： " + (f - e) + " ms");
		int[] arr4 = new int[6000];
		for (int i = 0; i < arr1.length; i++) {
			arr4[i] = new Random().nextInt(6000) + 1;
		}
		long g = System.currentTimeMillis();
		Insert(arr4);
		long h = System.currentTimeMillis();
		System.out.println("直接插入排序的时间为： " + (h - g) + " ms");
	}
}
