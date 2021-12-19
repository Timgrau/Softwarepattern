package sample;

/**
 * Model des Kartenspiels besitzt boolean start und int karten
 * stellt Methoden zum Zugriff oder Updaten dieser Variablen zur
 * Verfügung.
 * <p>
 * Delegationsprinzip
 *
 * @author Timo Grautstück
 * @version 25-05-2021
 */
public class Model {
    private boolean start = false;
    private int karten = 32;

    public boolean getStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public int getKarten() {
        return karten;
    }

    public void pullCards() {
        if (this.karten > 0)
            this.karten -= 2;
    }

    public void setDefaultCards() {
        this.karten = 32;
    }
}
