//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // A) creating 3 classes such as: WeatherData, CurrentConditionsDisplay, and StatisticsDisplay
        WeatherData weatherData = new WeatherData();
        // B) implement methods such as: register, remove, and notify observers in weather data class


        // C) Implement the CurrentConditionsDisplay and StatisticsDisplay classes as the Observers by
        // implemeting the Observer interface
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        // D) testing the program to see if the observers got registerd
        weatherData.setTempretrue(30);
        weatherData.setHumidty(50);
        System.out.println("---------------");
        // E) Simulate changes in the weather by updating the values in the WeatherData class. Ensure
        //that the observers are notified and update their displays accordingly.
        weatherData.setTempretrue(25);
        weatherData.setHumidty(40);

    }
}