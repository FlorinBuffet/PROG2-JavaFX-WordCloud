package ch.zhaw.it.prog2.wordcloud;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainWindow extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        openMainWindow(primaryStage);
    }

    private void openMainWindow(Stage stage){
        stage.show();
    }
}