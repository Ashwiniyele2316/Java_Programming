class Logic
{
    void printDigits(int num)
    {
        int temp = num;
        int reverse = 0;

        while(temp > 0)
        {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        while(reverse > 0)
        {
            System.out.println(reverse % 10);
            reverse /= 10;
        }
    }
}

class Program19_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}
