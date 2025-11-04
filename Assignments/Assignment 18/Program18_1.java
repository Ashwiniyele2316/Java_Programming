class Logic
{
    void checkPrime(int num)
    {
        if(num <= 1)
        {
            System.out.println(num + " is not prime");
            return;
        }

        for(int i = 2; i <= num/2; i++)
        {
            if(num % i == 0)
            {
                System.out.println(num + " is not prime");
                return;
            }
        }

        System.out.println(num + " is prime");
    }
}

class Program18_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}
