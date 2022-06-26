/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIG.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author seren
 */
public class InvouceHeader {
    private int num;
    private String customer ;
    private Date date; 
    private ArrayList<InvoiceLine>lines;

    public InvouceHeader(int num, String customer, Date date) {
        this.num = num;
        this.customer = customer;
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public String getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<InvoiceLine> getLines() {
        return lines;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
    
    
}
