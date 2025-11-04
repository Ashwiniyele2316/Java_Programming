class Logic 
{
    void checkPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}

class Program20_3
{
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}
