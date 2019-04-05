package chapter02.weather;

import chapter02.weather.Dashboard;

/**
 * @author rancho
 * @date 2019-03-24
 */
public interface Observer {

    public void update(Dashboard dashboard);
}
