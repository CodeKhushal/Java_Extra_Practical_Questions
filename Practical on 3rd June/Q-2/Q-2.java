package com.company;

public class recursiveStar {
    public static int star1(int n)
    {
        for(int i = n;i>0;i--)
        {
            System.out.print('*'+" ");
        }
        System.out.println();
        if(n==1)
            return 1;
        return star1(n-1);
    }

    public static void star2(int n,int a)
    {
        if(n==0)
            return;
        printPat(a);
        System.out.println();
        star2(n-1,a+1);
    }

    public static void printPat(int num)
    {
        if(num==0)
            return;
        System.out.print("* ");
        printPat(num-1);
    }
    public static void main(String[] args) {
        star1(4);
//        System.out.println();
        star2(4,1);
    }
}
