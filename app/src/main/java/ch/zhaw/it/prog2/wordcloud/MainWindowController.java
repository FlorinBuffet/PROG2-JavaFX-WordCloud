package ch.zhaw.it.prog2.wordcloud;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindowController implements IsObserver{

    @FXML
    private Label labelTitle;

    @FXML
    private TextField textEntry;

    @FXML
    private TextArea textHistory;

    private WordModel model;

    public void initialize() {
        model = App.getModel();
        labelTitle.textProperty().bind(textEntry.textProperty());
        model.addListener(this);
    }

    @FXML
    void addText(ActionEvent event) {
        model.addWord(textEntry.getText());
        textEntry.clear();
    }

    @FXML
    void clearTextEntry(ActionEvent event) {
        textEntry.clear();
    }

    @Override
    public void update() {
        textHistory.setText(model.toString());
    }

}