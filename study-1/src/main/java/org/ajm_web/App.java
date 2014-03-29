package org.ajm_web;

import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FizzBuzz fb = new FizzBuzzImpl();

        IntStream
            .range(1,1000)
            .mapToObj(fb::calc)
            .forEach(System.out::println);

    }
}
