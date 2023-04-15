package com.driver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Product p=new Product();
        int ans=p.product(10,20);
        int ans2=p.product(10,20,30);
        double ans3=p.product(10.5,15.5);
        System.out.println(ans+" "+ans2+" "+ans3);
    }

    public static class Product{


        public int product(int x, int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
}