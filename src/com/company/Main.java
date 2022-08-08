package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        int code, password ;

        System.out.println("Welcome from system, please add your code access: ");
        code = scanner.nextInt();

    //verifyUserCode
               if (code == 1234) {
                   System.out.println("Fill your password: ");
                   password = scanner.nextInt();
                   // verifyUserPassword
                   if(password == 9999){
                       System.out.println("Done access");
                   }else{
                       System.out.println("Password fail");
                   }
               }else{
                   System.out.println("Invalid user");
               }

        scanner.close();
    }
}
