import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {

    public static void main(String[] args){
        /*A regular expression is a sequence of characters
        //that forms a search pattern. When you search for data in a text,
        //you can use this search pattern to describe what you are searching for*/

        Pattern pattern=Pattern.compile("JAVA",Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher("my java school");
        boolean matchFound=matcher.find();
        if(matchFound){
            System.out.println("Match Found");
        }else {
            System.out.println("Match not found");
        }

        }
    }

