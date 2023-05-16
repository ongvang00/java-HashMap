import java.util.HashMap;
import java.util.Map;

public class nicknames {
        public static void main(String[] args) {
            HashMap<String, String> nicknames = new HashMap<>();

            nicknames.put("Matthew", "Matt");
            nicknames.put("Michael", "Mix");
            nicknames.put("Arthur", "Artie");
            System.out.println(nicknames.get("Matthew"));
        }
}


