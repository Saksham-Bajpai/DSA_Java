
public class kadanes {
    public static  void Kadane (int[] num) {
int ms = Integer.MIN_VALUE;
int cs = 0;

for (int i = 0; i < num.length; i++)
{
    cs += num[i];
    if (cs < 0)
    {
        cs = 0;
    }
    ms = Math.max(cs,ms);
}
    System.out.println(ms);
}
public static void main(String[] args) {
    int[] num = {2,4,6,8,10};
    Kadane(num);
}
}
