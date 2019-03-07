public class Time {
    public static void main(String[] args) {
        double secondsnday = 86400.0; // seconds in a day i.e 24 hours.
        int hour = 2;
        int minute = 50;
        int second = 30;
        int totalseconds = (hour*60*60)+(minute*60)+(second); // total seconds since midnight.

        System.out.print("The number of seconds since midnight: ");
        System.out.println(totalseconds);
        System.out.print("Percentage of the day that has passed: ");
        System.out.println((totalseconds*100)/secondsnday + "%");
        System.out.println(System.out);

    }
}
