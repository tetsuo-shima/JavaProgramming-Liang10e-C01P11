package C01P11;

/*
(Population projection) The U.S. Census Bureau projects population based on the following assumptions:
        One birth every 7 seconds
        One death every 13 seconds
        One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume the current population is
312,032,486 and one year has 365 days.
*/

public class Main {

    public static void main(String[] args) {
        final int STARTING_POPULATION = 312032486;
        int population;

        for (int year = 1; year <= 5; year++) {
            population = STARTING_POPULATION + born(year) + immigrated(year) - died(year);
            System.out.println("Year " + year + " Population: " + population);
        }
    }

    public static int born(int years){
        final int SECONDS_FOR_BIRTH = 7;

        return totalSeconds(years) / SECONDS_FOR_BIRTH;
    }

    public static int died(int years) {
        final int SECONDS_FOR_DEATH = 13;

        return totalSeconds(years) / SECONDS_FOR_DEATH;
    }

    public static int immigrated(int years) {
        final int SECONDS_FOR_IMMIGRANT = 45;

        return totalSeconds(years) / SECONDS_FOR_IMMIGRANT;
    }

    public static int totalSeconds(int years) {
        final int SECONDS_IN_DAY = 86400;
        final int DAYS_IN_YEAR = 365;

        return SECONDS_IN_DAY * DAYS_IN_YEAR * years;
    }
}
