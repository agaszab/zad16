package pl.javascript;

import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {

    private boolean stanPieca=false;
    private StacjaPogodowa stacjaPogodowa;

    public SterownikPieca(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void piec ( ) {
        if (stacjaPogodowa.getTemperatura()<15) {stanPieca=true;}
        if (this.stanPieca==false) {System.out.println("Piec jest wyłączony");}
        else {System.out.println("Piec został włączony.");}
    }

}
