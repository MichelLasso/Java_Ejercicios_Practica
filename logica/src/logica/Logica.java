/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica;

/**
 *
 * @author HP
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Logica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            ArrayList<Integer> L= new ArrayList<>();
            ArrayList<Integer> Q= new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                int y=  scanner.nextInt();
                L.add(y);
            }
            int num= scanner.nextInt();
            scanner.nextLine();
            String insert= scanner.nextLine();
            
            if (insert.equals("INSERT")) {
                for (int i = 0; i < 2; i++) {
                    int q= scanner.nextInt();
                    Q.add(q);
                }
                L.add(Q.get(0), Q.get(1));
            }
            scanner.nextLine();
            String delete= scanner.nextLine();
            
            if (delete.equals("DELETE")) {
                int x=  scanner.nextInt();
                L.remove(x);
            }
            
            for (int i = 0; i < L.size(); i++) {
                System.out.println(L.get(i));
            }
        } catch (Exception e) {
            System.out.println("error");
        } finally {
            scanner.close();
        }
    }
    
}
