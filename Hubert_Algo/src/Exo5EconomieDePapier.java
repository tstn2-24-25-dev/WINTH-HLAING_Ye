import java.util.Scanner;

public class Exo5EconomieDePapier {

    public static void main(String[] args) {

        // take the number of line of the image from user
        Scanner scanner = new Scanner(System.in);

        int page = 1 ; // always start with page 1
        int  maximum_line = 10 ; // the const number of maximum lines

        // take the number with space between the lines
        String[] input = scanner.nextLine().split(" ");

        int[] image_height = new int[input.length];

        for ( int i = 0 ; i < image_height.length ; i++ ){
            image_height[i] = Integer.parseInt(input[i]);
           // System.out.println(image_height[i]); Debug code
        }

        // add to page with line of the image
        for ( int height : image_height ) {
                // if enough add to that page
            if ( height <= maximum_line ){
                maximum_line -= height;
                System.out.println("input height" + height + "\n"
                        + "the rest height" + maximum_line + "\n");
            }else {
                // if not , change another page to add the new image ,
                System.out.println("The rest is not sufficient to the page " + page);

                page++;
                maximum_line = 10 - height;
                System.out.println("input height " + height + "\n"
                        + "the rest height" + maximum_line + "\n"
                        + "the page" + page + "\n");
            }
        }

        // return the number of page
        System.out.println("The total number of page " + page);
    }


}
