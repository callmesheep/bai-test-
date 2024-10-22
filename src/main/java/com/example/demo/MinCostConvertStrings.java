package com.example.demo;

import java.util.Scanner;

public class MinCostConvertStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap vao do dai: ");
            // Input: N (size of string), A (binary string A), B (binary string B)
            int n = scanner.nextInt();
            if (n < 1 || n > 100000) {
                System.out.println("Độ dài không hợp lệ. Vui lòng nhập lại.");

                continue;
            }
            System.out.println("Nhap vao chuoi nhi phan A: ");
            String A = scanner.next();
            System.out.println("Nhap vao chuoi nhi phan B: ");
            String B = scanner.next();
            if (A.length() != n || B.length() != n) {
                System.out.println(
                        "Độ dài chuỗi không khớp với n. Vui lòng nhập lại.");
                continue;
            }

            // Convert strings to character arrays for easier manipulation
            char[] a = A.toCharArray();
            char[] b = B.toCharArray();

            int cost = 0;

            for (int i = 0; i < n; i++) {
                // Check for swap condition
                if (i < n - 1 && a[i] != b[i] && a[i + 1] != b[i + 1] && a[i] == b[i + 1] && a[i + 1] == b[i]) {
                    // Perform swap
                    cost++;
                    i++; // Skip next character as it's already matched with the swap
                }
                // Check for flip condition
                else if (a[i] != b[i]) {
                    // Perform flip
                    cost++;
                }
            }

            // Output the total cost
            System.out.println("Chi phí tối thiểu để chuyển đổi A thành B: " +cost);
        }
    }
}
