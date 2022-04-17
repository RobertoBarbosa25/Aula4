package edu.iesp.Aula4;

import java.util.Random;
import java.util.Scanner;

public class WhileDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroAleatorio = aleatorio.nextInt(10);
        /*System.out.println(numeroAleatorio);*/

        String nome;
        int numEntrada;
        int tentativas = 1;


        System.out.println(", digite um número de 0 a 10: ");

        numEntrada = scan.nextInt();


        while (numEntrada != numeroAleatorio) {


            if (numEntrada >  numeroAleatorio) {

                System.out.println("Errou. Tente um número menor.");
                numEntrada = scan.nextInt();
                tentativas++;
            }


            else if (numEntrada < numeroAleatorio) {
                System.out.println("Errou. Tente um número maior.");
                numEntrada = scan.nextInt();
                tentativas++;
            }

        }

        if (numEntrada ==  numeroAleatorio) {
            System.out.println("Parabéns, você acertou!\nO número era o " + numeroAleatorio + ".\nVocê precisou de " + tentativas + " tentativas para acertar!.");

        }



    }



}

