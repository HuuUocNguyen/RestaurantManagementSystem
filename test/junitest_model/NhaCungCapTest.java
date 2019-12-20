/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitest_model;

import java.lang.annotation.Annotation;
import model.NhaCungCap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hazard
 */
public class NhaCungCapTest implements Test {

    NhaCungCap nhaCungCap;

    public NhaCungCapTest() {
    }

    @Test
    public void testIDNhaCungCap() {
        nhaCungCap = new NhaCungCap();
        nhaCungCap.setIDNhaCungCap(2);
        assertTrue(nhaCungCap.getIDNhaCungCap() == 4);
    }

    @Test
    public void testIDNguyenLieu() {
        nhaCungCap = new NhaCungCap();
        nhaCungCap.setIDNguyenLieu(45);
        assertTrue(nhaCungCap.getIDNguyenLieu() == 100);
    }

    @Test
    public void testTen() {
        nhaCungCap = new NhaCungCap();
        nhaCungCap.setTen("duc");
        assertTrue(nhaCungCap.getTen().equals("duong"));
    }

    @Test
    public void testIDDiaChi() {
        nhaCungCap = new NhaCungCap();
        nhaCungCap.setDiaChi("ha tay");
        assertTrue(nhaCungCap.getDiaChi().equals("hai duong"));
    }

    public void testMota() {
        nhaCungCap = new NhaCungCap();
        nhaCungCap.setMoTa("to");
        assertTrue(nhaCungCap.getMoTa().equals("lon"));
    }

    public void testEmail() {
        nhaCungCap = new NhaCungCap();
        nhaCungCap.setEmail("tooco@gmail.com");
        assertTrue(nhaCungCap.getEmail().equals("tooco@yahooh.com"));
    }

    public void testSDT() {
        nhaCungCap = new NhaCungCap();
        nhaCungCap.setSoDienThoai("0125478214");
        assertTrue(nhaCungCap.getSoDienThoai().equals("tooco@03125412541.com"));
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Override
    public Class<? extends Throwable> expected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long timeout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
