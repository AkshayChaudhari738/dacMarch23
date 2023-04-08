import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class Date {
    int day;
    int month;
    int year;

    Date() {
        this(0, 0, 0);
    }

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    boolean isValid() {
        if (this.day >= 1 && this.day <= 31 && this.month >= 1 && this.month <= 12 && this.year >= 1000
                && this.year <= 9999) {
            return true;
        } else {
            return false;
        }
    }

    int getDayOfWeek() {
        LocalDate localDate = LocalDate.of(this.year, this.month, this.day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.getValue();
    }

    boolean isLeapYear() {
        if (this.year % 4 == 0) {
            if (this.year % 100 == 0) {
                if (this.year % 400 == 0) {
                    return true;
                } else
                    return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public Date getNextDay() {
        Date dt = new Date();
        if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8
                || this.month == 10 || this.month == 12) {
            if (this.day == 31) {
                dt.day = 1;
            } else if (this.day == 30) {
                dt.day = 31;
            } else {
                dt.day = this.day + 1;
            }
        } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
            if (this.day == 30) {
                dt.day = 1;
            } else {
                dt.day = this.day + 1;
            }
        } else if (this.month == 2) {
            if (this.day == 28) {
                dt.day = 1;
            } else {
                dt.day = this.day + 1;
            }
        }

        if (this.month == 12) {
            dt.month = 1;
        } else {
            dt.month = this.month + 1;
        }

        dt.year = this.year + 1;
        return dt;
    }

    public Date getPreviousDay() {
        Date dt = new Date();
        int prevDay = this.day - 1;
        int prevMonth = this.month;
        int prevYear = this.year;

        if (prevDay == 0) {
            prevMonth--;

            if (prevMonth == 0) {
                prevMonth = 12;
                prevYear--;
            }

            if (prevMonth == 2) {
                if (this.isLeapYear()) {
                    prevDay = 29;
                } else {
                    prevDay = 28;
                }
            } else if (prevMonth == 4 || prevMonth == 6 || prevMonth == 9 || prevMonth == 11) {
                prevDay = 30;
            } else {
                prevDay = 31;
            }
        }

        dt.day = prevDay;
        dt.month = prevMonth;
        dt.year = prevYear;

        return dt;
    }

}

class Program2_9 {
    public static void main(String[] args) {
        Date date = new Date(31, 12, 2022);
        System.out.println(date.isValid()); // true
        System.out.println(date.getDayOfWeek()); // 6 (Saturday)
        System.out.println(date.isLeapYear()); // false
        Date nextDay = date.getNextDay();
        System.out.println(nextDay.day + "-" + nextDay.month + "-" + nextDay.year); // 01-01-2023
        Date previousDay = date.getPreviousDay();
        System.out.println(previousDay.day + "-" + previousDay.month + "-" + previousDay.year); // 30-12-2022
    }
}