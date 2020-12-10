class ReverseInteger {
    public int reverse(int x) {
        int i = 0;
        int temp = x;
        int digit;
        double total;
        while ((x = x/10) != 0) {
            i++;
        }
        total = (temp%10)*Math.pow(10,i);
        i--;
        while ((temp = temp/10) != 0) {
            digit = temp%10;
            total = total + digit*Math.pow(10,i);
            i--;
        }
        if (total > Integer.MAX_VALUE || total < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) total;
    }
}