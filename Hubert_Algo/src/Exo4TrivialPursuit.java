public class Exo4TrivialPursuit {

    public static void main(String[] args) {

        // list of color by dice number
        String[] color = {
                "violet", "orange" , "yeune" , "vert" , "rose" , "bleu"
        };

        // total for roll dice
        int total = 0 ;

        // to store the number of dice rolled by player
        int[] num_dice = { 5 , 6 , 4 , 3 } ;

        for ( int i = 0 ; i < num_dice.length ; i++ ){
           // System.out.println(num_dice[i]);
             total += num_dice[i];
        }

        int colorOfPlayer = total % 6 ;

        //System.out.println(color[colorOfPlayer]);

        System.out.printf("The place of player in tournement is : %s ," +
               " \nThe color of player is : %s " , total , color[colorOfPlayer]);
    }
}
