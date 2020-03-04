package roflan;

public class Date {
    private byte day;
    private byte month;
    private  int year;

    public Date() {
    }

    public Date(byte day, byte month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public byte getDay() {
        return day;
    }

    public byte getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
