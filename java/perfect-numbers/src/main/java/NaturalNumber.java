class NaturalNumber {

    private static Classification classification;
    
    NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }

        int aliquotSum = 0;
        
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                aliquotSum += i;
            }
        }
        
        if (number == aliquotSum) {
            this.classification = Classification.PERFECT;
        } else if (number > aliquotSum) {
            this.classification = Classification.DEFICIENT;
        } else {
            this.classification = Classification.ABUNDANT;
        }
    }

    public Classification getClassification() {
        return this.classification;
    }
}
