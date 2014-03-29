package org.ajm_web;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Unit test for simple App.
 */

public class AppTest {

    FizzBuzz fb = new FizzBuzzImpl();

    @Test
    public void testExec_0(){
        assertThat(fb.calc(0), is("Fizz Buzz"));
    }


    @Test
    public void testExec(){
        assertThat(fb.calc(3), is("Fizz"));
    }

    @Test
    public void testExec_5(){
        assertThat(fb.calc(5), is("Buzz"));
    }

    @Test
    public void testExec_15(){
        assertThat(fb.calc(15), is("Fizz Buzz"));
    }

    @Test
    public void testExec_other(){
        assertThat(fb.calc(11), is("11"));

    }
}
