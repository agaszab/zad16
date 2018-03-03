import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika {

    public SterownikGlosnika(int temp, String oswietlenie) {
        System.out.println("Dzień dobry.");
        System.out.println("Dzisiejsza temperatura: "+temp+" Słońce: "+oswietlenie);
        System.out.println("To będzie dobry dzień :)");
    }


}
