 class Logic
{
    void sumEvenOddDigits(int num)
    {
        int temp = num;
        int evenSum = 0, oddSum = 0;

        while(temp > 0)
        {
            int digit = temp % 10;
            if(digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;

            temp = temp / 10;
        }

        System.out.println("Even digits sum = " + evenSum);
        System.out.println("Odd digits sum = " + oddSum);
    }
}

class Program18_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}


