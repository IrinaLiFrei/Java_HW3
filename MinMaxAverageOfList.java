package Java_HW3;
// 3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

import java.util.ArrayList;
import java.util.Random;

public class MinMaxAverageOfList {
    public static void main(String[] args) {
        int size = 5;
        int min = 1;
        int max = 10;
        ArrayList<Integer> array = getRandomArray(size, min, max);
        System.out.println(array);
        getMinMax(array);
        getAvarage(array);
}

public static ArrayList getRandomArray(int size, int min, int max){
    ArrayList arr = new ArrayList(); 
    Random rand = new Random();
    for (int i = 0; i < size; i++) { 
        arr.add(rand.nextInt(min, max));
        } 
        return arr; 
    } 

public static void getMinMax(ArrayList<Integer> array){
    int min = array.get(0);
    int max = array.get(0);
    
    for (int i : array) {
        if(i < min) 
            min = i;
        if(i > max) 
            max = i;
    }
    System.out.printf("Min - %d, max - %d, ", min, max);
}

public static void getAvarage(ArrayList<Integer> array){
    double size = array.size();
    double sum = 0;
    double avarage = 0;
    for (int i : array) {
        sum = sum + i;
    }
    avarage = (sum / size);
    System.out.printf("avarage - %.1f", avarage);
}
}
