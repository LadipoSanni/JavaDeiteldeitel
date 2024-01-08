package exercisesJava;

public class CharacterFrequencyInString {
    public static void main(String[] args) {
        char freq = 'n';
    String stringSample = "international";
    countCharFrequency(stringSample,freq);
    }

    private static void countCharFrequency(String stringSample, char freq) {
        int count = 0;
        for (int i = 0; i < stringSample.length(); i++) {
            if (stringSample.charAt(i)==freq){
                count++;
            }

        }
        System.out.println("The number of times that " +freq+" appear in "+ stringSample +" is " + count );
    }

}
//NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
//        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
//        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
