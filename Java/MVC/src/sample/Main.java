package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Model model = new Model();
        View view = new View(model, primaryStage);
        Controller controller = new Controller(view, model);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
