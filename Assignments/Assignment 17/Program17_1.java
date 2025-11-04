class Logic
{
    void sumOfDigits(int num)
    {
        int temp = num;
        int sum = 0;
        while(temp > 0)
        {
            sum = sum + temp % 10;
            temp = temp / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

class Program17_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}
