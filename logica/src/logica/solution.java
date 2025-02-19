/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class solution {
    
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) { 
                return i; 
            }
        }
        return nums.length; 
    
    
    }
    
    public static void main(String[] args) {
        solution sol = new solution();
        Scanner scan= new Scanner(System.in);
        int[] nums = {1, 3, 4, 5};
        int target = scan.nextInt();
        
        int result = sol.searchInsert(nums, target);
        System.out.println(result); 
    }
}
    
     
