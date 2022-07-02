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
public class InvoiceLineTable extends AbstractTableModel {
    private ArrayList<InvoiceLine>data ;
    private String[] col = {"Item" , "Unit price" , "Count"};

    public InvoiceLineTable(ArrayList<InvoiceLine> data) {
        this.data = data;
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
    public Object getValueAt(int i, int ci) {
        InvoiceLine line=data.get(i);
        switch (ci){
            case 0:
                return line.getName();
            case 1:
                return line.getPrice();
            case 2:
                return line.getCount();
                
        }
        return "";
        }

    @Override
    public String getColumnName(int ci) {
        return col[ci]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
