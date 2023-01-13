package br.com.modulo_2.programaçaoOrientadaAObjetos_1.concessionaria;

public class Carro {

    Carro(){
        pontoMorto();
    }

    Carro(EnumMarca marca){
        pontoMorto();
        this.marca = marca;
    }
    private String motor;
    private int numeroDeRodas;
    private int anoDeFabricao;
    private String cor;
    private EnumMarca marca;
    private String modelo;
    private String estiloDeCombustivel;
    private double preco;
    private int aroRoda;
    private String dono;
    private int velocidadeMaxima;
    private int velocidadeAtual;

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

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getNumeroDeRodas() {
        return numeroDeRodas;
    }

    public void setNumeroDeRodas(int numeroDeRodas) {
        if(numeroDeRodas < 4 || numeroDeRodas > 5){
            throw new IllegalArgumentException("Numero de rodas inválido!");
        }
        this.numeroDeRodas = numeroDeRodas;
    }

    public int getAnoDeFabricao() {
        return anoDeFabricao;
    }

    public void setAnoDeFabricao(int anoDeFabricao) {
        this.anoDeFabricao = anoDeFabricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public EnumMarca getMarca() {
        return marca;
    }

    public void setMarca(EnumMarca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstiloDeCombustivel() {
        return estiloDeCombustivel;
    }

    public void setEstiloDeCombustivel(String estiloDeCombustivel) {
        this.estiloDeCombustivel = estiloDeCombustivel;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAroRoda() {
        return aroRoda;
    }

    public void setAroRoda(int aroRoda) {
        this.aroRoda = aroRoda;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
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
