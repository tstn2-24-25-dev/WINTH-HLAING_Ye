import java.util.*;
import java.util.stream.Collectors;

public class Exo6Ceremoniedouverture {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HashMap< String , Float > countryWithAverageSecond = new HashMap<String , Float>();

             // take the total number of country that you want to make input
        System.out.println("Enter the number of country which will be in Olympics :");

        int num_country = input.nextInt();
        input.nextLine(); // add this scanner because of index bound exception

            // take the country , distance , speed  , parseInt with space ( and store with array list )
        for ( int i = 0 ; i < num_country ; i++ ) {
            String line = input.nextLine();
            String[]  parts = line.split(" ");

            //  System.out.println( parts );

            String name = parts[0];
            int distance = Integer.parseInt(parts[1]);
            int second = Integer.parseInt(parts[2]);

            // System.out.println( name + " " + distance + " " + secondparmeter);

            // calculate the shortest time ( distance / second )
            float average_per_second = distance / second ;

            // store the name of the country and average distance par second
            countryWithAverageSecond.put( name , average_per_second );
        }

        // print the value and key of the info of country
        for (Map.Entry<String , Float> info : countryWithAverageSecond.entrySet() ){
            System.out.println(info.getKey() + " " + info.getValue());
        }

        System.out.println("======================================================");

        // return the country with shortest time
        System.out.printf("The Shortest distance of country to go to the Olympic %s " , sorting_country_with_average_distance(countryWithAverageSecond));
    }

        // find the country with the shortest time ( sorting )
        public static String sorting_country_with_average_distance ( HashMap<String , Float > countryWithAverageSecond) {

            //find the max number
            float min = Collections.min(countryWithAverageSecond.values());

            // find the country Name which has the m
           String  countryName = countryWithAverageSecond
                    .entrySet()
                    .stream()
                    .filter( entry -> entry.getValue() == min )
                    .map ( entry -> entry.getKey())
                    .collect(Collectors.toList()).toString();

           return countryName;
        };




    }

//
//// create a list from the elements of hashmap
//List<Map.Entry<String,Float>> list =
//        new LinkedList<Map.Entry<String,Float>>(countryWithAverageSecond.entrySet());
//
//// sort the list
//            Collections.sort(list, new Comparator<Map.Entry<String, Float>>() {
//    @Override
//    public int compare(Map.Entry<String, Float> o1, Map.Entry<String, Float> o2) {
//        return (o1.getValue()).compareTo(o2.getValue());
//    }
//});
//
//// put the sorted data to hashmap
//HashMap<String,Float> temp = new LinkedHashMap<String,Float>();
//
//            for ( Map.Entry<String,Float> country : list ){
//        temp.put(country.getKey(), country.getValue());
//        }
//        // return hashmap value
//        return temp ;

