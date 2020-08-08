/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.healthi1.newpackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author stefan
 */
public class MainTest {
    
    public MainTest() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of connect method, of class Main.
     */
    @Test
    public void testConnect() {
    }

    /**
     * Test of mainscreen method, of class Main.
     */
    @Test
    public void testMainscreen() {
    }

    /**
     * Test of signupscreen method, of class Main.
     */
    @Test
    public void testSignupscreen() {
    }

    /**
     * Test of validate_data method, of class Main.
     */
    @Test
    public void testValidate_data() {
        boolean validate_test = Main.validate_data("", "");
        assertEquals(false, validate_test);
    }
    
    @Test
    public void testValidate_data2() {
        boolean validate_test = Main.validate_data("assa", "12345678");
        assertEquals(false, validate_test);
    }
    
    public void testValidate_data3(){
        boolean validate_test = Main.validate_data("assa", "a2345678");
        assertEquals(false, validate_test);
    }
    
    public void testValidate_data4(){
        boolean validate_test = Main.validate_data("assa", "A2345678");
        assertEquals(false, validate_test);
    }
    
    public void testValidate_data5(){
        boolean validate_test = Main.validate_data("assa", "A2345678$");
        assertEquals(false, validate_test);
    }
    
    public void testValidate_data6(){
        boolean validate_test = Main.validate_data("assa", "A2345678$@");
        assertEquals(true, validate_test);
    }
    
    public void testValidate_data7(){
        boolean validate_test = Main.validate_data("assa", "#A2345678$@");
        assertEquals(true, validate_test);
    }
    
    public void testValidate_data8(){
        boolean validate_test = Main.validate_data("", "#A2345678$@");
        assertEquals(false, validate_test);
    }

    /**
     * Test of display_startscreen method, of class Main.
     */
    @Test
    public void testDisplay_startscreen() {
    }
    
}
