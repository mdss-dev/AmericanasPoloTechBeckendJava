package br.com.programaçaoOrientadaAObjetos_1.modulo_2.concessionaria;

public class Carro {
    String motor;
    int numeroDeRodas;
    int anoDeFabricao;
    String cor;
    String marca;
    String modelo;
    String estiloDeCombustivel;
    double preco;
    int aroRoda;
    String dono;
    int velocidadeMaxima;
    int velocidadeAtual;

    int obterVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    void ligar(){
        System.out.println("Carro ligado...");
    }

    void acelerar(int aumentoDeVelocidade){
        velocidadeAtual += aumentoDeVelocidade;
    }

    void desacelerar(int diminuicaoDeVelocidade){
        velocidadeAtual -= diminuicaoDeVelocidade;
    }

    void parar(){
        if (velocidadeAtual > 0){
            desacelerar(velocidadeAtual);
        }
        System.out.println("Carro parado!");
    }

    void morrer(){
        System.out.println("Faltou gasolina");
        desacelerar(velocidadeAtual);
        parar();
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor='" + motor + '\'' +
                ", numeroDeRodas=" + numeroDeRodas +
                ", anoDeFabricao=" + anoDeFabricao +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", estiloDeCombustivel='" + estiloDeCombustivel + '\'' +
                ", preco=" + preco +
                ", aroRoda=" + aroRoda +
                ", dono='" + dono + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }
}
