//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Fallon Gallagher  
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};

    System.out.print("The array in order is: ");
    int a = 0;
    while (a < nums.length) {
      System.out.print(nums[a] + " ");
      a++;
    }
    System.out.println();

    System.out.print("The array in reverse is: ");
    for (int b = nums.length -1; b >= 0; b--) {
      System.out.print(nums[b] + " ");
    }
    System.out.println();

    System.out.println("The first value in the array is: " + nums[0]);
    System.out.println("The last value in the array is: " + nums[nums.length -1]);

    System.out.println("The maximum value between 3 and 13 is: " + lab.max(3, 13));
    System.out.println("The minimum value between 3 and 13 is: " + lab.min(3, 13));
    System.out.println("The maximum value in the array is " + lab.max(nums));
    System.out.println("The minimum value in the array is " + lab.min(nums));
    System.out.println("The sum of the array is " + lab.sum(nums));
    System.out.println("The average of the array is " + lab.average(nums));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
  public int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public int min(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  public int sum(int[] nums) {
    int sum = 0;
    for (int s = 0; s < nums.length; s++) {
      sum += nums[s];
    }
    return sum;
  }

  public double average(int[] nums) {
    double sum = 0;

    for (int num : nums) {
      sum += num;
    }
    return sum / nums.length;
  }

  public int max(int[] nums) {
    int maxValue = nums[0];
    for (int v = 1; v < nums.length; v++) {
      if (nums[v] > maxValue) {
        maxValue = nums[v];
      }
    }
    return maxValue;
  }

  public int min(int[] nums) {
    int minValue = nums[0];
    for (int v = 1; v < nums.length; v++) {
      if (nums[v] < minValue) {
        minValue = nums[v];
      }
    }
    return minValue;
  }
}



