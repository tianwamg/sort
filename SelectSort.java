package sort;
/**
 * ��ѡ������
 * �����������У�����С��Ԫ�ط�����ǰ��
 * ����ʣ������У�����С��Ԫ�ط�����ǰ��
 * �ظ��ڶ�����ֱ��ֻʣ��һ��Ԫ��
 * @author Ranger
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] a = { 12, 20, 5, 16, 15, 1, 30, 45, 23, 9 };
		selectSort(a);
		for(int i:a){
			System.out.print(i+" ");
		}
	}
	
	public static void selectSort(int[] a){
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[i]; 
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}
