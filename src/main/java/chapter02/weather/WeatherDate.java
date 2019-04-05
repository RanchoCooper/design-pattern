package chapter02.weather;

import chapter02.weather.Dashboard;
import chapter02.weather.Observer;
import chapter02.weather.Subject;

import java.util.ArrayList;

/**
 * @author rancho
 * @date 2019-03-24
 */
public class WeatherDate implements Subject {

    private ArrayList<Observer> observers;
    private Dashboard dashboard;

    public WeatherDate() {
        observers = new ArrayList<Observer>();
        dashboard = new Dashboard();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(dashboard);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(Dashboard dashboard) {
        if (dashboard.getTemperature() != null) {
            this.dashboard.setTemperature(dashboard.getTemperature());
        }
        if (dashboard.getHumidity() != null) {
            this.dashboard.setHumidity(dashboard.getHumidity());
        }
        if (dashboard.getPressure() != null) {
            this.dashboard.setPressure(dashboard.getPressure());
        }
        measurementsChanged();
    }

    public Dashboard getDashboard() {
        return this.dashboard;
    }
}
