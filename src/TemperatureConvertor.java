public class TemperatureConvertor {

    double temp;

    //To convert from Celsius to Farenheit
    static double celsiusToFarenheit(double temp) {
        return (temp*1.8)+32;
    }

    static double farenheitToCelsius(double temp) {
        return (temp-32)*(5/9);
    }

    static double celsiusToKelvin(double temp) {
        return temp+273.15;
    }

    static double kelvinToCelsius(double temp) {
        return temp-273.15;
    }

    static double farenheitToKelvin(double temp) {
        return (temp-32)*(5/9)+273.15;
    }

    static double kelvinToFarenheit(double temp) {
        return (temp-273.15)*1.8+32;
    }



}