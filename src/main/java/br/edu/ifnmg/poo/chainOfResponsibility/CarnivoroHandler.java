package br.edu.ifnmg.poo.chainOfResponsibility;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class CarnivoroHandler
        extends AbstractDietaHandler {

    public void processar(SerVivo serVivo) {
        if (serVivo.getClasse().equals("carnivoro")) {
            System.out.println("Segundo Ser Vivo:\n"
                    + "O ser vivo é um carnívoro.\n");
        } else {
            super.processar(serVivo);
        }
    }
}
