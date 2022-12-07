package JavaCore.lesson6;

public class Forecast {
    private String day;
    private String temperature;

    public Forecast() {
    }

    public Forecast(String Date, String Temperature) {
        this.day = Date;
        this.temperature = Temperature;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
