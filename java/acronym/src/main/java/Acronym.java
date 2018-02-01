class Acronym {
    
    private static String acronym;
    
    Acronym(String phrase) {
        StringBuilder acronym = new StringBuilder();
        boolean lastCharWasLetter = false;
        
        for (char c: phrase.toCharArray()) {
            if (Character.isLetter(c) && !lastCharWasLetter)
                acronym.append(c);
            lastCharWasLetter = Character.isLetter(c);
        }
        
        this.acronym = acronym.toString().toUpperCase();
    }

    String get() {
        return acronym;
    }

}
