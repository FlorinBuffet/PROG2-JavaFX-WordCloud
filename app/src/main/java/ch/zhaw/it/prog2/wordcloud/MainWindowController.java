package ch.zhaw.it.prog2.wordcloud;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindowController {

    @FXML
    private Label labelTitle;

    @FXML
    private TextField textEntry;

    @FXML
    private TextArea textHistory;

    public void initialize() {
        labelTitle.textProperty().bind(textEntry.textProperty());
    }

    @FXML
    void addText(ActionEvent event) {
        textHistory.appendText(textEntry.getText() + "\n");
        textEntry.clear();
    }

    @FXML
    void clearTextEntry(ActionEvent event) {
        textEntry.clear();
    }

}