/* A program that requests a string from the user and tests whether or not the string
 * is a palindrome. All non-alphabetic characters and spaces will be removed from users'
 * entry, the string will be tested, output will say if string IS or IS NOT a palindrome.
 */
package firstsubroutines;

public class FirstSubroutines {

    public static void main(String[] args) {
        String userInput; // store users' initial input for testing
        String forwards; // stores the stripped down version of string(no non-abc's, lower-case)
        String backwards; // reverse of the 'forwards' string variable
        
        // program uses textio.java (david eck) for user input
        System.out.print("Enter a string: "); // user enters a string to test
        userInput = TextIO.getln();
        forwards = takeOutExtra(userInput); // returns the 'stripped down' string (only lower abc's)
        System.out.println("Here's your stripped entry: \n"+forwards);
        backwards = reverseString(forwards); // returns the 'stripped down' string in reverse.
        System.out.println("Here it is reversed: \n" + backwards);
        // test if the forward and reverse strings are the same - if yes: palindrome. Else: not.
        if(forwards.equals(backwards)){
            System.out.println("This IS a palindrome!");
        }
        else{
            System.out.println("This IS NOT a palindrome");
        }    
    }
    
    /**
     * reverseString() will take in a string and return a new string that is essential just  
     * the same string in reverse order. Example: "Hello" would return "olleH" 
     */
    static String reverseString(String flipMe){
        String reverse = ""; // empty string to store the chars of string in reverse
        int i;
        // iterate through string in reverse adding the chars in reverse order
        for (i = flipMe.length() - 1; i >= 0; i-- ){
            reverse = reverse + flipMe.charAt(i);   
        }
        return reverse; 
    }
    
    /**
     * takeOutExtra() takes in a string as input, it makes all chars lower case, removes 
     * any non-alphabet chars, and returns the new string. Example: "Hi, I'm 42 y/o" returns
     * "hiimyo"
     */
    static String takeOutExtra(String userInput){
        userInput = userInput.toLowerCase();
        String userInputAlt = "";
        for (int i = 0; i < userInput.length(); i++){
            if (userInput.charAt(i) >= 'a' && userInput.charAt(i) <= 'z'){
                userInputAlt = userInputAlt + userInput.charAt(i);
            }
        }
        return userInputAlt;
    }

}
