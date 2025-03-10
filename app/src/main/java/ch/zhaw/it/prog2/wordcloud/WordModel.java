package ch.zhaw.it.prog2.wordcloud;

import java.util.*;

/**
 * A WordModel object holds a map of words (String) with the actual count
 */
public class WordModel implements IsObservable {
    private final Map<String, Integer> words = new HashMap<>();
    private final List<IsObserver> observers = new ArrayList<>();

    public void addWord(String word) {
        int count = words.getOrDefault(word, 0);
        words.put(word, ++count);
        notifyObservers();
    }

    public void removeWord(String word) {
        int count = words.getOrDefault(word, 1);
        if (count == 1) {
            words.remove(word);
        } else {
            words.put(word, --count);
        }
        notifyObservers();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            sb.append(entry.getKey()).append(" - ").append(entry.getValue());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public void addListener(IsObserver observer) {
        observers.add(observer);
    }

    public void removeListener(IsObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (IsObserver observer : observers) {
            observer.update();
        }
    }

}