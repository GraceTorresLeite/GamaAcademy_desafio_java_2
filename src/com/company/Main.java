package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Desafio 2:
        // Faça um programa em Java para ler um número que é um código de usuário.
        // Caso este código seja diferente de um código armazenado internamente no algoritmo (igual a 1234)
        // deve ser apresentada a mensagem ‘Usuário inválido!’.
        // Caso o Código seja correto,deve ser lido outro valor que é a senha.
        // Se esta senha estive incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’.
        // Caso a senha esteja correta,deve ser mostrada a mensagem ‘Acesso permitido’

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
                   System.out.println("Code fail");
               }

        scanner.close();
    }
}
