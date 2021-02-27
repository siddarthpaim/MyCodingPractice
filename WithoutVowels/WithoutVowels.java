class WithoutVowels {
    public static String withoutVowel(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "in the middle of the garden";
     
        String ab = withoutVowel(a);

        System.out.println(ab);

    }
}