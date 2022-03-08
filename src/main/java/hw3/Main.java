package hw3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task1
        String [] aboutMum = {"мама", "Наша", "мыла", "раму"};
        swap(aboutMum, 0, 1);
        System.out.println(Arrays.asList(aboutMum));
        //Task2
        System.out.println(Arrays.asList(convertToArrayList(aboutMum)));

        //Task3
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Box applebox1 = new Box();
        Box applebox2 = new Box();
        Box orangebox1 = new Box();
        applebox1.add(apple1);
        applebox1.add(apple2);
        applebox1.add(apple3);
        System.out.println("Вес коробки applebox1 = " + applebox1.getWeigth());
        orangebox1.add(orange1);
        orangebox1.add(orange1);
        orangebox1.add(orange1);
        System.out.println("Вес коробки orangebox1 = " + orangebox1.getWeigth());
        applebox1.move(applebox1, applebox2);
        System.out.println("Вес коробки applebox1 = " + applebox1.getWeigth());
        System.out.println("Вес коробки applebox2 = " + applebox2.getWeigth());


    }

    //Method for Task1
    public static <T> void swap(T[] arr, int element1, int element2) {
        T i = arr[element1];
        arr[element1] = arr[element2];
        arr[element2] = i;

    }
    //Method for Task2
    private static <T> ArrayList <T> convertToArrayList(T[] arr) {
        ArrayList<T> arrArray = new ArrayList<>();
        for (int i = 0; i< arr.length; i++){
            arrArray.add(arr[i]);
        }
        return arrArray;
    }
}
