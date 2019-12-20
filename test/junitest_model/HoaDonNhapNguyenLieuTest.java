/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitest_model;

import java.lang.annotation.Annotation;
import model.HoaDonNhapNguyenLieu;
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
public class HoaDonNhapNguyenLieuTest implements Test {

    HoaDonNhapNguyenLieu hoaDonNhapNguyenLieu;

    public HoaDonNhapNguyenLieuTest() {
    }

    @Test
    public void testIDHoaDonNhapNguyenLieu() {
        hoaDonNhapNguyenLieu = new HoaDonNhapNguyenLieu();
        hoaDonNhapNguyenLieu.setIDHoaDonNhap(3);
        assertTrue(hoaDonNhapNguyenLieu.getIDHoaDonNhap() == 4);
    }

    @Test
    public void testIDNhaCungCap() {
        hoaDonNhapNguyenLieu = new HoaDonNhapNguyenLieu();
        hoaDonNhapNguyenLieu.setIDnhaCungCap(3);
        assertTrue(hoaDonNhapNguyenLieu.getIDnhaCungCap() == 4);
    }

    @Test
    public void testNgayNhap() {
//        hoaDonNhapNguyenLieu = new HoaDonNhapNguyenLieu();
//          java.util.Date utilStartDate = ngayBatDauJDate.getDate();
//        java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
//        hoaDonNhapNguyenLieu.setNgayNhap(new  java.sql.Date());
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
