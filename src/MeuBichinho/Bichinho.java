package MeuBichinho;

import MeuBichinho.Modelos.*;

import java.util.Scanner;

public class Bichinho {

    public static void main(String[] args) {

        Status pet = new Status();

        Scanner resposta = new Scanner(System.in);

        System.out.println("Boas-vindas ao simulador de bichinho!");
        System.out.println();
        System.out.println("Qual o nome do seu bichinho?");
        pet.setNome(resposta.nextLine());
        System.out.println("Olá, " + pet.getNome() + "!");
        System.out.println();
        pet.dadosBichinho();
        System.out.println();

        pet.setTamanhoVida(100);
        pet.setTamanhoFome(100);
        pet.setTamanhoSede(100);
        pet.setTamanhoDiversao(100);
        pet.setTamanhoSono(100);

        while (pet.getTamanhoVida() > 0){
            System.out.println();
            pet.statusBichinho();
            System.out.println();

            System.out.println("---");
            System.out.println(pet.getTamanhoVida());
            System.out.println("---");

            pet.setIdade(pet.getIdade() + 1);

            System.out.println("O que você deseja fazer?");
            System.out.println("1) Alimentar");
            System.out.println("2) Hidratar");
            System.out.println("3) Divertir");
            System.out.println("4) Descansar");
            System.out.println("5) Conferir dados");
            int selecao = resposta.nextInt();

            switch (selecao){
                case 1:
                    pet.alimentar();
                    break;
                case 2:
                    pet.beber();
                    break;
                case 3:
                    pet.divertir();
                    break;
                case 4:
                    pet.descansar();
                    break;
                case 5:
                    pet.dadosBichinho();
                    break;
            }

            if (pet.getIdade() > 100){
                pet.setTamanhoVida(0);
            }
        }

        pet.vida();

    }
}
