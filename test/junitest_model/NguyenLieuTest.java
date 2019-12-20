/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitest_model;

import java.lang.annotation.Annotation;
import model.NguyenLieu;
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
public class NguyenLieuTest implements Test {

    NguyenLieu nguyenLieu;

    public NguyenLieuTest() {
    }

    @Test
    public void testIDNguyenLieu() {
        nguyenLieu = new NguyenLieu();
        nguyenLieu.setIDNguyenLieu(2);
        assertTrue(nguyenLieu.getIDNguyenLieu() == 4);
    }

    @Test
    public void testTenNguyenLieu() {
        nguyenLieu = new NguyenLieu();
        nguyenLieu.setTen("cu cai");
        assertTrue(nguyenLieu.getTen().equals("ca ngu"));
    }

    @Test
    public void testMota() {
        nguyenLieu = new NguyenLieu();
        nguyenLieu.setMota("hihi");
        assertTrue(nguyenLieu.getMota().equals("hichic"));
    }

    @Test
    public void testDonGia() {
        nguyenLieu = new NguyenLieu();
        nguyenLieu.setDonGia((float) 3.1);
        assertTrue(nguyenLieu.getDonGia() == 3.1);
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
