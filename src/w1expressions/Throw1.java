package w1expressions;

import java.io.IOException;

public class Throw1 {
    public static void main(String[] args)throws IOException {
        foo();

    }
    public static void foo() throws  IOException{
        throw new IOException("stam");
        
    }
}
