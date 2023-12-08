package br.edu.ifnmg.poo.factoryMethod;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class PolygonFactory {

    public static Polygon getPolygon(int numberOfSides) {
        if (numberOfSides == 3) {
            return new Triangle();
        } else if (numberOfSides == 4) {
            return new Square();
        } else if (numberOfSides == 5) {
            return new Pentagon();
        } else {
            throw new IllegalArgumentException("Número ruim de lados");
        }
    }
}
