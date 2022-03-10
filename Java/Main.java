package Java;

import java.util.*;

public class Main {
    
    static int fooDec(int x, int y){
        if(x <= 0){
            return fooInc(x, y);
        }
        System.out.print(x+" ");
        return fooDec(x-5, y);
    }
    
    static int fooInc(int x, int y){
        if( x == y)
            return x;
        System.out.print(x+" ");
        return fooInc(x+5,y);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.print(fooDec(x,x));
    }
}
