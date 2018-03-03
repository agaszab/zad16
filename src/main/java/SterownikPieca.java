public class SterownikPieca {

    private boolean stanPieca=false;

    public SterownikPieca(boolean stanPieca) {
        this.stanPieca = stanPieca;
    }

    public SterownikPieca(int temp ) {
        if (temp<15) stanPieca=true;
        if (this.stanPieca==false) System.out.println("Piec jest wyłączony");
        else System.out.println("Piec został włączony.");
    }

    public boolean isStanPieca() {
        return stanPieca;
    }

    public void setStanPieca(boolean stanPieca) {
        this.stanPieca = stanPieca;
    }

    public void wlacz(){
        this.stanPieca=true;
    }
}
