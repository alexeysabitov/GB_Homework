package JavaCore.lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.File;
import java.io.IOException;

public class AccuweatherModel implements WeatherModel {
//http://dataservice.accuweather.com/forecasts/v1/daily/1day/

    private static final String PROTOCOL = "https";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String ONE_DAY = "1day";
    private static final String FIVE_DAY = "5day";
    private static final String API_KEY = "3SAA60mfstvtPkjPuJI9AEtHatsjUPwj";
    private static final String API_KEY_QUERY_PARAM = "apikey";
    private static final String LOCATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void getWeather(String selectedCity, Period period) throws IOException {
        switch (period) {
            case NOW:
                HttpUrl httpUrl = new HttpUrl.Builder()
                        .scheme(PROTOCOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(ONE_DAY)
                        .addPathSegment("25123")
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .build();

                Request request = new Request.Builder()
                        .url(httpUrl)
                        .build();

                Response oneDayForecastResponse = okHttpClient.newCall(request).execute();
                String weatherResponse = oneDayForecastResponse.body().string();
                System.out.println(weatherResponse);
                objectMapper.writeValue(new File("OneDay.json"), weatherResponse);

                break;

            case FIVE_DAYS:
                HttpUrl httpUrl5 = new HttpUrl.Builder()
                        .scheme(PROTOCOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(FIVE_DAY)
                        .addPathSegment("25123")
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .build();

                Request request5 = new Request.Builder()
                        .url(httpUrl5)
                        .build();

                Response FiveDayForecastResponse = okHttpClient.newCall(request5).execute();
                String weatherResponse5 = FiveDayForecastResponse.body().string();
                System.out.println(weatherResponse5);
                objectMapper.writeValue(new File("FiveDays.json"), weatherResponse5);

                break;
        }


    }

    public static void main(String[] args) throws IOException {
        System.out.println("???????????? ???? 1 ????????");
        AccuweatherModel accuweatherModel = new AccuweatherModel();
        accuweatherModel.getWeather("Novosibirsk", Period.NOW);
        System.out.println(" ");
        System.out.println("???????????? ???? 5 ????????");
        AccuweatherModel accuweatherModel2 = new AccuweatherModel();
        accuweatherModel2.getWeather("Novosibirsk", Period.FIVE_DAYS);


    }


}