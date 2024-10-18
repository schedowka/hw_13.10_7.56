import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfcity = scanner.nextInt();
        int maxDistance = 0;

        String maxCityName = "";

        for(int i = 1; i <= numberOfcity; i++) {
            System.out.println("введи название города " + i + ":");
            String cityName = scanner.next();

            System.out.println("введи расстояние до города " + cityName + ":");
            int distance = scanner.nextInt();
            if (distance > maxDistance) {
                maxDistance = distance;
                maxCityName = cityName;
            }
        }

        System.out.println("самое большое расстояние от москвы до " + maxCityName + " " + maxDistance + " км");
    }
}