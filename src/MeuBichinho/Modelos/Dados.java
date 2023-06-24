package MeuBichinho.Modelos;

import java.util.Scanner;

public class Dados {

    String nome;

    int idade;

    int tamanhoFome;

    int tamanhoDiversao;

    int tamanhoSede;

    int tamanhoSono;

    int tamanhoVida;

    Scanner resposta = new Scanner(System.in);

    public void statusBichinho(){
        vida();
        fome();
        sede();
        diversao();
        sono();
    }

    public void dadosBichinho(){
        System.out.println("# Dados do seu pet:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void fome() {
        if (tamanhoFome < 0){
            tamanhoFome = 0;
        }
        if (tamanhoFome == 0) {
            System.out.println(nome + " precisa comer agora!");
            tamanhoVida -= 10;
        } else if (tamanhoFome < 30) {
            System.out.println(nome + " está com muita fome!");
            tamanhoVida -= 5;
        } else if (tamanhoFome < 50) {
            System.out.println(nome + " está com fome!");
        }
            System.out.println("Status de fome de " + nome + ": " + tamanhoFome + "%");
            tamanhoFome -= 5;
    };
     public void diversao(){
         if (tamanhoDiversao < 0){
             tamanhoDiversao = 0;
         }
         if (tamanhoDiversao == 0){
         System.out.println(nome + " está triste");
         tamanhoVida -= 10;
         } else if (tamanhoDiversao < 50) {
             System.out.println(nome + " está entediado!");
        }
        System.out.println("Status de diversão de " + nome + ": " + tamanhoDiversao + "%");
         tamanhoDiversao -= 5;
    };
    public void sede(){
        if (tamanhoSede < 0){
            tamanhoSede = 0;
        }
        if (tamanhoSede == 0){
            System.out.println(nome + " está desidratando!");
        } else if (tamanhoSede < 30){
            System.out.println(nome + " está com muita sede!");
        } else if (tamanhoSede < 50) {
            System.out.println(nome + " está com sede!");
        }
        System.out.println("Status de sede de " + nome + ": " + tamanhoSede + "%");
        tamanhoSede -= 10;
    };
    public void sono(){
        if (tamanhoSono < 0){
            tamanhoSono = 0;
        }
        if (tamanhoSono == 0){
            System.out.println(nome + " precisa dormir agora!");
            tamanhoVida -= 10;
        } else if (tamanhoSono < 30){
            tamanhoVida -= 5;
            System.out.println(nome + " está com muito sono!");
        } else if (tamanhoSono < 50){
            System.out.println(nome + " está com sono!");
        }
        System.out.println("Status de sono de " + nome + ": " + tamanhoSono + "%");
        tamanhoSono -= 5;
    };
    public void vida(){
        if (tamanhoVida <= 0){
            System.out.println(nome + " morreu :(");
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTamanhoFome() {
        return tamanhoFome;
    }

    public void setTamanhoFome(int tamanhoFome) {
        this.tamanhoFome = tamanhoFome;
    }

    public int getTamanhoDiversao() {
        return tamanhoDiversao;
    }

    public void setTamanhoDiversao(int tamanhoDiversao) {
        this.tamanhoDiversao = tamanhoDiversao;
    }

    public int getTamanhoSede() {
        return tamanhoSede;
    }

    public void setTamanhoSede(int tamanhoSede) {
        this.tamanhoSede = tamanhoSede;
    }

    public int getTamanhoSono() {
        return tamanhoSono;
    }

    public void setTamanhoSono(int tamanhoSono) {
        this.tamanhoSono = tamanhoSono;
    }

    public int getTamanhoVida() {
        return tamanhoVida;
    }

    public void setTamanhoVida(int tamanhoVida) {
        this.tamanhoVida = tamanhoVida;
    }

    public Scanner getResposta() {
        return resposta;
    }

    public void setResposta(Scanner resposta) {
        this.resposta = resposta;
    }
}
