class RaindropConverter {

    String convert(int number) {
        StringBuilder rainSound = new StringBuilder();
        
        if (number % 3 == 0)
            rainSound.append("Pling");
        if (number % 5 == 0)
            rainSound.append("Plang");
        if (number % 7 == 0)
            rainSound.append("Plong");
        
        if (rainSound.length() == 0)
            rainSound.append(number);
        
        return rainSound.toString();            
    }

}
