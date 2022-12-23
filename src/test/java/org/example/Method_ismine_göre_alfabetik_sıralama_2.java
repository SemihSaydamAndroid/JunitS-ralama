package org.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Method_ismine_göre_alfabetik_sıralama_2
{

    @Test
    public void c() {
        System.out.println( "c" );
    }

    @Test
    public void a() {  //a - abc --> d - bca
        System.out.println( "a" );
    }

    @Test
    public void b() {
        System.out.println( "b" );
    }


}
