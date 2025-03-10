/*
 * This source file was generated by the Gradle 'init' task
 */
package ch.zhaw.it.prog2.wordcloud;

import javafx.application.Application;

public class App {

    private static WordModel model = new WordModel();

    public static void main(String[] args) {
        Application.launch(MainWindow.class, args);
    }

    public static WordModel getModel() {
        return model;
    }
}