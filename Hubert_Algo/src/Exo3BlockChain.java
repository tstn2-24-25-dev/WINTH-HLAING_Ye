import java.util.Scanner;

public class Exo3BlockChain {

    public static void main(String[] args) {

        // read the number of people storing the book ( P )
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of people storing the book");
        int num_people = Integer.parseInt(input.nextLine());

        // read the number of writing request
        int writing_request = Integer.parseInt(input.nextLine());

        // calculate the majority of people threshold ( the half of the people /2 )
        int threshold = num_people / 2 ;

        // do a StringBuilder class to store the final result of character
        StringBuilder book = new StringBuilder();

        // take each request with alphabet with request
        for ( int i = 0 ; i < writing_request ; i++ ) {
            String[] request = input.nextLine().split(" ");
            String letter = request[0];
            int approval_letter = Integer.parseInt(request[1]);

            if ( approval_letter > threshold ) {
                book.append(letter + " ");
            }
        }
        // output the final content of the book
        System.out.println(book.toString());

        input.close();
    }
}





