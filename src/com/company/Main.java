package com.company;

	import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите длину массива ");
                int n = in.nextInt();
                int[] nums = new int[n];
                for (var m = 0; m < n; m++) {
                    nums[m] = in.nextInt();
                }
                int min = nums[0];
                for (var m = 0; m < n; m++) {
                    if (min < nums[m]) {
                        min = nums[m];
                    }
                }
                int S = 0;
                for (var m = 0; m < n; m++) {
                    S = S + nums[m];
                }
                System.out.println(S / n + min);
            }
        }