class ReverseWordsString {
    public void reverse(char[] s, int left, int right) {
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }

    public void reverseEachWord(String a) {
        int n = a.length;
        int start = 0, end = 0;

        while (start < n) {

            while (end < n && a[end] != ' ')
                ++end;

            reverse(a, start, end - 1);

            start = end + 1;
            ++end;
        }
        
    }

    public static void reverseWords(String a) {

        reverse(a, 0, a.length() - 1);

        reverseEachWord(a);
    }



}
