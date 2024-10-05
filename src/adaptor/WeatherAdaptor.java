package adaptor;

public class WeatherAdaptor {

    public int findTemperature(int zipCode) {

        String city = null;

        if (zipCode == 123) {
            city = "Delhi";
        }

        WeatherFinder weatherFinder = new WeatherFinderImpl();
        int temperature = weatherFinder.findCity(city);
        return temperature;
    }

}
