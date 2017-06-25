package sort;

/**
 * 直接插入排序
 * 将前两个元素按照序列排序，依次将其余元素插入已排序列
 * @author Ranger
 *
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] a = { 12, 20, 5, 16, 15, 1, 30, 45, 23, 9 };
		insertSort(a);
		for (int arr : a) {
			System.out.print(arr + " ");
		}
	}

	private static void insertSort(int[] a) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
	}
}
