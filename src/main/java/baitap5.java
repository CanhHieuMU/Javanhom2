/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author My PC
 */
public class baitap5 {
    public static void main (String[] args) {
        int a,b;
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        a = scanner.nextInt();
        System.out.println("nhap b");
        b = scanner.nextInt();
        if (a == 0){
            if (b == 0){
                System.out.println("Phuong trinh vo so nghiem.");
            } 
            else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } 
        else {
            x = (double) -b/a;
            System.out.println("Phuong trinh co duy nhat nghiem x:" + x);
        }
    }
}
