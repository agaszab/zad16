package pl.javascript;

import org.springframework.stereotype.Component;

@Component
public class SmartHome {

    private StacjaPogodowa stacjaPogodowa;
    private SterownikGlosnika sterownikGlosnika;
    private  SterownikPieca sterownikPieca;
    private SterownikRolet sterownikRolet;

    public SmartHome (StacjaPogodowa stacjaPogodowa,SterownikGlosnika sterownikGlosnika, SterownikPieca sterownikPieca, SterownikRolet sterownikRolet ) {
        this.stacjaPogodowa = stacjaPogodowa;
        this.sterownikGlosnika = sterownikGlosnika;
        this.sterownikPieca = sterownikPieca;
        this.sterownikRolet = sterownikRolet;
    }

    public void home() {
        sterownikGlosnika.glosnik();
        sterownikRolet.rolety();
        sterownikPieca.piec();
    }

}