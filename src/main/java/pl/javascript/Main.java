package pl.javascript;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SmartHome smartHome = context.getBean(SmartHome.class);
        StacjaPogodowa stacjaPogodowa = context.getBean(StacjaPogodowa.class);
        SterownikRolet sterownikRolet = context.getBean(SterownikRolet.class);
        SterownikGlosnika sterownikGlosnika = context.getBean(SterownikGlosnika.class);
        SterownikPieca sterownikPieca =  context.getBean(SterownikPieca.class);
        smartHome.home();
    }
}







