package Mantra;
//Write a Java program to test if 10 appears as the first or last element of an array of integers. The array length must be broader than or equal to 2.
public class FirstAslast {
    public static boolean isCheckAppearSame(int a[])
    {

        if(a[0]==10 && a[a.length-1]==10)
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
        int b[]={10,34,56,10};
        System.out.println(isCheckAppearSame(a));
        System.out.println(isCheckAppearSame(b));
    }
}
