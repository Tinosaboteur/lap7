package test;

import java.util.*;

import KhoPhuTungXeMay.xeso;
import KhoPhuTungXeMay.xetayga;

public class testngoai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "pham duc thong";
        String b[] = a.split(" ");
                    for (String s : b){
                        System.out.println(s.charAt(0));
                    } 
        input.close();
    }
}
