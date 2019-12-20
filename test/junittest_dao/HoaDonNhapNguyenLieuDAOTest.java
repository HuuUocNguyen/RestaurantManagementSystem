/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest_dao;

import connect.JDBCConnection;
import control.HoaDonNhapNguyenLieuDAO;
import java.lang.annotation.Annotation;
import java.sql.SQLException;
import java.util.ArrayList;
import model.HoaDonNhapNguyenLieu;
import model.Nguoi;
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
public class HoaDonNhapNguyenLieuDAOTest implements Test {

    private JDBCConnection jDBCConnection;

    public HoaDonNhapNguyenLieuDAOTest() {
    }

    @Test
    public void testIfConnectionNotNull() throws SQLException, ClassNotFoundException {
        jDBCConnection = (JDBCConnection) JDBCConnection.getMySQLConnection();
        assertNotNull(jDBCConnection);
    }

    @Test
    public void testListHoaDonNhapNguyenLieu() throws ClassNotFoundException, SQLException {
        java.util.Date utilStartDate = new java.util.Date();
        java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
        //System.out.println(sqlStartDate);

        java.util.Date utilEndDate = new java.util.Date();
        java.sql.Date sqlEndDate = new java.sql.Date(utilEndDate.getTime());
        //System.out.println(sqlEndDate);
        ArrayList<HoaDonNhapNguyenLieu> hoaDonNhapNguyenLieu = HoaDonNhapNguyenLieuDAO.getListNgayNhap(sqlStartDate, sqlEndDate);
        assertNotNull(hoaDonNhapNguyenLieu);
        assertEquals("2019-10-01", hoaDonNhapNguyenLieu.get(0).getNgayNhap());
        assertEquals("2019-10-06", hoaDonNhapNguyenLieu.get(1).getNgayNhap());
        assertEquals(55, hoaDonNhapNguyenLieu.get(1).getIDnhaCungCap());
        assertEquals(10000, hoaDonNhapNguyenLieu.get(3).getSoLuong());
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
