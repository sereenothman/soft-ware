/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIG.controller;

import SIG.model.InvoiceHeader;
import SIG.model.InvoiceLine;
import SIG.model.InvoiceLineTable;
import SIG.veiw.invoice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import com.opencsv.CSVReader;
import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author seren
 */
public class ActionHandler implements ActionListener, ListSelectionListener {

    private invoice inv;//reference frm the invoice class

    public ActionHandler(invoice aThis) {
        this.inv = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action Handlling Called");

        switch (e.getActionCommand()) {
            case "New Invoice":
                newInvoice();
                break;
            case "Delete Invoice":
                deleteInvoice();
                break;
            case "New Item":
                newItem();
                break;
            case "Delete Item":
                deleteItem();
                break;
            case "Load File":

                System.out.println("called");
                loadFile();
                break;
            case "Save File":
                saveFile();
                break;
        }

    }

    private void newInvoice() {

    }

    private void deleteInvoice() {
        int selectedRow=inv.getInvoHeader().getSelectedRow();
        ArrayList<InvoiceHeader> invList = new ArrayList<>();
        invList.remove(selectedRow); // will be completed
        
    }

    private void newItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deleteItem() {
        JOptionPane.showMessageDialog(null, "Welcome swing", "plane message", JOptionPane.ERROR_MESSAGE);
    }

    private void loadFile() {
        try {
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(inv);
            if (result == JFileChooser.APPROVE_OPTION) {
                File headerFile = fc.getSelectedFile();
                String path = headerFile.getAbsolutePath();
                Path headerP = Paths.get(path);
                List<String> head = Files.lines(headerP).collect(Collectors.toList());//read file and return stream and convert to list
                ArrayList<InvoiceHeader> invList = new ArrayList<>();
                for (String headerLine : head) {
                    String[] part = headerLine.split(",");
                    int id = Integer.parseInt(part[0]);
                    InvoiceHeader invHeader = new InvoiceHeader(id, part[2], part[1]);
                    invList.add(invHeader);
                }
                result = fc.showOpenDialog(inv);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File lineFile = fc.getSelectedFile();
                    String Lpath = lineFile.getAbsolutePath();
                    Path lineP = Paths.get(Lpath);
                    List<String> line = Files.lines(lineP).collect(Collectors.toList());//read file and return stream and convert to list
                    for (String LineL : line) {
                        String[] part = LineL.split(",");
                        int invid = Integer.parseInt(part[0]);
                        double price = Double.parseDouble(part[2]);
                        int count = Integer.parseInt(part[3]);
                        InvoiceHeader in = read(invList, invid);
                        InvoiceLine invLine = new InvoiceLine(in, part[1], price, count);
                        in.getLines().add(invLine);

                    }
                    inv.setInvList(invList);
                }

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private InvoiceHeader read(ArrayList<InvoiceHeader> inv, int id) {
        for (InvoiceHeader invv : inv) {
            if (invv.getNum() == id) {
                return invv;
            }
        }
        return null;
    }
    
    @Override
        public void valueChanged(ListSelectionEvent lse) {
             System.out.println("selected");
             int selectedRow=inv.getInvoHeader().getSelectedRow();
             System.out.println(selectedRow);
             ArrayList<InvoiceLine> lines=inv.getInvList().get(selectedRow).getLines();
             inv.getInvoLine().setModel(new InvoiceLineTable(lines));
        }

    private void saveFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

   /* private ArrayList<String[]> readCSV(File file) {
            ArrayList<String[]> data = new ArrayList<>();
            try {
                FileReader filereader = new FileReader(file);
                CSVReader csvreader = new CSVReader(filereader);
                Iterator<String[]> rows = csvreader.iterator();

                while (rows.hasNext()) {
                    String[] cols = rows.next();
                    data.add(cols);
                }
                System.out.println(data.size());
            } catch (Exception ex) {
                ex.printStackTrace();
                return new ArrayList<>();
            }
            return data;

        }*/

    /*private void saveFile() {
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(fc);
        if (result == JFileChooser.APPROVE_OPTION) {
            String path = fc.getSelectedFile().getPath();
            FileOutputStream fos=null;
            try {
                fos = new FileOutputStream(path);
                int size = fos.available();
                byte[] b = ta.getText().getBytes();
                fos.write(b);
                
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {fos.close();}
                catch(IOException ex){}
            }
        }

    }*/
    
