public class array{
    public static void main(String[] args) {
        int max=0;
        int min=0;
        int n=5;
        int[] scores={0,20,30,40,50};
    for(int i=0;i<n;i++)
{
    if(min>scores[i])
    {
        min=scores[i];
    }
    if(max<scores[i])
    {
        max=scores[i];
    }
}  
System.out.println("The minimum of scores is"+min);
System.out.println("The maximum of scores is"+max);
}
}