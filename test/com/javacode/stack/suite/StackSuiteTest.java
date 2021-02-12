package com.javacode.stack.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.javacode.stack.BookTestJUnit;
import com.javacode.stack.StackTestJUnit;

@RunWith(Suite.class)
@SuiteClasses({BookTestJUnit.class, StackTestJUnit.class} )
public class StackSuiteTest {
	
}
