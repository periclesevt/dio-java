package Relogio;

public class USClock extends Clock{

    private String periodIndicator;

    public void setHour(int hour) {
        SetBeforeMidday();
        if ((hour > 12) && (hour <= 23)){
            this.hour = 12;
            SetAfterMidday();
            this.hour = hour -12;
        }
        else if (hour >= 24){
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void SetAfterMidday(){
        this.periodIndicator = "PM";
    }

    public void SetBeforeMidday(){
        this.periodIndicator = "AM";
    }

    @Override
    Clock convert(Clock clock) {
        return null;
    }
}
