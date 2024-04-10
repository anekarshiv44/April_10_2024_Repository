import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("HELLO KITTOL :)\nKINDLY ENTER RANGE IN WHICH\nYOU WANT TO EXPLORE ALL ARMSTRONG NUMBERS, PLEASE!");
        Integer N=Integer.parseInt(new Scanner(System.in).nextLine());
        printAllArmstrongInRange(N);
    }

    static void printAllArmstrongInRange(final Integer N)
    {
        Integer sum=null,temp=null,d=null;
        for(int i=1;i<=N;i++)
        {
            //sum for armstrong number must be initialized fresh for each number
            sum=0;
            //always copy number to temp
            temp=i;
            while(temp>0)
            {
                d=temp%10;
                temp=temp/10;
                sum+=(int)Math.pow(d,3);
            }
            if(i==sum)
                System.out.print(i+" ");
        }
        System.out.println();
    }
}