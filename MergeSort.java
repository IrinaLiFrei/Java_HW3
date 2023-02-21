package Java_HW3;
// 1.Реализовать алгоритм сортировки слиянием
import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int size = 10;
        int min = 1;
        int max = 20;
        int[] array = getRandomArray(size, min, max);
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

public static int[] getRandomArray(int size, int min, int max){
    int[] array = new int[size]; 
    Random rand = new Random();
    for (int i = 0; i < size; i++) { 
        array[i] = rand.nextInt(min, max);
        } 
        return array; 
    } 
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;
        int middle = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        mergeSort(left);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);
        mergeSort(right);
        merge(left, right, arr);
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int leftIndex = 0; 
        int rightIndex = 0;
        int finalIndex = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                arr[finalIndex++] = left[leftIndex++];
            } else {
                arr[finalIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            arr[finalIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            arr[finalIndex++] = right[rightIndex++];
        }
    }
    
}