package br.edu.ifnmg.poo.chainOfResponsibility;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public abstract class AbstractDietaHandler {
    protected AbstractDietaHandler nextHandler;

    public void setNextHandler(AbstractDietaHandler handler) {
        this.nextHandler = handler;
    }

    public void processar(SerVivo serVivo) {
        if (nextHandler != null) {
            nextHandler.processar(serVivo);
        }
    }
}

