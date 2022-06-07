/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_tma;

import java.util.Scanner;

/**
 *
 * @author 3121m
 */
public class Solution {    
    public int solution(String S) {
        int sum, result = 0;
        for (int i = 0; i < S.length(); i++) {
            sum = 0;
            for (int j = 0; j < S.length(); j++) 
                if (j!=i)
                    sum+=Integer.parseInt(String.valueOf(S.charAt(j)));
            result+=check(sum,S.charAt(i));
        }
        return result;
    }
    //hàm kiểm tra xem phần dư của tổng các chữ số khác S[i] để trả về số cách đổi khác nhau
    private int check(int sum, int numChange) {
        int res = sum % 3;
        numChange%=3;
        if (res == 0){
            if (res==numChange) 
                return 3;
            else return 4;
        }
        if (res == 1 || res == 2) {
            if (res==numChange) 
                return 2;
            else return 3;
        }
        return 0;
    }
    public static void main(String[] args) {
        Solution solution1 = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi can xu li:");
        String input = scanner.nextLine();
        System.out.print(solution1.solution(input));
        scanner.close();
    }
}
