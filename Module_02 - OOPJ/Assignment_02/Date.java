public class Date {

    private int day;
    private int month;
    private int year;
    private int[] daysInMonths = {31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
    
    public void setDate(int d, int m, int yr) {
        if(m<1 || m>12) {
            month=1;
        } 
        else{
            month=m;
            if(d<1 || d>daysInMonths[m - 1]) {
                day=1;
            } else {
                day=d;
            }
        }
        year=yr;
    }

    public void addDays(int d) {
        while(d>0) {
            int maxDays=daysInMonths[month - 1];
            // February in leap year
            if(month==2 && isLeap(year)) {
                maxDays=29;
            }

            if(day+d<=maxDays) {
                day+=d;
                d=0;
            } 
            else{
                d-=(maxDays - day+1);
                day = 1;
                if(month==12) {
                    month=1;
                    year++;
                }
                else {
                    month++;
                }
            }
        }
    }

    public void addMonths(int m) {
        month += m;
        while (month > 12) {
            month -= 12;
            year++;
        }
    }

    public void displayDate() {
        System.out.println("Date - " + day + "/" + month + "/" + year);
    }

    public void addYears(int yr) {
        year += yr;
    }

    public boolean isLeap(int yr) {
        if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)) {
            return true;
        }

        return false;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return year;
    }
}