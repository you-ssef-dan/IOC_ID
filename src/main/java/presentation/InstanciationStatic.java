package presentation;

import dao.CalculV1;
import dao.CalculV2;
import dao.ICalcul;
import metier.Gestion;
import metier.IGestion;


public class InstanciationStatic {
    public static void main(String[] args) {

        ICalcul calcul = new CalculV2();
        System.out.println(calcul.getValue());

        Gestion gestion =  new Gestion();
        gestion.setCal(calcul);

        System.out.println(gestion.calcul());

    }
}
