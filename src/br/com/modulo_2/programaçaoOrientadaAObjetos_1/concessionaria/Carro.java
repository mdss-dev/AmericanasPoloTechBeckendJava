package br.com.modulo_2.programaçaoOrientadaAObjetos_1.concessionaria;

public class Carro {

    Carro(){
        pontoMorto();
    }

    Carro(EnumMarca marca){
        pontoMorto();
        this.marca = marca;
    }
    String motor;
    int numeroDeRodas;
    int anoDeFabricao;
    String cor;
    EnumMarca marca;
    String modelo;
    String estiloDeCombustivel;
    double preco;
    int aroRoda;
    String dono;
    int velocidadeMaxima;
    int velocidadeAtual;

    void ligar(){
        System.out.println("Carro ligado com chave...");
    }

    int obterVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    void acelerar(int aumentoDeVelocidade){
        velocidadeAtual += aumentoDeVelocidade;
    }

    void pontoMorto(){
        System.out.println("Carro no ponto morto");
    }

    void ligar(String comandoDeVoz){
        System.out.println("Carro ligado com comando de voz..." + comandoDeVoz);
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
