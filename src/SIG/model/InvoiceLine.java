/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIG.model;

/**
 *
 * @author seren
 */
public class InvoiceLine {
    private InvoiceHeader invoice ; 
    private String name;
    private double price ;
    private int count ;

    public InvoiceLine(InvoiceHeader invoice, String name, double price, int count) {
        this.invoice = invoice;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public InvoiceHeader getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceHeader invoice) {
        this.invoice = invoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "invoice=" + invoice + ", name=" + name + ", price=" + price + ", count=" + count + '}';
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public double LineTotal() {
        return count*price;
    }
    
}
