/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitest_connect;

import connect.JDBCConnection;
import java.lang.annotation.Annotation;
import java.sql.SQLException;
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
public class ConnectTest implements Test {

    private JDBCConnection jDBCConnection;

    public ConnectTest() {
    }

    @Test
    public void testIfConnectionNotNull() throws SQLException, ClassNotFoundException {
        jDBCConnection = (JDBCConnection) JDBCConnection.getMySQLConnection();
        assertNotNull(jDBCConnection);
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
