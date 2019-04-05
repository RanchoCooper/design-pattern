package chapter02.observer.weather;

/**
 * @author rancho
 * @date 2019-03-24
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
