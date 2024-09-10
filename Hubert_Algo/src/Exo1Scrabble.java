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

        // print the line by line
        split_line(dataset);



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
}

//// Construire la table de correspondance des lettres et des scores
//        for (int i = 0; i < scoreInput.length; i += 2) {
//char letter = scoreInput[i].charAt(0);
//int score = Integer.parseInt(scoreInput[i + 1]);
//            letterScores.put(letter, score);
//        }
