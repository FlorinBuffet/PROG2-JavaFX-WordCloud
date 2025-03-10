package ch.zhaw.it.prog2.wordcloud;
/**
 * Most basic interface for observing an object
 */
public interface IsObservable {

    /**
     * Add an observer that listens for updates
     *
     * @param observer Observer to be notified
     */
    void addListener(IsObserver observer);

    /**
     * Remove an observer from the list
     *
     * @param observer Observer to end notification
     */
    void removeListener(IsObserver observer);
}
