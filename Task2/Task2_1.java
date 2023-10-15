package Task2;

public class Task2_1 {
	
	
	public static void mergeSort(int[] arr, int[] temp, int low, int high) {
		if (low < high) {
			int mid = (low + high)/2;
			mergeSort(arr, temp, low, mid); // sort mảng con bên trái
			mergeSort(arr, temp, mid+1, high);  // sort mảng con bên phải
			merge(arr, temp, low, mid, high);  // gộp 2 mảng con
		}
	}
	
	
	private static void merge(int[] arr, int[] temp,  int low, int mid, int high) {
		for (int i = low; i <= high; i++) {
			temp[i] = arr[i];
		}
		int i = low;  // pointer chạy mảng con bên trái
		int j = mid + 1;  // pointer chạy mảng con bên phải
		int idx = low;  
		while (i <= mid && j <= high) {
			if (temp[i] <= temp[j]) {
				arr[idx] = temp[i];
				i++;
			}
			else {
				arr[idx] = temp[j];
				j++;
			}
			idx++;
		}
		while (i <= mid) {
			arr[idx] = temp[i];
			idx++; i++;
		}
		
		while (j <= high) {
			arr[idx] = temp[j];
			idx++; j++;
		}
		
		

	}
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr1 = {4,2,6,8,1,5};
		int[] temp = new int[arr1.length];
		System.out.print("Array Before Sorting: ");
		display(arr1);
		System.out.println();
		mergeSort(arr1, temp , 0, arr1.length-1);
		System.out.print("Array After Sorting: ");
		display(arr1);
		
	}
}
