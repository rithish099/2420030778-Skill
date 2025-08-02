package neww;

import java.util.Arrays;

public class d1_array {
    public static void main(String args[]) {
        int[] array = {12, 4, 5, 2, 5};

        for (int array1 : array) {
            System.out.println(array1);
        }
        int[] age = {2312, 423, 325, 22, 23};
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);


        int[] age1 = {12, 4, 5};
        System.out.println("Using for Loop:");
        for (int i = 0; i < age1.length; i++) {
            System.out.println(age1[i]);
        }
        System.out.println("Sorted Arrays:");
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

    
        Arrays.sort(age);
        System.out.println("Sorted age: " + Arrays.toString(age));
        Arrays.sort(age1);
        System.out.println("Sorted age1: " + Arrays.toString(age1));
    }
}

