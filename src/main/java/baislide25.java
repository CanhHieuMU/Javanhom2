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
public class baislide25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap can nang cua ban la: ");
        double a=sc.nextDouble();
        System.out.println("Nhap chieu cao cua ban la: ");
        double b=sc.nextDouble();
        double c;
        c=a / (b*b);
        System.out.println("Chi so BMI cua ban la: " + c);
        if (c<18.5) {
            System.out.println("Underweight");
        }
        else if ((c>=18.5)&&(c<25.00) ) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}