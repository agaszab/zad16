import java.util.Random;

public class StacjaPogodowa {

    private int temperatura;
    private String [] tabOswietlenie = {"Zachmurzenie umiarkowane", "Zachmurzenie duże", "Słonecznie"};
    private String oswietlenie;

    public StacjaPogodowa(int temperatura, String oswietlenie) {
        this.temperatura = temperatura;
        this.oswietlenie = oswietlenie;
    }


    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getOswietlenie() {
        return oswietlenie;
    }

    public void setOswietlenie(String oswietlenie) {
        this.oswietlenie = oswietlenie;
    }


    public StacjaPogodowa() {

        Random rand = new Random();
        this.temperatura=rand.nextInt(51)-25;
        this.oswietlenie=tabOswietlenie[rand.nextInt(tabOswietlenie.length)];
    }

}
