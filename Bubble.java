package sort;

/**
 * 冒泡排序 1.将序列中的元素两两比较，将最大的元素放在后面 2.将剩余元素进行两两比较，将最大的元素放在后面
 * 
 * @author Ranger
 *
 */
public class Bubble {

	public static void main(String[] args) {
		int[] a = { 12, 20, 5, 16, 15, 1, 30, 45, 23, 9 };
		bubbleSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		Bubble b=new Bubble();
		b.sort();
	}

	private static void bubbleSort(int[] a) {
		// TODO Auto-generated method stub
		int length = a.length;
		int temp = 0;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public void sort() {
		int[] a = { 3, 2, 8, 5, 4, 6, 9, 1 };
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		
	}
}
