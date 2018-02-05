class Proverb {

    private static String proverb;

    Proverb(String[] words) {
        StringBuilder proverb = new StringBuilder();

        for (int i = 0; i < words.length - 1; i++) {
            proverb.append(String.format("For want of a %s the %s was lost.\n", words[i], words[i + 1]));
        }
        if (words.length > 0) {
            proverb.append(String.format("And all for the want of a %s.", words[0]));
        }
        this.proverb = proverb.toString();
    }

    String recite() {
        return this.proverb;
    }

}
