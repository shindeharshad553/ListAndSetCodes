package ListQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question8 {

    // Method to reverse a section of the list between indices s and e
    public static List<Integer> reverseSection(int s, int e, List<Integer> a) {
        while (s < e) {
            int temp = a.get(s);
            a.set(s, a.get(e));
            a.set(e, temp);
            s++;
            e--;
        }
        return a;
    }

    // Method to shift elements of the list by k positions
    public static List<Integer> shiftElements(List<Integer> a, int k) {
        // Check for edge cases
        if (a == null || a.size() <= 1 || k == 0) {
            return a;
        }

        // Ensure k is within the bounds of the list size
        k = k % a.size();
        
        if (k == 0) {
            return a;
        }

        // Create a mutable copy of the list (since Arrays.asList returns a fixed-size list)
        List<Integer> result = new ArrayList<>(a);

        // Reverse the entire list
        Collections.reverse(result);

        // Reverse the first k elements
        result = reverseSection(0, k - 1, result);

        // Reverse the remaining elements from k to the end of the list
        result = reverseSection(k, result.size() - 1, result);

        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 4, 5, 6, 78, 32, 43);
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of positions to shift: ");
        k = sc.nextInt();

        System.out.println("The result after shifting the list elements is: " + shiftElements(a, k));
        sc.close();
    }
}
