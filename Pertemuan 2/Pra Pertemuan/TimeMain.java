public class TimeMain {
    public static void main(String[] args) {
        Time currentTime1 = new Time(0, 0, 0);
        System.out.println("Current Time 1: " + currentTime1.toString());

        Time nextSecond1 = currentTime1.nextSecond();
        System.out.println("Next Second: " + nextSecond1.toString());

        Time previousSecond1 = currentTime1.previousSecond();
        System.out.println("Previous Second: " + previousSecond1.toString());

        Time currentTime2 = new Time(23, 59, 59);
        System.out.println("\n" + "Current Time 2: " + currentTime2.toString());

        Time nextSecond2 = currentTime2.nextSecond();
        System.out.println("Next Second: " + nextSecond2.toString());

        Time previousSecond2 = currentTime2.previousSecond();
        System.out.println("Previous Second: " + previousSecond2.toString());
    }

}
