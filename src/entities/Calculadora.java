package entities;

public class Calculadora {

    /*
     * Método que calcula quantas visualizações o post terá, arredondando para baixo
     * pois não existe meia visualização, ou visualizações parciais.
     */
    public static int viewPerMoney(double valor) {
        int partialViews = (int) Math.floor(valor * 30);
        return partialViews;
    }

    /*
     * Método que calcula quantos clicks o post tera
     */
    public static int howManyClicks(int partialViews) {
        return (partialViews / 100) * 12;
    }

    /*
     * Método que calcula quantas vezes o post foi compartilhado
     */
    public static int sharedHowManyTimes(int partialClicks) {
        return (partialClicks / 20) * 3;
    }

    /*
     * Método para calcular a quantidade total de views
     */
    public static int quantViews(double valorTotal) {
        int views;
        int newViews;

        int onOriginalViews = viewPerMoney(valorTotal);
        int onOriginalClicks = howManyClicks(onOriginalViews);
        int onOriginalShare = sharedHowManyTimes(onOriginalClicks);

        newViews = onOriginalShare * 40;//Visualizações geradas pelo compartilhamento do post original        
        views = onOriginalViews + newViews;

        for (int i = 0; i <= 2; i++) {
            int partialClicks = howManyClicks(newViews);
            int partialShare = sharedHowManyTimes(partialClicks);

            newViews = partialShare * 40;
            views += newViews;
        }
        return views;
    }

    /*
     * Método para calcular a quantidade total de clicks
     */
    public static int quantClicks(double valorTotal) {
        int newViews;
        int clicks = 0;

        int onOriginalViews = viewPerMoney(valorTotal);
        int onOriginalClicks = howManyClicks(onOriginalViews);
        int onOriginalShare = sharedHowManyTimes(onOriginalClicks);

        newViews = onOriginalShare * 40;//Visualizações geradas pelo compartilhamento do post original 

        for (int i = 0; i <= 2; i++) {
            int partialClicks = howManyClicks(newViews);
            int partialShare = sharedHowManyTimes(partialClicks);

            newViews = partialShare * 40;
            clicks += partialClicks;
        }
        return onOriginalClicks + clicks;
    }

    /*
     * Método para calcular a quantas vezes o post foi compartilhado no total
     */
    public static int quantShared(double valorTotal) {
        int newViews;
        int shared = 0;

        int onOriginalViews = viewPerMoney(valorTotal);
        int onOriginalClicks = howManyClicks(onOriginalViews);
        int onOriginalShare = sharedHowManyTimes(onOriginalClicks);

        newViews = onOriginalShare * 40;//Visualizações geradas pelo compartilhamento do post original 

        for (int i = 0; i <= 2; i++) {
            int partialClicks = howManyClicks(newViews);
            int partialShare = sharedHowManyTimes(partialClicks);

            newViews = partialShare * 40;
            shared += partialShare;
        }
        return onOriginalShare + shared;
    }
}
