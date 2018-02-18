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
        for (int i = 0; i < set.length; i++) {
            if (number % set[i] == 0) {
                return true;
            }
        }
        return false;
    }

    int getSum() {
        return sumOfMultiples;
    }

}
