package br.com.programaçaoOrientadaAObjetos_1.modulo_2.concessionariaVeiculos;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "FIAT";
        carro1.modelo = "SUV";
        carro1.cor = "PRETO";
        carro1.numeroDeRodas = 5;
        carro1.aroRoda = 19;
        carro1.anoDeFabricao = 2022;
        carro1.dono = "Michael Douglas";
        carro1.estiloDeCombustivel = "Gasolina";
        carro1.motor = "180 Cavalos";
        carro1.preco = 170_000.00;

        System.out.println(carro1);

        Carro carro2 = new Carro();
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

        System.out.println(carro2);

    }
}
