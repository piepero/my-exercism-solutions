import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

class ProteinTranslator {

    private static final Map<String, String> codonToProteinMap = createCodonToProteinMap();
    private static Map<String, String> createCodonToProteinMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("AUG", "Methionine");
        map.put("UUU", "Phenylalanine");
        map.put("UUC", map.get("UUU"));
        map.put("UUA", "Leucine");
        map.put("UUG", map.get("UUA"));
        map.put("UCU", "Serine");
        map.put("UCC", map.get("UCU"));
        map.put("UCA", map.get("UCU"));
        map.put("UCG", map.get("UCU"));
        map.put("UAU", "Tyrosine");
        map.put("UAC", map.get("UAU"));
        map.put("UGU", "Cysteine");
        map.put("UGC", map.get("UGU"));
        map.put("UGG", "Tryptophan");
        map.put("UAA", "STOP");
        map.put("UAG", map.get("UAA"));
        map.put("UGA", map.get("UAA"));
        return map;
    }

    List<String> translate(String rnaSequence) {
        List<String> translation = new ArrayList<String>();
        String protein;

        for (int i = 0; i < rnaSequence.length(); i += 3) {
            protein = codonToProteinMap.get(rnaSequence.substring(i, i + 3));
            if (protein == "STOP") {
                break;
            } else {
                translation.add(protein);
            }
        }

        return translation;
    }
}