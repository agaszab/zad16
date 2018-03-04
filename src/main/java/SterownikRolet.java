import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {

private boolean roletyOn=false;

    public void rolety (String swiatlo) {
        if (swiatlo.equals("Słonecznie")) roletyOn=true;
        if (this.roletyOn==false) System.out.println(swiatlo+" Rolety są podniesione.");
        else System.out.println(swiatlo+" Rolety zostały opuszczone.");
    }

}
