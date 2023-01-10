package Big;
import java.lang.*;
import java.util.*;

public class test {
    public static void main(String[] args) {    
System.out.println(CountOfPrime(13));
        }

        public static boolean CountOfPrime(int n) {
            for (int j=)
            int count = 0;
            if (A==1) {
                return false;
            } else if (A==2) {
                return true;
            } else if(A%2==0) {
                return false;
            } else {          
                for (int i=1; i*i<=A && count<3; i=i+2 ) {
                    if (A%i==0) {
                        if (i==A/i) {
                            count = count+1;
                        } else {
                            count = count+2;
                        }
                    }
                }
                if (count > 2) {
                    return false;
                } else {
                    return true;
                }
            }
        }

    }