class StringToInteger {
    public int myAtoi(String str) {
        int len = str.length();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int sign = 1;
        int ret = 0;
        int i = 0;

        // remove whitespace
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }

        // find sign
        if (i < len && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            int val = str.charAt(i)-'0';
            if (ret > Integer.MAX_VALUE / 10 || (ret == Integer.MAX_VALUE / 10 && val > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ret = ret*10 + val;
            i++;
        }
        return ret*sign;
    }
}