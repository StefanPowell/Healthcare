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
public class StartupTest {
    
    public StartupTest() {
    }

    /**
     * Test of patient_id_size method, of class Startup.
     */
    @Test
    public void testPatient_id_size() {
        boolean pid_size = Startup.patient_id_size("12345678");
        assertEquals(true, pid_size);
    }
    
    public void testPatient_id_size1(){
        boolean pid_size1 = Startup.patient_id_size("acztarfs");
        assertEquals(true, pid_size1);
    }
    
    public void testPatient_id_size2(){
        boolean pid_size2 = Startup.patient_id_size("a2q4d6n");
        assertEquals(false, pid_size2);
    }

    /**
     * Test of main method, of class Startup.
     */
    @Test
    public void testMain() {
    }
    
}
