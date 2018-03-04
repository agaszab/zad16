package pl.javascript;

import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika {

    private StacjaPogodowa stacjaPogodowa;

    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void glosnik () {

        System.out.println("Dzień dobry.");
        System.out.println("Dzisiejsza temperatura: "+stacjaPogodowa.getTemperatura()+" Słońce: "+stacjaPogodowa.getOswietlenie());
        System.out.println("To będzie dobry dzień :)");
    }


}
