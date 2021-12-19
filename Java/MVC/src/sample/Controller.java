package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Controller des Kartenspiels dient als Mittler zischen Model und View
 * besitzt alle Handlemethoden und verteilt diese auf jeweilige Button
 *
 * @author Timo Grautstück
 * @version 25-05-2021
 */

public class Controller implements EventHandler<ActionEvent> {
    private Model model;
    private View view;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        view.startGame();
        view.getStartButton().addEventHandler(ActionEvent.ACTION, this);
        view.getRestartButton().addEventHandler(ActionEvent.ACTION, this);
        view.getPullCardButton().addEventHandler(ActionEvent.ACTION, this);
    }

    /**
     * Diese Handlemethode ruft immer dann die gewünsche Handlemethode auf,
     * wenn der jeweilige Button gedrückt wird.
     *
     * @param event
     */
    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == this.view.getStartButton())
            this.startButtonPressed(event);

        if (event.getSource() == this.view.getRestartButton())
            this.restartButtonPressed(event);

        if (event.getSource() == this.view.getPullCardButton())
            this.pullCardButtonPressed(event);
    }

    public void startButtonPressed(ActionEvent event) {
        if (!this.model.getStart()) {
            System.out.println("oh yeah");
            this.model.setDefaultCards();
            this.view.updateCountCardLabel();
            this.view.playGame();
            this.model.setStart(true);
        }
    }

    public void restartButtonPressed(ActionEvent event) {
        if (this.model.getStart()) {
            System.out.println("Oh no");
            this.view.startGame();
            this.model.setStart(false);
        }
    }

    public void pullCardButtonPressed(ActionEvent event) {
        if (this.model.getKarten() > 0) {
            this.model.pullCards();
            this.view.updateCountCardLabel();
        } else {
            this.view.getCountCardLabel().setText("Es sind keine Karten mehr im Deck");
        }

    }
}
