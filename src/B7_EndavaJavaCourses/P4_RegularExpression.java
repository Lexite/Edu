package B7_EndavaJavaCourses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P4_RegularExpression {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("alex", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit w3Schools!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
    }
}
