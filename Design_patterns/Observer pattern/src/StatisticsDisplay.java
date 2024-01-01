public class StatisticsDisplay implements Observer{
    private WeatherData data;

    public StatisticsDisplay(WeatherData weatherData) {
        data = weatherData;
        data.registerData(this);
    }

    @Override
    public void update(float temp, float humidity) {
        System.out.println("Observer_2 { temp: "+data.getTempretrue()+",\n humdity: "+data.getHumidty() );

    }
}
