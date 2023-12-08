package br.edu.ifnmg.poo.chainOfResponsibility;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class OnivoroHandler
        extends AbstractDietaHandler {

    public void processar(SerVivo serVivo) {
        if (serVivo.getClasse().equals("onivoro")) {
            System.out.println("Terceiro Ser Vivo:\n"
                    + "O ser vivo é um onívoro.\n");
        } else {
            super.processar(serVivo);
        }
    }
}
