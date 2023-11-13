public class MyDate {
    private int year;
    private int month;
    private int day;
    public String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct","Nov", "Dec"};
    public String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public int[] DAYS_IN_MONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};

    // Constructors
    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }
    public MyDate() {
        setDate(0, 0, 0);
    }

    // Getters
    public int getYear() {
        return this.year;
    }
    public int getMonth() {
        return this.month;
    }
    public int getDay() {
        return this.day;
    }
    // Setters
    public void setYear(int year) {
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }

    // Methods
    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Invalid year, month, or day!");
        }
    }
    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > this.DAYS_IN_MONTHS[month - 1]) {
            return false;
        }
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            return false;
        }
        return true;
    }
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0; 
    }
    public int getDayOfWeek(int year, int month, int day) {
        // Zeller's congruence
        int d = day;
        int m = month;
        int y = year;
        if (m == 1 || m == 2) {
            m += 12;
            y -= 1;
        }
        int h = (d + (13 * (m + 1)) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
        return h;
    }
    public MyDate nextDay() {
        if (this.day < this.DAYS_IN_MONTHS[this.month - 1]) {
            this.day += 1;
        } else if (this.month < 12) {
            this.month += 1;
            this.day = 1;
        } else {
            this.year += 1;
            this.month = 1;
            this.day = 1;
        }
        return this;
    }
    public MyDate nextMonth() {
        if (this.month < 12) {
            this.month += 1;
        } else {
            this.year += 1;
            this.month = 1;
        }
        return this;
    }
    public MyDate nextYear() {
        this.year += 1;
        return this;
    }
    @Override //notice the @Override annotation here
    public String toString() {
        return this.getDayOfWeek(this.year, this.month, this.day) + " " + this.day + " " + this.MONTHS[this.month - 1] + " " + this.year;
    }
}
