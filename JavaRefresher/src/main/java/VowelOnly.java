public class VowelOnly {
    public static String vowelOnly(String input) {
        String vowel = "aeiou";
        StringBuilder sb = new StringBuilder();
        for(char c : input.toCharArray()) {
            if(vowel.indexOf(c) != -1) {
                sb.append(c);
            }
        }
        String output = sb.toString();
        return output;
    }
}
