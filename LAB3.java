/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_TL00091;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class LAB3 {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int check = 0;
        System.out.println("Nhap so x: ");
        int x = sv.nextInt();
        for (int i = 2; i <= sqrt(x); i++) {
            if(x % i == 0){
                check = 1;
            }else{
                check = 0;
            }
        }
        if(check == 0) {
            System.out.println("x la so nguyen to");
        }else{
            System.out.println("X kh phai la so nguyen to");
        }
        
    }
}
