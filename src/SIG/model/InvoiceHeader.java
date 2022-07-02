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
public class InvoiceHeader {

    private int num;
    private String customer;
    private String date;
    private ArrayList<InvoiceLine> lines;

    public InvoiceHeader(int num, String customer, String date) {
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

    public String getDate() {
        return date;
    }

    public ArrayList<InvoiceLine> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getTotal() {
        double total = 0;
        for (InvoiceLine line : getLines()) {
            total += line.LineTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "InvouceHeader{" + "num=" + num + ", customer=" + customer + ", date=" + date + '}';
    }

}
