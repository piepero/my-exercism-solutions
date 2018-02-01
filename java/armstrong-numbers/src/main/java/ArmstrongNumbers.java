class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		String numberAsString = Integer.toString(numberToCheck);
        
        Integer testSum = 0;
        
        for (char c: numberAsString.toCharArray()) {
            testSum += (int)Math.pow(Character.getNumericValue(c), numberAsString.length());
        }
		
        return testSum == numberToCheck;
	}

}
