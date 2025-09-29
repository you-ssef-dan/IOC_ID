package presentation;

import dao.ICalcul;
import metier.IGestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class InstanciationDynamique {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner sc = new Scanner(new File("config.txt"));
        String cCalcul = sc.nextLine();
        Class CalculClass = Class.forName(cCalcul);
        ICalcul calcul = (ICalcul) CalculClass.getConstructor().newInstance();
        System.out.println(calcul.getValue());

        String cGestion = sc.nextLine();
        Class GestionClass = Class.forName(cGestion);
        IGestion gestion = (IGestion) GestionClass.getConstructor().newInstance();
        Method m = GestionClass.getMethod("setCal", ICalcul.class);
        m.invoke(gestion, calcul);
        System.out.println(gestion.calcul());
    }
}
