package br.com.modulo_2.programaçaoOrientadaAObjetos_1.concessionaria;

public class TesteMoto {
    public static void main(String[] args) {

        Moto moto1 = new Moto();

        moto1.setMarca("HONDA");
        moto1.setModelo("CB1000");
        moto1.setCor("Verde");
        moto1.setEscapamento("Esportivo");
        moto1.setPlaca("TYH-2545");
        moto1.setCilindrada(1_000);
        moto1.setVelocidadeMaxima(280);
        moto1.setPreco(40_000.00);

        System.out.println(moto1);

    }

}
