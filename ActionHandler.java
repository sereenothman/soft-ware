/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIG.controller;

import SIG.veiw.invoice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import com.opencsv.CSVReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author seren
 */
public class ActionHandler implements ActionListener {

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
            /*case "Save File":
                saveFile();
                break;*/
        }
        

    }

    private void newInvoice() {

    }

    private void deleteInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void newItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deleteItem() {
        JOptionPane.showMessageDialog(null,"Welcome swing","plane message",JOptionPane.ERROR_MESSAGE);
    }

    private void loadFile() {
        invoice in = new invoice();
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(fc);
        if (result == JFileChooser.APPROVE_OPTION) {
            //String path = fc.getSelectedFile().getPath();
            File file = fc.getSelectedFile();
            ArrayList<String[]> rows = readCSV(file);
            
            
            //FileInputStream fis=null;
            //try {
            //fis = new FileInputStream(path);
            //int size = fis.available();
            //byte[] b = new byte[size];
            //fis.read(b); 
            //while ()
            //in.getInvoHeader().setText(new String(b));
            // } catch (FileNotFoundException ex) {
            //ex.printStackTrace();
            //} catch (IOException ex) {
            //ex.printStackTrace();
            //} finally {
            //try {fis.close();}
            //catch(IOException ex){}
            //}
        }
    }

    private ArrayList<String[]> readCSV(File file) {
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
        }catch(Exception ex){
            ex.printStackTrace();
            return new ArrayList<>();
        }
        return data;

    }

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
}
