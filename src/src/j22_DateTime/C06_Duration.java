package src.j22_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {

        LocalTime gece = LocalTime.of(0,17);
        LocalTime oglen = LocalTime.of(13,24);

        Duration fark = Duration.between(gece,oglen);

        System.out.println("fark = " + fark); // PT13H7M
        System.out.println("fark.getSeconds() = " + fark.getSeconds()); // 47220
        System.out.println("fark.toHours() = " + fark.toHours()); //  13
        System.out.println("fark.toMinutes() = " + fark.toMinutes()); // 787

    }
}
