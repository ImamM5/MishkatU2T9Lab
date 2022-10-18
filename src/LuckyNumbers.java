public class LuckyNumbers
{
    /* No instance variables */

    /* "empty" constructor with no parameters */
    public LuckyNumbers() { }

    /* Generates a random number between min and max, inclusive,
       and returns that random number
     */
    public int randomIntegerBetween(int min, int max)
    {
        return (int)(Math.random()*(max-min+1))+min;

    }

    public String getLuckyNumbers()
    {
        int l = randomIntegerBetween(1,65);
        int l2 = randomIntegerBetween(1,65);
        int l3 = randomIntegerBetween(1,65);
        int l4 = randomIntegerBetween(1,65);
        int l5 = randomIntegerBetween(1,65);

        int s = randomIntegerBetween(1,30);

        return "Your lucky numbers are: "+ l+ ", "+l2 + ", "+l3+ ", "+l4+ ", "+ l5+ "\nThe super ball is: "+s;

    }
}
