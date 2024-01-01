public class CurrentConditionDisplay  implements Observer{

    private WeatherData data;

    public CurrentConditionDisplay(WeatherData weatherData) {
        data = weatherData;
        data.registerData(this);
    }

    @Override
    public void update(float temp, float humidity) {
        System.out.println("Current condition: { temp: "+data.getTempretrue()+"\u00B0, humdity: "+data.getHumidty() +"%}");
    }
}
