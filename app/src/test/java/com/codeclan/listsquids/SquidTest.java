package com.codeclan.listsquids;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 15/03/2017.
 */

public class SquidTest {

    Squid squid;

    @Before
    public void before() {
        squid = new Squid(12,"Hypothetical filler squid", "Lorem ipsum");
    }

    @Test
    public void getSizeTest(){
        assertEquals(12,squid.getSize());
    }

    @Test
    public void getCommonNameTest(){
        assertEquals("Hypothetical filler squid", squid.getCommonName());
    }

    @Test
    public void getBinomialTest(){
        assertEquals("Lorem ipsum", squid.getBinomial());
    }



}
