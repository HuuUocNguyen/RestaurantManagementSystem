/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest_dao;

import connect.JDBCConnection;
import control.NhanVienDAO;
import java.lang.annotation.Annotation;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Account;
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
public class NhanVienDAOTest implements Test {

    private static Nguoi getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public NhanVienDAOTest() {
    }
    private JDBCConnection jDBCConnection;

    @Test
    public void testIfConnectionNotNull() throws SQLException, ClassNotFoundException {
        jDBCConnection = (JDBCConnection) JDBCConnection.getMySQLConnection();
        assertNotNull(jDBCConnection);
    }

    @Test
    public void testListNhanVien() throws ClassNotFoundException, SQLException {
        ArrayList<Account> nguoi = NhanVienDAO.getList();
        assertNotNull(nguoi);
        assertEquals("eden hazard", nguoi.get(0).getUserName());
        assertEquals("eden_hazard", nguoi.get(1).getPassWord());
        
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
