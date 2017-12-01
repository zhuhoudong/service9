package com.service.service9.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestService9 {

      Service9Delegate service9Delegate = new Service9Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = service9Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
