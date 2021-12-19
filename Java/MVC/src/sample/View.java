package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * View des Kartenspiels bietet Methoden zum Laden von start Oberfläche
 * und spiel Oberfläche
 *
 * @author Timo Grautstück
 * @version 25-05-2021
 */
public class View {
    private Model model;

    /**
     * Deklarierung der Grafikelemente für die erste Oberfläche
     */
    private Button startButton;
    private Label startLabel;
    private VBox rootBox;
    private Stage primaryStage;

    /**
     * maybe this wont work
     */
    private Scene scene;

    /**
     * Deklarieren der Grafikelemente für die zweite Oberfläche
     */
    private Button pullCardButton, dropCardButton, restartButton;
    private Label countCardLabel;

    /**
     * Konstruktor des Views instanziiert die Grafikelemente
     * für den start des Spieles
     *
     * @param model
     * @param primaryStage
     */
    View(Model model, Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.model = model;
        this.startLabel = new Label("Das Spiel wurde noch nicht gestartet!");
        this.startButton = new Button("Spiel starten");
        this.restartButton = new Button("Spiel neustarten");
        this.pullCardButton = new Button("Karte ziehen");
        this.dropCardButton = new Button("Karte ablegen");
        this.countCardLabel = new Label("Es sind noch " + this.model.getKarten() + " Karten im Spiel");
    }

    /**
     * startGame-Methode wird genutzt um die start
     * Oberfläche zu erzeugen
     */
    public void startGame() {
        rootBox = new VBox();
        rootBox.getChildren().addAll(this.startButton, this.startLabel);
        rootBox.setAlignment(Pos.CENTER);
        rootBox.setSpacing(10);
        this.primaryStage.setScene(scene = new Scene(rootBox, 500, 200));
        this.primaryStage.show();
    }

    /**
     * playGame-Methode wird genutzt um die spiel Oberfläche zu laden
     * nachdem auf startButton geklickt wurde
     */
    public void playGame() {
        rootBox = new VBox();
        rootBox.getChildren().addAll(this.pullCardButton,
                this.dropCardButton,
                this.restartButton,
                this.countCardLabel);
        rootBox.setAlignment(Pos.CENTER);
        rootBox.setSpacing(10);
        this.primaryStage.setScene(scene = new Scene(rootBox, 500, 200));
        this.primaryStage.show();
    }

    /**
     * getter um den Button im Controller ein ActionEvent hinzuzufügen
     *
     * @return startButton
     */
    public Button getStartButton() {
        return this.startButton;
    }

    public Button getRestartButton() {
        return this.restartButton;
    }

    public Button getPullCardButton() {
        return this.pullCardButton;
    }

    /**
     * setter für countCardLabel um die veränderte Anzahl der
     * Karten im Controller setzen zu können
     */
    public Label getCountCardLabel() {
        return this.countCardLabel;
    }

    public void updateCountCardLabel() {
        this.countCardLabel.setText("Es sind noch " + this.model.getKarten() + " Karten im Spiel");
    }
}
