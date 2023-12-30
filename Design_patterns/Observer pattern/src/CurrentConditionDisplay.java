public class CurrentConditionDisplay  implements Observer{

    private WeatherData data;

    public CurrentConditionDisplay(WeatherData weatherData) {
        data = weatherData;
        data.registerData(this);
    }

    @Override
    public void update(float temp, float humidity) {
        System.out.println("Observer_1 { temp: "+data.getTempretrue()+",\n humdity: "+data.getHumidty() );
    }
}
