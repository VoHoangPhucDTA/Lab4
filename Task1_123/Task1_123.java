package Task1_123;

import java.util.Arrays;

public class Task1_123 {
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			swap(arr, i, min);
		}
	}
	
	
	
	private static void swap(int[] arr, int i, int min) {
		int temp = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
	}



	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					swap(arr, i, j);
				}
			}
		}
	}
	
	
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i;
			while (j > 0 && arr[j-1] > current) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = current;
		}
	}
	
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr1 = {7,3,9,2,6,8,10};
		System.out.print("Array Before Sorting: ");
		display(arr1);
		System.out.println();
		System.out.print("Array After Sorting: ");
		
		selectionSort(arr1);
		bubbleSort(arr1);
		insertionSort(arr1);
		
		display(arr1);
	}
	
	
}
