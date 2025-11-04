 class Logic
{
    void checkPalindrome(int num)
    {
        int temp = num;
        int rev = 0;

        while(temp > 0)
        {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }

        if(rev == num)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is not Palindrome");
    }
}

class Program17_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}



 

 
