/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd;


import java.awt.*;
import java.awt.Container;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.exit;
//import static javafx.scene.paint.Color.color;
import javax.swing. *;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class interfazZip extends JPanel implements ActionListener {
        JTextField textfield1, bTemperature, bHumidity, bPressure, bMaxTemperature, bMinTemperature;
        JLabel zipCode;
        JLabel temperature, humidity, pressure, maxTemperature, minTemperature;
        JButton getReport, cancel;
        JMenuBar mibarra;
	JMenuItem city, about;
	JMenuItem zip;
	JMenuItem salir;
        interfazZip miPanel1;
        interfazCity miPanel2;
        
    public interfazZip(){
        setLayout(null);
        initialComponents();
  }
    private void initialComponents(){

          //JPanel panelZip = new JPanel();
            //JPanel panelCity = new JPanel();
        
    /* JTextField textfield1, bTemperature, bHumidity, bPressure, bMaxTemperature, bMinTemperature;
        JLabel zipCode;
        JLabel temperature, humidity, pressure, maxTemperature, minTemperature;
        JButton getReport, cancel;
        JMenuBar mibarra;
	JMenuItem city, about;
	JMenuItem zip;
	JMenuItem salir; */

            //MenuCity newCity = new MenuCity();
                setLayout(null);
	        mibarra = new JMenuBar();
                //setJMenuBar(mibarra);
                mibarra.setBounds(250, 10, 170, 50);
                add(mibarra);
		
		JMenu reports = new JMenu("Reports");
                mibarra.add(reports);
                //add(reports);
                
		JMenu configuracion = new JMenu("Help");
                //add(configuracion);
                mibarra.add(configuracion);
		JMenu acerca = new JMenu("Acerca de");
                //add(acerca);
                mibarra.add(acerca);
		
		
		zip = new JMenuItem("By Zip Code");
                //zip.addActionListener((ActionListener) this);
                add(zip);
                
		city = new JMenuItem("By City");
		//city.addActionListener((ActionListener) this);
                add(city);
                
		salir = new JMenuItem("Salir");
		//salir.addActionListener((ActionListener) this);
                add(salir);
                
                about = new JMenuItem("About Weather Report");
                //about.addActionListener((ActionListener) this);
                add(about);
		
		reports.add(zip);
		reports.add(city);
		reports.add(salir);
                
                acerca.add(about);
		
		add(mibarra);
		
    textfield1 = new JTextField();
    textfield1.setBounds(400, 100, 200, 30);
    add(textfield1);
                
    zipCode = new JLabel("ZipCode");
    zipCode.setBounds(200, 100, 100, 30);
    add(zipCode);
    
    getReport = new JButton("Get Report");
    getReport.setBounds(180, 200, 100, 30);
    getReport.addActionListener((ActionListener) this);
    add(getReport);
    
    cancel = new JButton("Cancel");
    cancel.setBounds(400, 200, 100, 30);
    cancel.addActionListener((ActionListener) this);
    add(cancel);
    
    temperature = new JLabel("Temperature");
    temperature.setBounds(180, 300, 100, 30);
    add(temperature);
    
    humidity = new JLabel("Humidity");
    humidity.setBounds(180, 340, 100, 30);
    add(humidity);
    
    pressure = new JLabel("Pressure");
    pressure.setBounds(180, 380, 100, 30);
    add(pressure);
    
    maxTemperature = new JLabel("Max Temperature");
    maxTemperature.setBounds(180, 420, 120, 30);
    add(maxTemperature);
    
    minTemperature = new JLabel("Min Temperature");
    minTemperature.setBounds(180, 460, 100, 30);
    add(getReport);
		
    
    bTemperature = new JTextField();
    bTemperature.setBounds(400, 300, 200, 30);
    add(bTemperature);
    
    bHumidity = new JTextField();
    bHumidity.setBounds(400, 340, 200, 30);
    add(bHumidity);
    
    bPressure = new JTextField();
    bPressure.setBounds(400, 380, 200, 30);
    add(bPressure);
    
    bMaxTemperature = new JTextField();
    bMaxTemperature.setBounds(400, 420, 200, 30);
    add(bMaxTemperature);
    
    bMinTemperature = new JTextField();
    bMinTemperature.setBounds(400, 460, 200, 30);
    add(bMinTemperature);
                //add(panel2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            miPanel1 = new interfazZip();
            miPanel2 = new interfazCity();
             //interfazCityPanel panel2 = new interfazCityPanel();

    if(e.getSource() == zip){
        //exit(1);
        miPanel1.setVisible(true);
        miPanel2.setVisible(false);
       //fondo.setBackground(new Color(255,0,0));
    }
    else if(e.getSource() == city){
        exit(1);
        miPanel1.setVisible(false);
        miPanel2.setVisible(true);

        
        //fondo.add(this);
       //fondo.setBackground(new Color(0,255,0));
    }
    if(e.getSource() == salir){
        exit(1);
    }
    
    if(e.getSource() == getReport){
    bTemperature.setText("98°");
    
    bHumidity.setText("98°");
    
    bPressure.setText("98°");
    
    bMaxTemperature.setText("98°");
    
    bMinTemperature.setText("70°");
    }
    
    if(e.getSource() == cancel){
    bTemperature.setText("");
    
    bHumidity.setText("");
    
    bPressure.setText("");
    
    bMaxTemperature.setText("");
    
    bMinTemperature.setText("");
    }
   }
}
