package chapter02.weather;

import chapter02.weather.CurrentConditionDisplay;
import chapter02.weather.Dashboard;
import chapter02.weather.WeatherDate;

/**
 * @author rancho
 * @date 2019-03-24
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherDate weatherDate = new WeatherDate();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherDate);

        Dashboard dashboard1 = Dashboard.builder()
                .temperature(80.0)
                .humidity(80.0)
                .pressure(88.88)
                .build();
        weatherDate.setMeasurements(dashboard1);
        Dashboard dashboard2 = Dashboard.builder()
                .temperature(66.66)
                .build();
        weatherDate.setMeasurements(dashboard2);
    }
}
