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
public class LAB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = -1;
        while(x1 == -1){
            System.out.println("\n*-------------Menu-------------*\n");
            System.out.println("Chuc nang 1: Giai phuong trinh bac nhat ");
            System.out.println("Chuc nang 2: Giai phuong trinh bac hai ");
            System.out.println("Chuc nang 3: Tinh tien dien ");
            System.out.println("Chuc nang 4: Tim so max trong 3 so da cho ");
            System.out.println("Chuc nang 5: Ket thuc! ");
            System.out.println("Nhap chuc nang: ");
            int cn = sc.nextInt();
        switch(cn){
            case 1:
        System.out.println("Nhap so a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap so b: ");
        double b = sc.nextDouble();
        if(a == 0){
            if( b == 0){
                System.out.println("Vo so nghiem ");
            }else{
                System.out.println("Vo nghiem ");
            }
        }else{
            double x;
            x = -b/a;
            System.out.printf("Nghiem cau phuong trinh la: %f ",x);
        }
        break;
            case 2:
        System.out.println("Nhap so a: ");
        double a2 = sc.nextDouble();
        System.out.println("Nhap so b: ");
        double b2 = sc.nextDouble(); 
        System.out.println("Nhap so c: ");
        double c2 = sc.nextDouble();
        if(a2 == 0){
            if(b2 == 0){
                if(c2 == 0){
                    System.out.println("Vo so nghiem");
                }else{
                    System.out.println("Vo nghiem");
                }
            }else{
                double xz = -c2 / b2;
                System.out.printf("Co nghiem la: %f",xz);
            }
        }else{
            double delta;
            delta = (-b2)*(-b2)-4*a2*c2;
            if(delta < 0){
                System.out.println("Vo nghiem: ");
            }else if(delta == 0){
                double x2;
                x2 = -b2 /(2*a2);
                System.out.printf("Nhiem kep x: %f ",x2);
            }else if(delta > 0){
                double x3,x4;
                x3 = (-b2 + sqrt(delta))/(2*a2);
                x4 = (-b2 - sqrt(delta))/(2*a2);
                System.out.printf("Nghiem phan biet x1: %f, x2: %f ",x3,x4);
            }
        }
        break;
            case 3:
                System.out.println("Nhap so dien su dung trong thang: ");
                int sodien = sc.nextInt();
                if(sodien < 0){
                    System.out.println("So dien khong hop le! ");
                } else if(sodien < 50){
                    int tien1;
                    tien1 = sodien * 1000;
                    System.out.printf("Tien dien phai tra trong thang: %d ",tien1);
                }else if(sodien > 50){
                    int tien2;
                    tien2 = 50 * 1000 + (sodien - 50) * 1200;
                    System.out.printf("Tien dien phai tra trong thang: %d ",tien2);
                }
                
                break;
            case 4:
                System.out.println("Nhap so a: ");
                double a3 = sc.nextDouble();
                System.out.println("Nhap so b: ");
                double b3 = sc.nextDouble();
                System.out.println("Nhap so c: ");
                double c3 = sc.nextDouble();
                double max;
                if(a3 >= b3 && a3 >= c3){
                    max = a3;
                }else if(b3 >= a3 && b3 >= c3){
                    max = b3;
                }else{
                    max = c3;
                }
                System.out.printf("So lon nhat la: %f ",max);
                break;
            case 5:
                x1 = 0;
                break;
            default:
                System.out.println("Nhap sai chuc nang! ");
                break;
    }
}
}
}
