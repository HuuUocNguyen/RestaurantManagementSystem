/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.NhanVienDAO;
import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import model.Account;
import service.NhanVienService;

/**
 *
 * @author Hazard
 */
public class NhanVienServiceImpl implements NhanVienService{
    ArrayList<Account> list = new ArrayList<Account>();
    //list = NhanVienDAO.getList();
    @Override
    public void login() {
        
        
    }

    @Override
    public void logout() {
        
    }
    
}
