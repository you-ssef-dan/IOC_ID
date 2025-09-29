package presentation;

import dao.ICalcul;
import metier.IGestion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXML {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");
        ICalcul cal = context.getBean(ICalcul.class);
        System.out.println(cal.getValue());
        IGestion gestion = context.getBean(IGestion.class);
        System.out.println(gestion.calcul());

    }
}
