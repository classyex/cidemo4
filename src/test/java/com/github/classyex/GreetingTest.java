package com.github.classyex;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

/**
 * Created by yex on 16-7-18.
 */
public class GreetingTest {//NOPMD

    private String name;
    private Greeting greeting;

    @Before
    public void setUp(){
        name = "xiaoming";
        greeting = new Greeting();
    }

    @Test
    public void morningGreeting(){//NOPMD
        assertThat("不是预期的问候语", "Good morning " + name, is(greeting.morning(name)
        ));
    }

    @Test
    public void eveningIsNotmorningGreet(){
        assertThat("不是预期的问候语", "Good evening " + name, not(greeting.morning(name)
        ));
    }

}
