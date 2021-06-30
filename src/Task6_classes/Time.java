package Task6_classes;

public class Time {
    int hours;
    int min;
    int sec;

    public Time(int hours, int min, int sec) {
        this.hours = hours;
        this.min = min;
        this.sec = sec;
    }

    public void setTime(int hours, int min, int sec) {
        setSec(sec);
        setMin(min);
        setHours(hours);
    }

    public void addTime(int addHours, int addMin, int addSec) {
        setTime(addHours + hours, addMin + min, addSec + sec);
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public void setMin(int min) {
        if (min >= 0 && min <= 59) {
            this.min = min;
        } else {
            this.min = 0;
        }
    }

    public void setSec(int sec) {
        if (sec >= 0 && sec <= 59) {
            this.sec = sec;
        } else {
            this.sec = 0;
        }
    }

    public String toString() {
        return hours + ":" + min + ":" + sec;
    }
}
