/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
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
public class HoaDonNhapNguyenLieuTest {
    
    public HoaDonNhapNguyenLieuTest() {
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

    /**
     * Test of getIDHoaDonNhap method, of class HoaDonNhapNguyenLieu.
     */
    @Test
    public void testGetIDHoaDonNhap() {
        System.out.println("getIDHoaDonNhap");
        HoaDonNhapNguyenLieu instance = new HoaDonNhapNguyenLieu();
        int expResult = 0;
        int result = instance.getIDHoaDonNhap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIDHoaDonNhap method, of class HoaDonNhapNguyenLieu.
     */
    @Test
    public void testSetIDHoaDonNhap() {
        System.out.println("setIDHoaDonNhap");
        int IDHoaDonNhap = 0;
        HoaDonNhapNguyenLieu instance = new HoaDonNhapNguyenLieu();
        instance.setIDHoaDonNhap(IDHoaDonNhap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNgayNhap method, of class HoaDonNhapNguyenLieu.
     */
    @Test
    public void testGetNgayNhap() {
        System.out.println("getNgayNhap");
        HoaDonNhapNguyenLieu instance = new HoaDonNhapNguyenLieu();
        Date expResult = null;
        Date result = instance.getNgayNhap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgayNhap method, of class HoaDonNhapNguyenLieu.
     */
    @Test
    public void testSetNgayNhap() {
        System.out.println("setNgayNhap");
        Date ngayNhap = null;
        HoaDonNhapNguyenLieu instance = new HoaDonNhapNguyenLieu();
        instance.setNgayNhap(ngayNhap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTongTien method, of class HoaDonNhapNguyenLieu.
     */
    @Test
    public void testGetTongTien() {
        System.out.println("getTongTien");
        HoaDonNhapNguyenLieu instance = new HoaDonNhapNguyenLieu();
        float expResult = 0.0F;
        float result = instance.getTongTien();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTongTien method, of class HoaDonNhapNguyenLieu.
     */
    @Test
    public void testSetTongTien() {
        System.out.println("setTongTien");
        float tongTien = 0.0F;
        HoaDonNhapNguyenLieu instance = new HoaDonNhapNguyenLieu();
        instance.setTongTien(tongTien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSoLuong method, of class HoaDonNhapNguyenLieu.
     */
    @Test
    public void testGetSoLuong() {
        System.out.println("getSoLuong");
        HoaDonNhapNguyenLieu instance = new HoaDonNhapNguyenLieu();
        int expResult = 0;
        int result = instance.getSoLuong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSoLuong method, of class HoaDonNhapNguyenLieu.
     */
    @Test
    public void testSetSoLuong() {
        System.out.println("setSoLuong");
        int soLuong = 0;
        HoaDonNhapNguyenLieu instance = new HoaDonNhapNguyenLieu();
        instance.setSoLuong(soLuong);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIDnhaCungCap method, of class HoaDonNhapNguyenLieu.
     */
    @Test
    public void testGetIDnhaCungCap() {
        System.out.println("getIDnhaCungCap");
        HoaDonNhapNguyenLieu instance = new HoaDonNhapNguyenLieu();
        int expResult = 0;
        int result = instance.getIDnhaCungCap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIDnhaCungCap method, of class HoaDonNhapNguyenLieu.
     */
    @Test
    public void testSetIDnhaCungCap() {
        System.out.println("setIDnhaCungCap");
        int IDnhaCungCap = 0;
        HoaDonNhapNguyenLieu instance = new HoaDonNhapNguyenLieu();
        instance.setIDnhaCungCap(IDnhaCungCap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
