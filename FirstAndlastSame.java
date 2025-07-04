package Mantra;

public class FirstAndlastSame {

    public static boolean isCheckFirstAndSecondSame(int a[])
    {


        if(a[0]==a[a.length-1])
        {
            if(a.length>=2)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={12,34,56,78};
        int b[]={12,34,56,12};
        System.out.println(isCheckFirstAndSecondSame(a));

    }
}
