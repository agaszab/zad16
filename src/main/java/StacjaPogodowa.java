import java.util.Random;

public class StacjaPogodowa {

    private int temperatura;
    private String [] tabOswietlenie = {"Zachmurzenie umiarkowane", "Zachmurzenie duże", "Słonecznie"};
    private String oswietlenie;


    public int getTemperatura() {
        return temperatura;
    }


    public String getOswietlenie() {
        return oswietlenie;
    }

    public StacjaPogodowa() {

        Random rand = new Random();
        this.temperatura=rand.nextInt(51)-25;
        this.oswietlenie=tabOswietlenie[rand.nextInt(tabOswietlenie.length)];
    }

}
