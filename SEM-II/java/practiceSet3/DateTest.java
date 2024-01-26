
class Date{
    int day, month, year;
    Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    void setDay(int day){
        this.day = day;
    }
    void setMonth(int month){
        this.month = month;
    }
    void setYear(int year){
        this.year = year;
    }
    int getDay(){
        return day;
    }
    int getMonth(){
        return month;
    }
    int getYear(){
        return year;
    }
    void displayDate(){
        System.out.println("Date : "+this.day+"/"+this.month+"/"+this.year);
    }
}
class DateTest{
    public static void main(String[] args) {
        Date d1 = new Date(15,01,2002);
        d1.displayDate();

        Date d2 = new Date(20,04,2023);
        d2.displayDate();
    }
}