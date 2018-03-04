package pl.javascript;

import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {

    private boolean stanPieca=false;


    public void piec (int temp ) {
        if (temp<15) stanPieca=true;
        if (this.stanPieca==false) System.out.println("Piec jest wyłączony");
        else System.out.println("Piec został włączony.");
    }

}