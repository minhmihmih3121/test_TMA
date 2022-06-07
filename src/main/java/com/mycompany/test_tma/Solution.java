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
        if (res == 1) {
            if (numChange==2) 
                return 2;
            else return 3;
        }
        if (res == 2) {
            if (numChange==1) 
                return 2;
            else return 3;
        }
        return 0;
    }
    public static void main(String[] args) {
        Solution solution1 = new Solution();
        Solution1 solution2 = new Solution1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi can xu li: ");   
        String input = scanner.nextLine();
        System.out.println(solution1.solution(input));
        String[] A = {"ca","cb","de","dd"};
        String[] B = {"0123","0234","0321","0432"};
        System.out.print("Số liên lạc phù hợp: "+solution2.solution(A, B, input));
        scanner.close();
    }
}
