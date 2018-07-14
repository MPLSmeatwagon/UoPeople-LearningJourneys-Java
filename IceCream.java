/*
 * Program that reads a text file of ice cream sales by flavor. The program will
 * keep track of total items listed as well as total number of strawberry sales.
 * Output will be both totals as well as the percentage of sales that are strawberry.
 */
package icecream;


public class IceCream {

   
    public static void main(String[] args) {
        
        int strawberry = 0;  //counter for total strawberries sold
        int totalSales = 0;  //counter for total icecreams sold
        // variable to hold the current line being read and checked for strawberry
        String flavors; 
        
        //read ice cream sales text file
        TextIO.readFile("/Users/plautzhold/NetBeansProjects/IceCream/src/icecream/icecream.txt");
        
        // read list line by line until completed, 
        // counting up sales totals(all flavors and strawberry)
        while ( ! TextIO.eof()) {
            flavors = TextIO.getln(); 
            totalSales++;
            if (flavors.equals("Strawberry")) {
                 strawberry++;
            }
           
        }
        
        // type convert to get a real number that represents % of strawberry ice cream sold
        float percentage = strawberry/totalSales * 100; 
        
        // output - print the totals and percentage
        System.out.println("Total ice creams sold: " + totalSales);
        System.out.println("Total that were strawberry: " + strawberry);
        System.out.printf("%1.1f", percentage);
        System.out.println("% of total sales were strawberry");
    }
    
}
