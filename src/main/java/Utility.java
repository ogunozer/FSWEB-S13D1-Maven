public class Utility {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return isBarking && (hourOfDay < 8 || hourOfDay > 20);
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        return (age1 >= 13 && age1 <= 19) ||
                (age2 >= 13 && age2 <= 19) ||
                (age3 >= 13 && age3 <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        int upperLimit = isSummer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}
