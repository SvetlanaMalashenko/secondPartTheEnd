package beer;

/**
 * Created by svetlana on 25.09.16
 *
 Create a BEER enum which represents types of beer and holds the following info per each beer:
 type, alcohol content as described in below table
 Create a program the will print all the beer types and its full information
 *
 */
public class BeerList {
    public static void main(String[] args) {
        for(Beer beer : Beer.values()) {
            System.out.print(beer);
            System.out.println(" type: " + beer.type() + " " + beer.alcohol() + "%");
        }
    }
}