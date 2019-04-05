package chapter02.observer.observable;

import chapter02.observer.weather.Dashboard;

import java.util.Observable;

/**
 * @author rancho
 * @date 2019-03-24
 */
public class WeatherData extends Observable {

    private Dashboard dashboard;

    public WeatherData() {
        // no longer need to handle observers in the constructor
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(Dashboard dashboard) {
        if (dashboard.getTemperature() != null) {
            this.dashboard.setTemperature(dashboard.getTemperature());
        }
        if (dashboard.getPressure() != null) {
            this.dashboard.setPressure(dashboard.getPressure());
        }
        if (dashboard.getHumidity() != null) {
            this.dashboard.setHumidity(dashboard.getHumidity());
        }
        measurementsChanged();
    }
}
