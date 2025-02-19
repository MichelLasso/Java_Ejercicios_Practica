/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=  scanner.nextLine();
        Stack<Character> stack= new Stack<>();
        //cada caracter tiene un codigo numerico
        for (char i: s.toCharArray()) {
            if (i =='(' || i=='[' || i=='{') {
                stack.push(i);
            } 
            if (i==')' && stack.peek()== '(') {
                stack.pop();
            } else if (i=='}' && stack.peek()== '{') {
                stack.pop();
            } else if(i==']' && stack.peek()== '['){
                stack.pop();
            }
        }
        
        if (stack.empty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
