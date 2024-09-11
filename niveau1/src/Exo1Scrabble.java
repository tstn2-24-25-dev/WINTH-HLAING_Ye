import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;


public class Exo1Scrabble {


    // read the 1st line of the text file
    public static String readFile ( String file_location ) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file_location));

        String first_line = reader.readLine();

        reader.close();

        return first_line;
    }
    // take the list of word from the text file
    public static ArrayList<String> wordList (String file_location ) throws  IOException {
        ArrayList<String> word_list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file_location));

        String line ;
        boolean first_line = true ;

        while ( ( line = reader.readLine()) != null ){
            if ( first_line ){
                first_line = false ;
                continue;
            }
            word_list.add(line.trim());
        }
        reader.close();
        return word_list;
    }

    // calculate the score of the alphabet
    public static int calculate_score ( String word , String file_location ) throws IOException {
        HashMap<String , Integer > point = new HashMap<>();
        String[] first_line = readFile(file_location).split(" ");

        for ( int i = 0 ; i < first_line.length ; i += 2 ){
            point.put( first_line[i] , Integer.parseInt( first_line[i+1]));
        }

        int score = 0 ;

        for ( char alphabet : word.toCharArray()){
            String alphabet_string = String.valueOf(alphabet);
            if ( point.containsKey(alphabet_string)){
                score += point.get(alphabet_string);
            }
        }
        return score;
    }

    // sorting from the maximum to minimum point
    public static ArrayList<String> sorting (ArrayList<String> words , String file_location ) throws IOException {
        words.sort( ( word1 , word2 ) -> {
            try{
                return Integer.compare( calculate_score( word2 , file_location ) ,
                                        calculate_score( word1 , file_location));
            }catch( IOException e){
                e.printStackTrace();
                return 0;
            }
        });
        return words;
    }


    public static void main(String[] args) throws IOException {

        String file_location="src/data.txt";

        // output 1st line
        String s = readFile(file_location);

        System.out.println(s);

        // store the word list in array List
        ArrayList<String> word_list = wordList(file_location);

        System.out.println(word_list);

//        System.out.println(calculate_score("zebra" , file_location));
//        System.out.println(calculate_score("bug" , file_location));
//        System.out.println(calculate_score("button" , file_location));

        // sort the word with point
        ArrayList<String> sortingList = sorting( word_list , file_location );

        for ( String word : sortingList ){
            System.out.println(word);
        }
    }
}


