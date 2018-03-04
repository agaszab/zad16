package pl.javascript;

import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {

private boolean roletyOn=false;
private StacjaPogodowa stacjaPogodowa;

    public SterownikRolet(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void rolety () {

        String swiatlo=stacjaPogodowa.getOswietlenie();

        if (swiatlo.equals("Słonecznie")) {roletyOn=true;}
        if (!this.roletyOn) {System.out.println(swiatlo+" Rolety są podniesione.");}
        else {System.out.println(swiatlo+" Rolety zostały opuszczone.");}
    }

}
