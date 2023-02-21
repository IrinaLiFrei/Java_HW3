package Java_HW3;
// 2.Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;

public class RemoveEvenNums {
    public static void main(String[] args) {
        int size = 10;
        int min = 1;
        int max = 20;
        ArrayList<Integer> array = getRandomArray(size, min, max);
        System.out.println(array);
        System.out.println(removeEvenNums(array));
}

public static ArrayList getRandomArray(int size, int min, int max){
    ArrayList arr = new ArrayList(); 
    Random rand = new Random();
    for (int i = 0; i < size; i++) { 
        arr.add(rand.nextInt(min, max));
        } 
        return arr; 
    } 

public static ArrayList removeEvenNums(ArrayList<Integer> lis){
    ArrayList <Integer> arr = new ArrayList<>();
    for (int item : lis) {
        if (item % 2 != 0){
            arr.add(item);
        }
    }
    return arr;
}
}
