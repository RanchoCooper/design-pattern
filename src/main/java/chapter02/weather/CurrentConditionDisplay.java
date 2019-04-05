package chapter02.weather;

/**
 * @author rancho
 * @date 2019-03-24
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Dashboard dashboard;
    private Subject weatherDate;

    public CurrentConditionDisplay(Subject weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    public void update(Dashboard dashboard) {
        this.dashboard = dashboard;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + dashboard.getTemperature() + "F degrees and " + dashboard.getHumidity() + "% humidity");
    }
}
