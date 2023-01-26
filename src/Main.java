import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public class Main {


    public static List<String> getPasswordStrength(List<String> passwords, List<String> common_words){
        // regex for numeric strings
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        List<String> strengths = new ArrayList<>();



        for(String s: passwords){

            if(s.equals(s.toUpperCase()) || s.equals(s.toLowerCase()) || s.length() < 6 || common_words.contains(s) ||
                    pattern.matcher(s).matches()){
                strengths.add("weak");
            }


            else{
                strengths.add("strong");
            }

        }

        return strengths;

    }
    public static void main(String[] args) {

        List<String> passwords = new ArrayList<>(Arrays.asList("hello", "paSswOrd1234", "123456789", "aRdi2000"));
        List<String> common_words = new ArrayList<>(Arrays.asList("hi", "hello", "passWord123"));



       List<String> passwordStrengths = getPasswordStrength(passwords, common_words);
       System.out.println(passwordStrengths);

    }
}
