/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_TL00091;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class BT_JAVA {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int sum = 0;
        System.out.println("Nhap so n: ");
        int n = sv.nextInt();
        System.out.println("Cac so le la: ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d ",i);
                sum += i;
            }
        }
        System.out.printf("\nTong so le la: %d ",sum);
        if(sum % 3 == 0){
            int sum2 = sum / 3;
            System.out.printf("\nTong S co chia het cho 3 va ket qua la: %d ",sum2);
        }else{
            System.out.println("\nTong S khong chia het cho 3");
            System.out.printf("Tong S - 10 = %d ",sum - 10);
        }
    }
}
