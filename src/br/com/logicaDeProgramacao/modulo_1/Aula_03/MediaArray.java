package br.com.logicaDeProgramacao.modulo_1.Aula_03;

import java.util.Arrays;

public class MediaArray {
    public static void main() {
        double [] numeros = {1, 4, 17, 7, 25, 3, 100};
        if(Arrays.stream(numeros).average().isPresent()) {
            System.out.printf("%.2f", (Arrays.stream(numeros).average().getAsDouble()));
        } else {
            System.out.println("Este array não contem dados do tipo double");
        }
    }
}
