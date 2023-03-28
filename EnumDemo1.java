enum COLORS {
    // group of named constant
    RED,
    GREEN,
    BLUE
}

enum Days {
    SUN, MON, TUE, WED, THUR, FRI, SAT
}

class EnumDemo1 {
    public static void main(String[] args) {
        COLORS c1 = COLORS.GREEN;
        System.out.println(c1 + " " + COLORS.GREEN.ordinal());

        Days d1;

        d1 = Days.TUE;

        switch (d1) {
            case MON:
                System.out.println("Monday!");
                break;
            case TUE:
                System.out.println("Tuesday!");
                break;
            case WED:
                System.out.println("Wednesday!");
                break;
            case THUR:
                System.out.println("Thursday!");
                break;

        }

    }

}