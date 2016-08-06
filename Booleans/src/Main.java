import java.util.Date;

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
        //** The wrong way to compare String values **//
        if (s1 == s2){
            System.out.println("They match !\n");
        }
        else {
            System.out.println("They don't match !\n");
        }

        System.out.println("Second if statement:");
        //** The right way to compare Strings values.**//
        if (s1.equals(s2)){
            System.out.println("They match !\n");
        }
        else {
            System.out.println("They don't match !\n");
        }

        //** The wrong way to compare String values. **//
        if (s1 != s2) {
            System.out.println("They match !\n");
        }
        else {
            System.out.println("They don't match !\n");
        }

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The value of b1 is: " + b1);
        System.out.println("The value of b2 is: " + b2);

        boolean b3 =!b1;
        System.out.println("The value of b3 is: " + b3);

        int i = 1;
        boolean b4 = (i !=0);
        System.out.println("The value of b4 is: " + b4);

        String s = "True";
        boolean b5 = Boolean.parseBoolean(s);
        System.out.println("The value of b5 is: " + b5);

        char c = 'z';
        boolean bool = true;
        byte b = 127;
        short ss = 32000;
        int ii = 2000000;
        long l = 10000000L;
        float f = 12345.456789f;
        double d = 112312312331231231231231.34d;

        System.out.println(c);
        System.out.println(bool);
        System.out.println(b);
        System.out.println(ss);
        System.out.println(ii);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        System.out.println("The value os ss is " + ss);
        System.out.println(ss + " is the value of ss");

        Date myDate = new Date();
        System.out.println("The new date is " + myDate);


        //** Write code up to here **//
    }

}
