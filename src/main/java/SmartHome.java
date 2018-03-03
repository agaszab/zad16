public class SmartHome {

    public void home() {
        StacjaPogodowa pogoda= new StacjaPogodowa();
        SterownikGlosnika sterownikGlosnika = new SterownikGlosnika(pogoda.getTemperatura(),pogoda.getOswietlenie());
        SterownikRolet sterownikRolet = new SterownikRolet(pogoda.getOswietlenie());
        SterownikPieca sterownikPieca = new SterownikPieca(pogoda.getTemperatura());
    }

}
