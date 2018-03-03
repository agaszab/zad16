public class SterownikRolet {

private boolean roletyOn=false;

    public SterownikRolet(String swiatlo) {
        if (swiatlo.equals("Słonecznie")) roletyOn=true;
        if (this.roletyOn==false) System.out.println(swiatlo+" Rolety są podniesione.");
        else System.out.println(swiatlo+" Rolety zostały opuszczone.");
    }

    public boolean isRoletyOn() {
        return roletyOn;
    }

    public void setRoletyOn(boolean roletyOn) {
        this.roletyOn = roletyOn;
    }

    public  void opuscRolety(){
        this.roletyOn=true;

    }
}
