/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIG.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author seren
 */
public class InvoiceHeaderTable extends AbstractTableModel {
    private ArrayList<InvoiceHeader>data;
    private String[] col={"ID" , "Date" , "Customer Name"};

    public InvoiceHeaderTable(ArrayList<InvoiceHeader> data) {
        this.data = data;
    }

    public InvoiceHeaderTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return col.length;
    }

    @Override
    public Object getValueAt(int ri, int ci) {
        InvoiceHeader head=data.get(ri);
        switch (ci){
            case 0:
                return head.getNum();
            case 1:
                return head.getDate();
            case 2:
                return head.getCustomer();
                
        }
        return "";
        }

    @Override
    public String getColumnName(int ci) {
        return col[ci]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    }
    

