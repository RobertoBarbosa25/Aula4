package edu.iesp.aula2;


import java.util.Scanner;
public class While {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, qntLidos = 0, soma = 0,qntPositivos = 0, qntNegativos = 0;

        do {

            System.out.print("Informe um número inteiro (0 para sair): ");
            num = Integer.parseInt(entrada.nextLine());

            if(num > 0){
                qntPositivos++;
            }
            else if(num < 0){
                qntNegativos++;
            }

            soma += num;

            if(num != 0){
                qntLidos++;
            }
        }
        while(num != 0);

        if(qntLidos == 0){
            System.out.println("Você não informou nenhum número.");
        }
        else{
            System.out.println("Quantidade de números positivos: " + qntPositivos);
            System.out.println("Quantidade de números negativos: " + qntNegativos);
            System.out.println("A soma dos números lidos é: " + soma);
            System.out.println("A média aritmética é: " + ((soma * 1.0) / qntLidos));

        }
    }
}


























