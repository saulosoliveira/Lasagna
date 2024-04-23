import meuprojeto.forno.TempoForno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TempoForno tempoRealForno = new TempoForno();
        tempoRealForno.expectedMinutesInOven();
        System.out.println("Informe quanto tempo a lasanha está no forno:");
        int realTime = scanner.nextInt();
        tempoRealForno.setTempoReal(realTime);
        System.out.println("Quantas camdadas você adcionou à sua Lasanha?");
        int camadasAdd = scanner.nextInt();
        tempoRealForno.setCamadas(camadasAdd);
        tempoRealForno.preparationTimeInMinutes();
        tempoRealForno.remainingMinutesInOven();
        tempoRealForno.totalTimeInMinutes();
    }
}
