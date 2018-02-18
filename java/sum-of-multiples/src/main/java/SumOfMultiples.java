class SumOfMultiples {

    private int sumOfMultiples;

    SumOfMultiples(int number, int[] set) {
        this.sumOfMultiples = 0;

        for (int i = 0; i < number; i ++) {
            if (isMultipleOf(i, set)) {
                this.sumOfMultiples += i;
            }
        }
    }

    boolean isMultipleOf(int number, int[] set) {
        // check if number can be evenly devided by any of the values in set
        for (int i: set) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }

    int getSum() {
        // return the precomputed value
        return sumOfMultiples;
    }

}
