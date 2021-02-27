class StringtoInt {
    public static int StringToInt(String a) {
        int i = 0;
        int sign = 1;
        int result = 0;
        if (a.length() == 0)
            return 0;

        while (i < a.length() && a.charAt(i) == ' ')
            i++;

        if (i < a.length() && (a.charAt(i) == '+' || a.charAt(i) == '-'))
            sign = (a.charAt(i++) == '-') ? -1 : 1;
        while (i < a.length() && a.charAt(i) >= '0' && a.charAt(i) <= '9') {
            if (result > Integer.MAX_VALUE / 10
                    || (result == Integer.MAX_VALUE / 10 && a.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (a.charAt(i++) - '0');
        }
        return result * sign;

    }

    public static void main(String[] args) {
        String a = "-5445";
        String b = "  343";

        System.out.println(StringToInt(a));
        System.out.println(StringToInt(b));
    }

}