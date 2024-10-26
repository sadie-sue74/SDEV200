import java.util.*;

public class exercise_6_31
{
    public static void main(String [] args)
    {
        long ccNum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        ccNum=in.nextLong();
        if (isValid(ccNum))
            System.out.println(ccNum + " is a valid credit card");
        else
            System.out.println(ccNum + " is not a valid credit card");
    }

    // return true if the card number is valid
    public static Boolean isValid(long number)
    {
        int num;
        long pre;
        pre=getPrefix(number,1);
        if(pre < 4)
            return false;
        if(pre > 6)
            if(getPrefix(number,2) != 37)
                return false;
        num=getSize(number);
        if(num < 13 || num > 16)
            return false;
        if((sumOfDoubleEvenPlace(number) + sumOfoddPlace(number)) % 10 != 0)
            return false;
        return true;
    }

    // get the result from Step 2
    public static int sumOfDoubleEvenPlace(long number)
    {
        int x, total = 0;
        for(x = 1; x <= 16; x++)
            {if(x % 2 == 0)
                    total = total + getDigit((int)(number % 10) * 2);
            number /= 10;
            }
        return total;      
    }

    // return this number if it is a single digit, otherwise, return the sum of the two digits
    public static int getDigit(int number)
    {
        if(number < 10)
            return number;
        else
            return (number / 10) + (number % 10);

    }

    // return sum of odd place digits in number
    public static int sumOfoddPlace(long number)
    {
        int x, total = 0;
        for(x = 1; x <= 16; x++)
            {if(x % 2 == 1)
                    total = total + (int)(number % 10);
                number/=10;
            }
        return total;   
    }

    // return true if the digit d is a prefix for number
    public static boolean prefixMatched(long number, int d)
    {
        if(getPrefix(number,1) == d || getPrefix(number,2) == d)
            return true;
        return false;
    }

    // return the number of digits in d
    public static int getSize(long d)
    {
        int n = 0;
        while(d != 0)
            {n++;
            d /= 10;
            }
        return n;
    }

    /* return the first k number of digits from number. If the number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k)
    {
        if(k == 1)
            return number/1000000000000000L;
        if(k == 2)
            return number/100000000000000L;
        return 0;
    }
}