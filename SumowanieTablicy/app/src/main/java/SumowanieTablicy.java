/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class SumowanieTablicy {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = sumArray(numbers);
        System.out.println("Suma tablicy: " + result);
    }

    public static int sumArray(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}

