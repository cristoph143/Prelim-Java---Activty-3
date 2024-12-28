/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pc
 */
public class PharmacyTest {
    
    public PharmacyTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Pharmacy.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Pharmacy.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inputProducts method, of class Pharmacy.
     */
    @Test
    public void testInputProducts() {
        System.out.println("inputProducts");
        int num = 0;
        Pharmacy.inputProducts(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayTable method, of class Pharmacy.
     */
    @Test
    public void testDisplayTable() {
        System.out.println("displayTable");
        int num = 0;
        Pharmacy.displayTable(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayMainMenu method, of class Pharmacy.
     */
    @Test
    public void testDisplayMainMenu() {
        System.out.println("displayMainMenu");
        char expResult = ' ';
        char result = Pharmacy.displayMainMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of switches method, of class Pharmacy.
     */
    @Test
    public void testSwitches() {
        System.out.println("switches");
        char ans = ' ';
        int num = 0;
        Medicines[] meds = null;
        Pharmacy.switches(ans, num, meds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of answerQues method, of class Pharmacy.
     */
    @Test
    public void testAnswerQues() {
        System.out.println("answerQues");
        String expResult = "";
        String result = Pharmacy.answerQues();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of answer method, of class Pharmacy.
     */
    @Test
    public void testAnswer() {
        System.out.println("answer");
        boolean answer = false;
        int num = 0;
        Pharmacy.answer(answer, num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkMed method, of class Pharmacy.
     */
    @Test
    public void testCheckMed() {
        System.out.println("checkMed");
        int num = 0;
        String medName = "";
        Medicines[] meds = null;
        boolean expResult = false;
        boolean result = Pharmacy.checkMed(num, medName, meds);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStocks method, of class Pharmacy.
     */
    @Test
    public void testAddStocks() {
        System.out.println("addStocks");
        int num = 0;
        String medName = "";
        Medicines[] meds = null;
        Pharmacy.addStocks(num, medName, meds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sellMed method, of class Pharmacy.
     */
    @Test
    public void testSellMed() {
        System.out.println("sellMed");
        int num = 0;
        Medicines[] meds = null;
        Pharmacy.sellMed(num, meds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePrice method, of class Pharmacy.
     */
    @Test
    public void testChangePrice() {
        System.out.println("changePrice");
        int num = 0;
        Medicines[] meds = null;
        Pharmacy.changePrice(num, meds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solve method, of class Pharmacy.
     */
    @Test
    public void testSolve() {
        System.out.println("solve");
        Pharmacy.solve();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
