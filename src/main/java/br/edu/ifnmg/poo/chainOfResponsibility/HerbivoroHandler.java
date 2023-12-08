package br.edu.ifnmg.poo.chainOfResponsibility;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class HerbivoroHandler
        extends AbstractDietaHandler {

    public void processar(SerVivo serVivo) {
        if (serVivo.getClasse().equals("herbivoro")) {
            System.out.println("Primeiro Ser Vivo:\n"
                    + "O ser vivo é um herbívoro.\n");
        } else {
            super.processar(serVivo);
        }
    }
}
