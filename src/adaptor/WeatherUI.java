package adaptor;

public class WeatherUI {

    public void showTemperature(int zipCode) {
        WeatherAdaptor weatherAdaptor = new WeatherAdaptor();
        int temperature = weatherAdaptor.findTemperature(zipCode);
        System.out.println("temperature=" + temperature);
    }

    public static void main(String[] args) {
        WeatherUI weatherUI=new WeatherUI();
        weatherUI.showTemperature(123);
    }
}
