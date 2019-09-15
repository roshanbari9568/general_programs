import java.util.Arrays;
import java.util.Scanner;

public class practice_these {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your operation you want to perform ");
        System.out.println("Enter 1 to Check If Its Lapindrome or not");
        System.out.println("Enter 2 For Palindrome");
        System.out.println("Enter 3 for to find out Anagram String");
        System.out.println("Enter 4 For Factorial of Number");
        System.out.println("Enter 5 To reverse the String");
        System.out.println("Enter 6 To Check Prime number or not");
        System.out.println("Enter 7 To Check Even number or Odd number  ");
        System.out.println("Enter 8 To Know Year is Leap or Not");
        System.out.println("Enter 9 To Get the Fibonacci Series");
        System.out.println("Enter 10 To Get perfect square between 1 & 100");
        System.out.println("Enter 11 to get middle character of string");

        int number = sc.nextInt();

        switch (number) {

            case 1:

                System.out.println(" Enter the String to check its Lapindrome or not");
                String whole = sc.next();

                int len = whole.length();                      //Taking length of whole string and store it in len variable                                            
                String a = whole.substring(0, len / 2);        //Dividing the  length of whole string  into two halves starting from first value and store it in a variable                               
                int len1 = a.length();                           //Taking length of a and storing it in len1 variable                              
                String b = whole.substring(len - len1);        //Now subtract len1 - len2 it will give two equal halves 

                String x = a;                                    //Storing a into x
                String y = b;                                    //Storing b into y

                char arr_x[] = x.toCharArray();                  //converting x characters and storing it in array arr_x
                char arr_y[] = y.toCharArray();                  //converting y characters and storing it in array arr_y

                Arrays.sort(arr_x);                            //Sorting the arr_x
                Arrays.sort(arr_y);                            //Sorting the arr_y

                if (Arrays.equals(arr_x, arr_y)) //if sorted arr_x && arr_y matches, then its lapindrome
                {
                    System.out.println("Yes Its Lapindrome");
                } else {
                    System.out.println("No Its not");
                }
                break;

            case 2:
                System.out.print("Please enter numerical Values to check Its Palindrome or Not" + "  :");
                int pnumber = sc.nextInt();        //Taking number to check, here its int variable pnumber
                int r,
                 sum = 0,
                 temp;
                temp = pnumber;

                while (pnumber > 0) {
                    r = pnumber % 10;
                    sum = (sum * 10) + r;
                    pnumber = pnumber / 10;

                }

                if (temp == sum) {
                    System.out.println("Pallindrome");
                } else {
                    System.out.println("No its not");
                }
                break;

            case 3:
                System.out.println("Lets find out whether both sides are anagram or not : -");
                System.out.println("Please enter your first word or sentence");
                String xx = sc.next();
                System.out.println("Please enter your second word or sentence");
                String yy = sc.next();

                xx = xx.replace(" ", "");
                yy = yy.replace(" ", "");

                xx = xx.toLowerCase();
                yy = yy.toLowerCase();

                char aa[] = xx.toCharArray();
                char bb[] = yy.toCharArray();

                Arrays.sort(aa);
                Arrays.sort(bb);

                if (Arrays.equals(aa, bb)) {
                    System.out.println("Yes it is");
                } else {
                    System.out.println("No its not");
                }
                break;

            case 4:
                System.out.print("Please Enter to Numerical Values to find the factorial of given number" + "  :");
                int takennum = sc.nextInt();               //Taking takenum to check
                int fact = 1;
                for (int i = 1; i <= takennum; i++) {
                    fact = fact * i;

                }

                System.out.println("The factorial of" + " " + takennum + "is" + " " + fact);
                break;

            case 5:
                System.out.print("Please Enter the String to reverse it" + "  :");
                String takeString = sc.next();

                int leng = takeString.length();
                String revstring = "";

                for (int i = leng - 1; i >= 0; i--) {
                    revstring = revstring + takeString.charAt(i);
                }
                System.out.println(revstring);
                break;

            case 6:
                System.out.print("Please Enter the number to check its prime or not" + "  :");
                int takePrime = sc.nextInt();
                int tempo = 0;
                for (int i = 2; i < takePrime - 1; i++) {
                    if (takePrime % i == 0) {
                        tempo = tempo + 1;
                    }

                }
                if (tempo > 0) {
                    System.out.println("The given number" + takePrime + " " + "is Not a number");
                } else {
                    System.out.println("The given number" + takePrime + " " + " " + "is Prime a number");
                }
                break;

            case 7:
                System.out.print("Please Enter numerical Value to Check its even or odd" + "  :");
                int eorodd = sc.nextInt();

                if (eorodd % 2 == 0) {
                    System.out.println(eorodd + " " + " Even number");
                } else {
                    System.out.println(eorodd + " " + "is Odd number");
                }
                break;
            case 8:
                System.out.print("Enter any year to find its leap year or not" + "  :");
                int year = sc.nextInt();
                if (year % 400 == 0) {
                    System.out.println("Yes! Its Leap Year");
                } else if (year % 4 == 0 && year % 100 != 0) {
                    System.out.println("Yes! Its Leap Year");
                } else {
                    System.out.println("Nope! Its not Leap Year");
                }
                break;
            case 9:
                int fa = 0,
                 fb = 1,
                 fc = 0;
                System.out.print("Enter till how much Fibonacci Series" + "  :");
                int fn = sc.nextInt();
                System.out.print(fa + " " + fb + " ");

                for (int i = 1; i <= fn; i++) {
                    fc = fa + fb;
                    System.out.print(" " + fc + " ");
                    fa = fb;
                    fb = fc;

                }
                break;
            case 10:
                System.out.print("Enter your number to find whether its perfect square or not" + "  :");
                int pn = sc.nextInt();

                double mksqrt = Math.sqrt(pn);
                if (mksqrt == Math.ceil(mksqrt)) {
                    System.out.println("Yes! Its perfect Square");
                } else {
                    System.out.println("Nope! Its not perfect Square");
                }
                break;

            case 11:
                System.out.print("Please Enter your odd number String" + "  :");
                String mchar = sc.next();
                int lenth = mchar.length();
                int div = lenth / 2;
                char ch[] = mchar.toCharArray();
                System.out.println("Middle character of your String is" + " " + ch[div]);
                break;

        }

    }

}
