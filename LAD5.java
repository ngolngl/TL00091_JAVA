/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_TL00091;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class LAD5 {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int x = -1;
        while(x == -1){
            System.out.println("\nChuc nang 1: Xuat so thuc. ");
            System.out.println("Chuc nang 2: Xuat thong tin. ");
            System.out.println("Chuc nang 3: Quan ly san pham. ");
            System.out.println("Chuc nang 4: Xuat thong tin sinh vien. ");
            System.out.println("Nhap chuc nang: ");
            int cn = sv.nextInt();
            switch(cn){
                case 1 :
                    int xz = 0;
                    Double st,sum = 0.0;
                    ArrayList<Double> sothuc = new ArrayList<>();
                    while(xz == 0){
                        System.out.println("Nhap so thuc: ");
                        st = sv.nextDouble();
                        sothuc.add(st);
                        System.out.println("Nhap them so thuc: Yes / No");
                        System.out.println("Yes bam 1: ");
                        System.out.println("No bam 2: ");
                        int test = sv.nextInt();
                        if(test == 2){
                            xz = 1;
                        }
                    }
                    for(Double xv : sothuc){
                        System.out.println(xv);
                        sum += xv ;
                    }
                    System.out.println("Tong cua cac so: "+sum);
                    break;
                case 2:
                    int menu = 0;
                    int xzc = 0;
                    String ten;
                    ArrayList<String> tensv = new ArrayList<>();
                    while(menu == 0){
                    System.out.println("\nChuc nang 1: Nhap danh sach ho ten. ");
                    System.out.println("Chuc nang 2: Xuat danh sach vua nhap. ");
                    System.out.println("Chuc nang 3: Xuat danh sach ngau nhien. ");
                    System.out.println("Chuc nang 4: Xuat danh sach giam dan ");
                    System.out.println("Chuc nang 5: Tim va xoa ten. ");
                    System.out.println("Chuc nang 6: Thoat. ");
                    System.out.println("Nhap chuc nang: ");
                    int chucn = sv.nextInt();
                    sv.nextLine();
                    switch(chucn){
                    case 1:
                    while(xzc == 0){
                        System.out.println("Nhap ten sinh vien: ");
                        ten = sv.nextLine();
                        tensv.add(ten);
                        System.out.println("Nhap them ten sinh vien: Yes / No");
                        System.out.println("Yes bam 1: ");
                        System.out.println("No bam 2: ");
                        int test = sv.nextInt();
                        sv.nextLine();
                        if(test == 2){
                            xzc = 1;
                        }
                    }
                        System.out.println(tensv);
                    break;
                    case 2:
                    System.out.println("Danh sach ten vua nhap: ");
                    for(String tenmemay : tensv){
                        System.out.println(tenmemay);
                    }
                    break;
                    case 3:
                    Collections.shuffle(tensv);
                    System.out.println("Danh sach da hoan doi: ");
                    System.out.println("\n "+tensv);
                    break;
                    case 4:
                    Collections.sort(tensv);
                    Collections.reverse(tensv);
                    System.out.println("Danh sach sap xem thu tu giam dan:");
                    System.out.println("\n "+tensv);
                    break;
                    case 5: 
                        System.out.println("Nhap ten can xoa: ");
                        String tenxoa = sv.nextLine();
                        if (tensv.remove(tenxoa)) {
                        System.out.println("Xoa thanh cong: " + tenxoa);
                    } else {
                        System.out.println("Khong tim thay ho ten trong danh sach.");
                    }
                    break;
                    case 6: 
                        menu = 1;
                        break;
                    default: 
                        System.out.println("Khong co chuc nang day! ");
                        break;
                        }
                    }
                    break;
                case 3:
                 String sanpham;
                 double dongia;
                 int menuz = 0, ads = 0;
                 ArrayList<String> sp = new ArrayList<>();
                 ArrayList<Double> gia = new ArrayList<>();
                 while(menuz == 0){
                 System.out.println("\nChuc nang 1: Nhap san pham. ");
                 System.out.println("Chuc nang 2: Sap xep giam dan. ");
                 System.out.println("Chuc nang 3: Tim va xoa san pham. ");
                 System.out.println("Chuc nang 4: Xuat gia trung binh. ");
                 System.out.println("Nhap chuc nang: ");
                 int cnang = sv.nextInt();
                 sv.nextLine();
                 switch(cnang){
                     case 1:
                         while(ads == 0){
                             System.out.println("Nhap ten sanpham: ");
                             sanpham = sv.nextLine();
                             sp.add(sanpham);
                             System.out.println("Nhap gia san pham: ");
                             dongia = sv.nextDouble();
                             gia.add(dongia);
                             System.out.println("Nhap them ten sinh vien: Yes / No");
                            System.out.println("Yes bam 1: ");
                            System.out.println("No bam 2: ");
                            int test = sv.nextInt();
                            sv.nextLine();
                            if(test == 2){
                                ads = 1;
                            }
                         }
                 }
               }
            }
        }
    }
}