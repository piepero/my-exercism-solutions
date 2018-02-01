import java.util.HashMap;

class RnaTranscription {
    
    // create a static conversion map once for all calls to transcribe
    private static final HashMap<Character, Character> dnaToRnaMap = getDnaToRnaMap();
    private static HashMap<Character, Character> getDnaToRnaMap() {
        HashMap<Character, Character> MyMap = new HashMap<Character, Character>();
        MyMap.put('G', 'C');
        MyMap.put('C', 'G');
        MyMap.put('T', 'A');
        MyMap.put('A', 'U');
        return MyMap;
    }

    String transcribe(String dnaStrand) {

        StringBuilder rnaStrand = new StringBuilder();
        
        // traverse DNA strand and assemble RNA in StringBuilder
        for (char c: dnaStrand.toCharArray()) {
            rnaStrand.append(dnaToRnaMap.get(c));
        }
        
        return rnaStrand.toString();
    }

}
