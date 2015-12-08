package com.example.guest.stormy.weather;

/**
 * Created by Guest on 12/7/15.
 */
public class Forecast {
    //This class was created to keep the logical structure of the app more organized.
    // The Current object, Hour Array Object and Day Array Object are put together under the class of Forecast
    private Current mCurrent;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHourlyForecast() {
        return mHourlyForecast;
    }

    public void setHourlyForecast(Hour[] hourlyForecast) {
        mHourlyForecast = hourlyForecast;
    }

    public Day[] getDailyForecast() {
        return mDailyForecast;
    }

    public void setDailyForecast(Day[] dailyForecast) {
        mDailyForecast = dailyForecast;
    }

    private Hour[] mHourlyForecast;
    private Day[] mDailyForecast;
}
