package br.edu.ifnmg.poo.seminario;

import br.edu.ifnmg.poo.chainOfResponsibility.AbstractDietaHandler;
import br.edu.ifnmg.poo.chainOfResponsibility.CarnivoroHandler;
import br.edu.ifnmg.poo.chainOfResponsibility.HerbivoroHandler;
import br.edu.ifnmg.poo.chainOfResponsibility.OnivoroHandler;
import br.edu.ifnmg.poo.chainOfResponsibility.SerVivo;
import br.edu.ifnmg.poo.factoryMethod.Polygon;
import br.edu.ifnmg.poo.factoryMethod.PolygonFactory;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class Seminario {

    public static void main(String[] args) {
        // CHAIN OF RESPONSIBILITY
        System.out.println("CHAIN OF RESPONSIBILITY:\n\n");
        AbstractDietaHandler herbivoro = new HerbivoroHandler();
        AbstractDietaHandler carnivoro = new CarnivoroHandler();
        AbstractDietaHandler onivoro = new OnivoroHandler();

        herbivoro.setNextHandler(carnivoro);
        carnivoro.setNextHandler(onivoro);

        SerVivo serVivo1 = new SerVivo("herbivoro");
        SerVivo serVivo2 = new SerVivo("carnivoro");
        SerVivo serVivo3 = new SerVivo("onivoro");

        herbivoro.processar(serVivo1);
        herbivoro.processar(serVivo2);
        herbivoro.processar(serVivo3);
        System.out.println("FIM DO CHAIN OF RESPONSIBILITY\n\n");
        // FIM DO CHAIN OF RESPONSIBILITY

        // FACTORY METHOD
        System.out.println("FACTORY METHOD\n\n");
        Polygon p1 = PolygonFactory.getPolygon(3);
        Polygon p2 = PolygonFactory.getPolygon(4);
        Polygon p3 = PolygonFactory.getPolygon(5);

        System.out.println("p1: " + p1.getNumberOfSides());
        System.out.println("p2: " + p2.getNumberOfSides());
        System.out.println("p3: " + p3.getNumberOfSides());
        System.out.println("\nFIM DO FACTORY METHOD\n\n");
        // FIM DO FACTORY METHOD

    }
}
