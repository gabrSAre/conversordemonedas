package com.challencealura.conversordemonedas;

import java.util.Scanner;

public class Scaners {
    public double ScannerDou(String x){
        System.out.println(x);
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }


    public String ScannerLine(String x){
        System.out.println(x);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public int ScannerInt(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }


}
