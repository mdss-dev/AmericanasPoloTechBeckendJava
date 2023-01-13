package br.com.modulo_2.programaçaoOrientadaAObjetos_1.concessionaria;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro(EnumMarca.FIAT);
        carro1.setModelo("SUV");
        carro1.setCor("PRETO");
        carro1.setNumeroDeRodas(5);
        carro1.setAroRoda(19);
        carro1.setAnoDeFabricao(2022);
        carro1.setDono("Michael Douglas");
        carro1.setEstiloDeCombustivel("Gasolina");
        carro1.setMotor("180 Cavalos");
        carro1.setPreco(170_000.00);
        carro1.setVelocidadeMaxima(230);

        System.out.println(carro1.getNumeroDeRodas());

        System.out.println(carro1.obterVelocidadeMaxima());
        carro1.ligar();
        carro1.acelerar(120);
        System.out.println(carro1);

        carro1.acelerar(30);
        System.out.println(carro1);

        carro1.morrer();
        System.out.println(carro1);

        /*Carro carro2 = new Carro();
        carro2.marca = "VW";
        carro2.modelo = "GOL";
        carro2.cor = "AZUL";
        carro2.numeroDeRodas = 5;
        carro2.aroRoda = 18;
        carro2.anoDeFabricao = 2015;
        carro2.dono = "Diego";
        carro2.estiloDeCombustivel = "Gasolina";
        carro2.motor = "8 valvulas";
        carro2.preco = 35_000.00;

        System.out.println(carro2);*/

    }
}
