package br.com.logicaDeProgramacao.modulo_1;
import br.com.logicaDeProgramacao.modulo_1.Aula_01.ConversorDeTemperatura;
import br.com.logicaDeProgramacao.modulo_1.Aula_01.TiposDeDados;
import br.com.logicaDeProgramacao.modulo_1.Aula_02.MenorValor;
import br.com.logicaDeProgramacao.modulo_1.Aula_03.MediaArray;
import br.com.logicaDeProgramacao.modulo_1.Aula_03.Operacoes;
import br.com.logicaDeProgramacao.modulo_1.Aula_04.MediaNotasAluno;
import br.com.logicaDeProgramacao.modulo_1.Aula_04.SwitchCase;
import br.com.logicaDeProgramacao.modulo_1.Aula_05.ExampleMatriz;
import br.com.logicaDeProgramacao.modulo_1.Aula_08.ConversorDeMinutosEmAnos;


public class Main {
    public static void main(String[] args) {
        ConversorDeTemperatura.conversor();
        TiposDeDados.tiposDeDados();
        MenorValor.recebeValores();
        Operacoes.operacoes();
        MediaArray.main();
        MediaNotasAluno.mediaNota(85);
        SwitchCase.EstamosEmQualMes(12);
        ExampleMatriz.imprimeMatriz(10, 15);
        ConversorDeMinutosEmAnos.conversor();

    }
}