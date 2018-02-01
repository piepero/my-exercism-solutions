public class PangramChecker {

    public boolean isPangram(String input) {
        String remainingChars = "abcdefghijklmnopqrstuvwxyz";
        
        for (char c: input.toLowerCase().toCharArray()) {
            remainingChars = remainingChars.replace(String.valueOf(c), "");
        }
        
        return 0 == remainingChars.length();
    }

}
