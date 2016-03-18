public class LiftOff {
    public static void main(String[] args)
    {
        int secondes = 10;
        while(secondes > 0)
        {
            System.out.println("T minus... " + secondes);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
            secondes--;
        }
        
        System.out.println("We are lift off!");
    }
}
