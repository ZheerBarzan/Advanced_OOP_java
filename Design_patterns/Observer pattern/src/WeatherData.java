import java.util.ArrayList;

public class WeatherData {

private ArrayList<Observer> views = new ArrayList<>();
private float tempretrue = 0;
private float humidty =0;

public void registerData(Observer observer){
    this.views.add(observer);
}
public void removeData(Observer observer){
    views.remove(observer);
}
public void notifyObservers(){
    for (Observer observer: views){
        observer.update(tempretrue,humidty);
    }
}

    public float getTempretrue() {
        return tempretrue;
    }

    public void setTempretrue(float tempretrue) {
        this.tempretrue = tempretrue;
notifyObservers();    }

    public float getHumidty() {
        return humidty;
    }

    public void setHumidty(float humidty) {
        this.humidty = humidty;
notifyObservers();    }
}
