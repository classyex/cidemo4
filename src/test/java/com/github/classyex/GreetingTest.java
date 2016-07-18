package com.github.classyex;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

/**
 * Created by yex on 16-7-18.
 */
public class GreetingTest {//NOPMD

    @Test
    public void morningGreeting(){//NOPMD
        String name = "xiaoming";
        Greeting greeting = new Greeting();
        assertThat("不是预期的问候语", "Good morning " + name, is(greeting.morning(name)
        ));
    }

}
