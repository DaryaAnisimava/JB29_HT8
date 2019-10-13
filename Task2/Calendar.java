package by.epam.les10.main;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;


    public class Calendar {
    	//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздниках
        private ArrayList<Holiday> holidays;

        public Calendar(int year) {
            this.holidays = new ArrayList<>();

            findWeekend(year);
        }

        private void findWeekend(int year) {
            LocalDate date = LocalDate.of(year, 1, 1);
            while (date.getDayOfWeek() != DayOfWeek.SATURDAY&& date.getDayOfWeek() != DayOfWeek.SUNDAY) {
                date = date.plusDays(1);
            }
            while (date.getYear() == year) {
                if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                    holidays.add(new Holiday(date, "Saturday"));
                    date = date.plusDays(1);
                } else if(date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                    holidays.add(new Holiday(date, "Sunday"));
                    date = date.plusDays(6);
                } else { date = date.plusDays(1); }
            }
        }


        public void addHoliday(LocalDate holidayDate, String holidayName)
        {
            holidays.add(new Holiday(holidayDate, holidayName));
            holidays.sort(Comparator.comparing(Holiday::getHolidayDate).thenComparing(Holiday::getHolidayName));
        }


        public void printHolidays() {
            for (Holiday holiday : holidays) {
                System.out.println(holiday);
            }
        }

        class Holiday {
            private LocalDate holidayDate;
            private String holidayName;

            public Holiday(LocalDate holiday, String holidayName) {
                this.holidayDate = holiday;
                this.holidayName = holidayName;
            }

            public LocalDate getHolidayDate() {
                return holidayDate;
            }

            public String getHolidayName() {
                return holidayName;
            }

            @Override
            public String toString() {
                return holidayDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                        " - " + holidayName;
            }
        }
    }
