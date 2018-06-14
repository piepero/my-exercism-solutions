class LuhnValidator {

    boolean isValid(String candidate) {
        StringBuilder reverseCandidate = new StringBuilder(candidate).reverse();

        int currentCharVal;
        int sum = 0;
        int numberOfValidChars = 0;
        int factor = 1;
        int charValue;

        for (int i = 0; i < reverseCandidate.length(); i++) {
            currentCharVal = reverseCandidate.charAt(i) - '0';
            
            if ((currentCharVal >= 0) && (currentCharVal <= 9)) {
                numberOfValidChars++;
                if (factor * currentCharVal > 9) {
                    sum += factor * currentCharVal - 9;
                } else {
                    sum += factor * currentCharVal;
                }
                factor = 3 - factor;  // alternates between 1 and 2
            } else {
                // test for illegal characters. Only space is allowed in addition to the numbers.
                if (currentCharVal != ' ' - '0') {
                    return false;
                }
            }
        }
        
        return (numberOfValidChars > 1) && (sum % 10 == 0);
    }
}
