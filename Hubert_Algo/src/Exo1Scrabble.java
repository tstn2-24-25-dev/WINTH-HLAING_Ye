import java.util.HashMap;

public class Exo1Scrabble {



    public static void main(String[] args) {

        // split the 1st line and the others line from output
        String dataset = """
                a 2 b 4 c 5 d 8 e 12 f 3 g 18
                car 
                var
                yolo
                ill
                nice
                international
                """;

    // initialize the alphabets and the points
        HashMap<Character, Integer> alphabet ;
        alphabet = new HashMap< Character , Integer>();
        alphabet.put('a', 2);
        alphabet.put('b', 4);
        alphabet.put('c', 5);
        alphabet.put('d', 8);
        alphabet.put('e', 12);
        alphabet.put('f', 3);
        alphabet.put('g', 18);

        // print the line by line
        // split_line(dataset);

        match_alphabet_sum("bear" , alphabet);

        // match with character in dataset


        //  total

        // sort with point
    }
    public static void split_line(String dataset) {

        // split the line
        String[] split = dataset.split( "\n" );
        // the rest , will continue in array list
        for ( String line : split){
            System.out.println( line );
        }
    }

    public static  int match_alphabet_sum ( String word  , HashMap<Character , Integer> alphabet){

        int sum = 0 ;

        for ( int i = 0 ; i < word.length() ; i++ ){
            sum += alphabet.get(word.charAt(i));
        }

        return sum ;
    }
}


