class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        int pos = 10;
        int sum = 0;

        for (char ch: stringToVerify.toCharArray()) {
            if ((ch >= '0' && ch <= '9') || ch == 'X') {
                if (pos < 1 || (ch == 'X' && pos != 1)) {
                    return false;
                }
                sum += pos * (ch == 'X' ? 10 : (int)ch - (int)'0');
                pos--;
            }
        }
        return sum % 11 == 0;
    }

}
