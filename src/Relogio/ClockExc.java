package Relogio;

public class ClockExc {

    public static void main(String[] args) {
        Clock brlClock = new BRLClock();
        brlClock.setSecond(0);
        brlClock.setMinute(0);
        brlClock.setHour(13);

        System.out.println(brlClock.getTime());

        System.out.println(new USClock().convert(brlClock).getTime());
    }
}
