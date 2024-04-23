package meuprojeto.forno;

public class TempoForno {
    private int tempoForno = 40;
    private int tempoReal;
    private int camadas;
    private int tempoTotal;

    public void setTempoReal(int tempoReal) {
        this.tempoReal = tempoReal;
    }

    public void setCamadas(int camadas) {
        this.camadas = camadas;
    }

    public void expectedMinutesInOven() {
        System.out.println("Olá, percebi que você vai preparar uma lasanha hoje, o tempo esperado de cozimento para uma lasanha com camadas padrão é : " + tempoForno + " minutos");
    }

    public void remainingMinutesInOven() {
        System.out.println("Tempo restante de cozimento: " + (tempoForno - tempoReal) + " minutos");
    }

    public void preparationTimeInMinutes() {
        System.out.println("Nessa lasanha de " + camadas + "você gastou " + camadas * 2 + " minutos");
    }

    public void totalTimeInMinutes() {
        System.out.println("Hmmm... \n Que delícia, finalmente sua lasanha ficou pronta. \n Você gastou "
                + ((camadas * 2) + tempoReal) + " minutos no preparo total dela, aproveite!");
    }
}

