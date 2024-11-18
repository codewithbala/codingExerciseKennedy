package com.kabaso.mock.week11.task1;
import java.util.ArrayList;
import java.util.List;

public class Permutations {
//Write a program to find all permutations of a given string.
    public static void main(String[] args) {
        String str = "abc";
        List<String> permutations = generatePermutations(str);
        System.out.println(permutations);
    }

    public static List<String> generatePermutations(String str) {
        List<String> result = new ArrayList<>();
        permute(str, 0, result);
        return result;
    }

    private static void permute(String str, int index, List<String> result) {
        if (index == str.length()) {
            result.add(str);
            return;
        }

        for (int i = index; i < str.length(); i++) {
            String swapped = swap(str, index, i);
            permute(swapped, index + 1, result);
        }
    }

    private static String swap(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}