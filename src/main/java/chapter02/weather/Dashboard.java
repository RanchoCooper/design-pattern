package chapter02.weather;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rancho
 * @date 2019-03-24
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dashboard {

    private Double temperature;
    private Double humidity;
    private Double pressure;
}
