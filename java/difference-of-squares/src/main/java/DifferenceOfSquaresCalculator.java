import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        // https://de.wikipedia.org/wiki/Gau%C3%9Fsche_Summenformel
        int num = (input * (input + 1)) / 2;
        return num * num;
    }

    int computeSumOfSquaresTo(int input) {
        // https://en.wikipedia.org/wiki/Square_pyramidal_number
        return (input * (input + 1) * (2 * input + 1)) / 6;
    }

    int computeDifferenceOfSquares(int input) {
        return this.computeSquareOfSumTo(input) - this.computeSumOfSquaresTo(input);
    }

}
