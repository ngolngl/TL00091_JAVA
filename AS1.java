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
public class AS1 {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int x = -1;
        while(x == -1){
            System.out.println("************MENU************");
            System.out.println("Chuc nang 1: Tong so nguyen n. ");
            System.out.println("Chuc nang 2: Kiem tra so nguyen to.");
            System.out.println("Chuc nang 3: Hien thi so ngay trong thang");
            System.out.println("Chuc nang 4: Tim max min cua mang.");
            System.out.println("Chuc nang 5: Thoat chuong trinh");
            System.out.println("Moi nhap chuc nang: ");
            int cn = sv.nextInt();
            switch(cn){
                case 1:
                    int n, sum = 0;
                    do{
                    System.out.println("Nhap so nguyen n");
                    n = sv.nextInt();
                    if(n <= 0){System.out.println("Nhap lai!");}
                    }while(n <= 0);
                    System.out.println("Cac so tu 1 den n: ");
                    for (int i = 0; i <= n; i++) {
                        System.out.printf("%d ",i);
                        sum += i;
                    }
                    System.out.println("Tong n: "+sum);
                    break;
                case 2:
                    int check = 0;
                    double SNT;
                    System.out.println("Nhap so n: ");
                    SNT = sv.nextDouble();
                    if(SNT > 1){check = 0;
                    }else{check = 1;}
                    for (int i = 2; i <= sqrt(SNT); i++) {
                        if((SNT) % i == 0){check = 1;
                        }else{check = 0;}
                    }
                    if(check == 0){System.out.printf("So %f la so nguyen to \n",SNT);
                    }else{System.out.printf("So %f khong phai la so nguyen to \n",SNT);}
                    break;
                case 3:
                    int thang;
                    System.out.println("Nhap thang can tinh ngay: ");
                    thang = sv.nextInt();
                    switch(thang){
                        case 1: 
                            System.out.println("Thang co 31 ngay.");
                            break;
                        case 2: 
                            System.out.println("Thang co 28 hoac 29 ngay.");
                            break;
                        case 3:
                            System.out.println("Thang co 31 ngay.");
                            break;
                        case 4:
                            System.out.println("Thang co 30 ngay.");
                            break;
                        case 5:
                            System.out.println("Thang co 31 ngay.");
                            break;
                        case 6:
                            System.out.println("Thang co 30 ngay.");
                            break;
                        case 7:
                            System.out.println("Thang co 31 ngay");
                            break;
                        case 8:
                            System.out.println("Thang co 31 ngay.");
                            break;
                        case 9:
                            System.out.println("Thang co 30 ngay.");
                            break;
                        case 10:
                            System.out.println("Thang co 31 ngay.");
                            break;
                        case 11:
                            System.out.println("Thang co 30 ngay");
                            break;
                        case 12: 
                            System.out.println("Thang co 31 ngay.");
                            break;
                        default:
                            System.out.println("Em ve hoc lai cac thang di.");
                            break;
                    }
                    break;
                case 4:
                    int n2,max = 0, min = 10000000;
                    System.out.println("Nhap n mang: ");
                    do{
                    n2 = sv.nextInt();
                    if(n2 <= 0){System.out.println("Nhap lai n:");}
                    }while(n2 <= 0);
                    int[] n3 = new int[n2];
                    for (int i = 0; i <n2; i++) {
                        System.out.printf("Nhap gia tri %d: ",i+1);
                        do{
                        n3[i] = sv.nextInt();
                        if(n3[i] < 0){System.out.printf("Nhap lai gia tri %d:",i+1);}
                        }while(n3[i] < 0);
                        if(n3[i] > max){max = n3[i];}
                        if(n3[i] < min){min = n3[i];}
                    }
                    for (int i = 0; i < n3.length - 1; i++) {
                        for (int j = i + 1; j < n3.length; j++) {
                            if(n3[i] > n3[j]){
                            int thayso = n3[i];
                            n3[i] = n3[j];
                            n3[j] = thayso;
                            }
                        }
                    }
                    System.out.println("Gia tri mang vua nhap(Tang dan):");
                    for (int i = 0; i < n2; i++) {
                        System.out.printf("%d ",n3[i]);
                    }
                    System.out.println("\nGia tri max: "+max);
                    System.out.println("\nGia tri min: "+min);
                    break;
                case 5: 
                    System.out.println("Hen gap lai!");
                    x = 0;
                    break;
            }
        }
    }
}
