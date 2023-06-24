package MeuBichinho.Modelos;

public class Status extends Dados {

   //Comida

    int hamburguer = 5;
    int pratoFeito = 10;
    int doce = 2;

    public void alimentar(){
        if (tamanhoFome < 0){
            tamanhoFome = 0;
        } if (tamanhoFome < 100){
            System.out.println("Selecione o alimento:");
            System.out.println("1) Prato feito");
            System.out.println("2) Hamburguer");
            System.out.println("3) Doce");
            int selecao = resposta.nextInt();

            switch (selecao){
                case 1:
                    tamanhoFome += pratoFeito;
                    break;
                case 2:
                    tamanhoFome += hamburguer;
                    break;
                case 3:
                    tamanhoFome += doce;
                    tamanhoDiversao += 5;
            }
        } if (tamanhoFome > 100){
            tamanhoFome = 100;
        } if (tamanhoFome == 100){
            System.out.println(nome + " está completamente alimentado!");
        }
    }

    //Bebida

    int agua = 30;
    int refrigerante = 15;

    public void beber(){
        if (tamanhoSede < 0){
            tamanhoSede = 0;
        } if (tamanhoSede < 100){
            System.out.println("Selecione o que quer fazer:");
            System.out.println("1) Água");
            System.out.println("2) Refrigerante");
            int selecao = resposta.nextInt();

            switch (selecao){
                case 1:
                    tamanhoSede += agua;
                    break;
                case 2:
                    tamanhoSede += refrigerante;
                    break;
            }
        } if (tamanhoSede > 100){
            tamanhoSede = 100;
        } if (tamanhoSede == 100){
            System.out.println(nome + " está hidratado!");
        }
    }

    //Diversao

    int brincar = 10;
    int conversar = 5;

    public void divertir(){
        if (tamanhoDiversao < 0){
            tamanhoDiversao = 0;
        } if (tamanhoDiversao < 100){
            System.out.println("Selecione o que quer fazer:");
            System.out.println("1) Brincar");
            System.out.println("2) Conversar");
            int selecao = resposta.nextInt();

            switch (selecao){
                case 1:
                    tamanhoDiversao += brincar;
                    tamanhoFome -= 5;
                    tamanhoSono -= 10;
                    break;
                case 2:
                    tamanhoDiversao += conversar;
                    tamanhoFome -= 2;
                    tamanhoSono -= 5;
                    break;
            }
        } if (tamanhoDiversao > 100){
            tamanhoDiversao = 100;
        } if (tamanhoDiversao < 0){
            tamanhoDiversao = 0;
        } if (tamanhoDiversao == 100){
            System.out.println(nome + " está feliz!");
        }
    }

    //Sono

    int dormir = 100;
    int cochilar = 50;

    public void descansar(){
        if (tamanhoSono < 0){
            tamanhoSono = 0;
        } if (tamanhoSono < 100){
            System.out.println("Selecione o que quer fazer:");
            System.out.println("1) Dormir");
            System.out.println("2) Cochilar");
            int selecao = resposta.nextInt();

            switch (selecao){
                case 1:
                    tamanhoSono += dormir;
                    break;
                case 2:
                    tamanhoSono += cochilar;
                    break;
            }
        } if (tamanhoSono > 100){
            tamanhoSono = 100;
        } if (tamanhoSono == 100){
            System.out.println(nome + " está bem descansado!");
        }
    }
}
