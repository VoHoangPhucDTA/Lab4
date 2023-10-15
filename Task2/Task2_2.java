package Task2;

import java.util.Arrays;
import java.util.Random;

public class Task2_2 {
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int partitionIdx = getPivot_First(arr, low, high);
			quickSort(arr, low, partitionIdx - 1);
			quickSort(arr, partitionIdx + 1, high);
		}
	}

	// 4 2 6 8 1 5
	public static int getPivot_First(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low, j = high;
		while (i < j) {
			while (arr[i] <= pivot && i <= high - 1) {
				i++;
			}
			while (arr[j] > pivot && j >= low + 1) {
				j--;
			}
			if (i < j)
				swap(arr, i, j);
		}
		swap(arr, low, j);
		return j;

	}

	// 4 2 6 8 1 5

	public static int medianOfThree(int[] arr, int low, int high) {
		int mid = low + (high - low) / 2;
		if (arr[low] > arr[mid]) {
			if (arr[mid] > arr[high]) {
				return mid;
			} else if (arr[low] > arr[high]) {
				return high;
			} else {
				return low;
			}
		} else {
			if (arr[mid] < arr[high]) {
				return mid;
			} else if (arr[low] < arr[high]) {
				return high;
			} else {
				return low;
			}
		}
	}

	public static int getPivot_MedianOfThree(int[] arr, int low, int high) {
		int pivotIdx = medianOfThree(arr, low, high);
		int pivot = arr[pivotIdx];
		swap(arr, pivotIdx, high); // Di chuyển pivot vào vị trí cuối cùng

		int i = low;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				swap(arr, i, j);
				i++;
			}
		}

		swap(arr, i, high); // Đặt pivot vào vị trí chính giữa
		return i;
	}

	// 4 2 6 8 1 5

	// i = 0, 1, 2
	// i = 3, j = 2
	// i = 4, j = 2 ==> 4 2 1 8 6 5
	// i = 5, j = 3 ==> 4 2 6 5 1 8
	// j = 4 ==> j - 1 = arr[3] = 5

	public static int getPivot_Last(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low, j = low;
		while (i <= high) {
			if (arr[i] <= pivot) {
				swap(arr, i, j);
				j++;
			}
			i++;
		}
		return j - 1;

	}

	public static int getPivot_Random(int[] arr, int low, int high) {
		int randomIdx = new Random().nextInt(high-low)+low;
		swap(arr, randomIdx, high);
		int pivot = arr[high];
		int i = low-1;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, i+1, high); // Đặt pivot vào vị trí chính giữa
		return i+1;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr1 = { 4, 2, 6, 8, 1, 5 };
		System.out.print("Array Before Sorting By Pick First Pivot: ");
		display(arr1);
		System.out.println();
		quickSort(arr1, 0, arr1.length - 1);
		System.out.print("Array After Sorting By Pick First Pivot: ");
		display(arr1);

	}

}
