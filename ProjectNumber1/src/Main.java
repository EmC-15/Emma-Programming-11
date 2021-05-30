public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {

        int answer = 0;

        //goes through the string
        for (int i=0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            //checks if the string contains a, e, i, o, or u
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
                //counts up the number of vowels
                answer ++;
            }
        }
        System.out.println(s + "\n"); //prints the string
        System.out.println("Number of vowels: " +answer + "\n"); //prints the number of vowels

        return answer;
    }



    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;

        for(int i = 0; i<s.length(); i++){

            //stops the code 2 indexes before the end of the string
            if(i == s.length() - 2){
                break;
            }
            //checks if bob occurs, then adds 1 to answer
            if(s.substring(i, i+3).equals("bob")){
                answer += 1;

            }
        }
        //System.out.println(s); //prints the string
        System.out.println("Number of times bob occurs: " + answer + "\n"); //prints the occurrences of bob

        return answer;
    }



    //Code your solution to problem number 3 here
    static String problemThree(String s) {
        //your code here
        String current = ""; //starts with nothing
        String longest = current; //the longest will be the current string


        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            //adds a character to the current string if c is greater or equal to one index less than the current string length
            if (current == "" || c >= current.charAt(current.length() - 1)) {
                current += c;
            }
            else {
                //the longest equals the current string if the current string's length is greater than the longest string's length
                if (current.length() > longest.length()) {
                    longest = current;
                }
                //current string is always c + something (or just c)
                current = c + "";
            }
        }
        //the longest equals the current string if the current string's length is greater than the longest string's length
        if (current.length() > longest.length()) {
            longest = current;
        }

        System.out.println("Longest substring in alphabetical order: " + longest); //prints the longest substring in alphabetical order
        return longest;
    }




    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s = "azcbobobegghakl";
        problemOne(s);
        problemTwo(s);
        problemThree(s);
    }
}
