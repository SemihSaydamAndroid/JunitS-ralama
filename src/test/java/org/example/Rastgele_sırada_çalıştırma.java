package org.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class Rastgele_sırada_çalıştırma
{

    @Test
    public void c() {
        System.out.println( "c" );
    }

    @Test
    public void a() {
        System.out.println( "a" );
    }

    @Test
    public void b() {
        System.out.println( "b" );
    }


}
