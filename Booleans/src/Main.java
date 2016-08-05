
public class Main {

	public static void main(String[] args) {

	    int intValue = 10;
		System.out.println("Value of intValue before PostFix: " + intValue ++);
        System.out.println("Value of intValue after Postfix: " + intValue);
        intValue = 10;
        System.out.println("Value of intValue with Unary: " + ++ intValue + "\n");

        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println("First if statement:");
        if (s1 == s2){
            System.out.println("They match !" + "\n");
        }
        else {
            System.out.println("They don't match !" + "\n");
        }

        System.out.println("Second if statement:");
        if (s1.equals(s2)){
            System.out.println("They match !" + "\n");
        }
        else {
            System.out.println("They don't match !" + "\n");
        }
    }

}
