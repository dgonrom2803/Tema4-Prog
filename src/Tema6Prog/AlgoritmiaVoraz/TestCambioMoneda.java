package Tema6Prog.AlgoritmiaVoraz;

import java.util.Arrays;

public class TestCambioMoneda {
    public static void main(String[] args) {
        int[] monedas = {50, 20, 10, 5, 1};
        int cambio = 41;
        ProblemaCambioMoneda pcm = new ProblemaCambioMoneda(monedas, cambio);
        pcm.voraz();
        System.out.println(Arrays.toString(pcm.solucion));
    }
}
