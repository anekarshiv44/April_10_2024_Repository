import java.util.Scanner;

/**
 * Exceptions are
 * 484 841 etc
 */
public class SquareRootByBinarySearch {
    public static void main(String[] args) {
        System.out.println("HELLO KITTOL :) ENTER A NUMBER");
        Integer A=Integer.parseInt(new Scanner(System.in).nextLine().trim());
        Integer sqrt=findSquareRoot(A);
        StringBuilder resultText=new StringBuilder("The square root of "+A);
        resultText=sqrt==-1?resultText.append(" Does NOT exist!"):resultText.append(" is "+sqrt);
        System.out.println(resultText.toString());
    }

    static Integer findSquareRoot(final Integer A)
    {
        //find by binary search
        Integer mid=null;
        for(int left=1,right=A; left<=A && right>=1; left++,right--)
        {
            mid=(left+right)/2;
            if((int)Math.pow(mid,2)==A)
                return mid;
            else if((int)Math.pow(mid,2)>A)
                right=mid-1;
            else
                left=mid+1;
        }
        return -1;
    }
}