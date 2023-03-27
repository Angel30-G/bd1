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


/**
 *
 * @author pc
 */
public class InterfazWeatherReport {

    public static void main(String[] args) {
        //UI interfaz = new UI();
        menu interfaz = new menu();
    	interfaz.setVisible(true);
    	interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //interfaz.menu();
    }
}

class menu extends JFrame{
    interfazZip miPanel1;
    interfazCity miPanel2;
    //interfazCity miPanel2;
    JPanel panelZip;
    JPanel panelCity;
         JTextField textfield1, bTemperature, bHumidity, bPressure, bMaxTemperature, bMinTemperature;
        JLabel zipCode;
        JLabel temperature, humidity, pressure, maxTemperature, minTemperature;
        JButton getReport, cancel;
        JMenuBar mibarra;
	JMenuItem city, about;
	JMenuItem zip;
	JMenuItem salir;
        
	public menu(){
		setSize(700, 700);
		setLocation(500, 100);
		setTitle("Weather-Report");
		
		//MenuLamina panel1 = new MenuLamina();
               
		//battleshipUI matriz = new battleshipUI();
		
		//add(panel1);
                initialComponents();
                
                setVisible(true);
            
                
                //add(panelZip);
		//add(panelCity);
                
	}

	private void initialComponents() {
            miPanel1 = new interfazZip();
            miPanel2 = new interfazCity();
            //panelCity = new interfazCity();
            
            miPanel1.setBounds(1, 1, 700, 700);
            miPanel1.setLayout(null);
            
         /*   panelCity.setBounds(1, 1, 700, 700);
            panelCity.setLayout(null);*/
            
            //this.getContentPane().add(panelZip);
            //this.getContentPane().add(panelCity);
            
           //panelZip.add(panel1);
            //panelCity.add(panel2);
            
            add(miPanel1);
            add(miPanel2);
            
		
	}
        
 /*   private void componentsPanel1(){
            //JPanel panelZip = new JPanel();
            //JPanel panelCity = new JPanel(); */
        
    /* JTextField textfield1, bTemperature, bHumidity, bPressure, bMaxTemperature, bMinTemperature;
        JLabel zipCode;
        JLabel temperature, humidity, pressure, maxTemperature, minTemperature;
        JButton getReport, cancel;
        JMenuBar mibarra;
	JMenuItem city, about;
	JMenuItem zip;
	JMenuItem salir; */

       /*    //MenuCity newCity = new MenuCity();
                setLayout(null);
	        mibarra = new JMenuBar();
                //setJMenuBar(mibarra);
                mibarra.setBounds(250, 10, 170, 50);
                
                panelZip.add(mibarra);
		
		JMenu reports = new JMenu("Reports");
               // mibarra.add(reports);
                panelZip.add(reports);
                
		JMenu configuracion = new JMenu("Help");
                panelZip.add(configuracion);
                // mibarra.add(configuracion);
		JMenu acerca = new JMenu("Acerca de");
                panelZip.add(acerca);
               // mibarra.add(acerca);
		
		
		zip = new JMenuItem("By Zip Code");
                zip.addActionListener((ActionListener) this);
                panelZip.add(zip);
                
		city = new JMenuItem("By City");
		city.addActionListener((ActionListener) this);
                panelZip.add(city);
                
		salir = new JMenuItem("Salir");
		salir.addActionListener((ActionListener) this);
                panelZip.add(salir);
                
                about = new JMenuItem("About Weather Report");
                about.addActionListener((ActionListener) this);
                panelZip.add(about);
		
		reports.add(zip);
		reports.add(city);
		reports.add(salir);
                
                acerca.add(about);
		
		add(mibarra);
		
    textfield1 = new JTextField();
    textfield1.setBounds(400, 100, 200, 30);
    panelZip.add(textfield1);
                
    zipCode = new JLabel("ZipCode");
    zipCode.setBounds(200, 100, 100, 30);
    panelZip.add(zipCode);
    
    getReport = new JButton("Get Report");
    getReport.setBounds(180, 200, 100, 30);
    panelZip.add(getReport);
    
    cancel = new JButton("Cancel");
    cancel.setBounds(400, 200, 100, 30);
    panelZip.add(cancel);
    
    temperature = new JLabel("Temperature");
    temperature.setBounds(180, 300, 100, 30);
    panelZip.add(temperature);
    
    humidity = new JLabel("Humidity");
    humidity.setBounds(180, 340, 100, 30);
    panelZip.add(humidity);
    
    pressure = new JLabel("Pressure");
    pressure.setBounds(180, 380, 100, 30);
    panelZip.add(pressure);
    
    maxTemperature = new JLabel("Max Temperature");
    maxTemperature.setBounds(180, 420, 120, 30);
    panelZip.add(maxTemperature);
    
    minTemperature = new JLabel("Min Temperature");
    minTemperature.setBounds(180, 460, 100, 30);
    panelZip.add(getReport);
		
    
    bTemperature = new JTextField();
    bTemperature.setBounds(400, 300, 200, 30);
    panelZip.add(bTemperature);
    
    bHumidity = new JTextField();
    bHumidity.setBounds(400, 340, 200, 30);
    panelZip.add(bHumidity);
    
    bPressure = new JTextField();
    bPressure.setBounds(400, 380, 200, 30);
    panelZip.add(bPressure);
    
    bMaxTemperature = new JTextField();
    bMaxTemperature.setBounds(400, 420, 200, 30);
    panelZip.add(bMaxTemperature);
    
    bMinTemperature = new JTextField();
    bMinTemperature.setBounds(400, 460, 200, 30);
    panelZip.add(bMinTemperature);
                //add(panel2);

        
    }
    
    private void componentsPanel2(){
           //JPanel panelZip = new JPanel();
            //JPanel panelCity = new JPanel(); */
        
     /*   JTextField textfield1, bTemperature, bHumidity, bPressure, bMaxTemperature, bMinTemperature;
        JLabel zipCode;
        JLabel temperature, humidity, pressure, maxTemperature, minTemperature;
        JButton getReport, cancel;
        JMenuBar mibarra;
	JMenuItem city, about;
	JMenuItem zip;
	JMenuItem salir;*/

       /*      //MenuCity newCity = new MenuCity();
                setLayout(null);
	        mibarra = new JMenuBar();
                //setJMenuBar(mibarra);
                mibarra.setBounds(250, 10, 170, 50);
                
                panelCity.add(mibarra);
		
		JMenu reports = new JMenu("Reports");
               // mibarra.add(reports);
                panelCity.add(reports);
                
		JMenu configuracion = new JMenu("Help");
                panelCity.add(configuracion);
                // mibarra.add(configuracion);
		JMenu acerca = new JMenu("Acerca de");
                panelCity.add(acerca);
               // mibarra.add(acerca);
		
		
		zip = new JMenuItem("By Zip Code");
                zip.addActionListener((ActionListener) this);
                panelCity.add(zip);
                
		city = new JMenuItem("By City");
		city.addActionListener((ActionListener) this);
                panelCity.add(city);
                
		salir = new JMenuItem("Salir");
		salir.addActionListener((ActionListener) this);
                panelCity.add(salir);
                
                about = new JMenuItem("About Weather Report");
                about.addActionListener((ActionListener) this);
                panelCity.add(about);
		
		reports.add(zip);
		reports.add(city);
		reports.add(salir);
                
                acerca.add(about);
		
		add(mibarra);
		
    textfield1 = new JTextField();
    textfield1.setBounds(400, 100, 200, 30);
    panelCity.add(textfield1);
                
    zipCode = new JLabel("City");
    zipCode.setBounds(200, 100, 100, 30);
    panelCity.add(zipCode);
    
    getReport = new JButton("Get Report");
    getReport.setBounds(180, 200, 100, 30);
    panelCity.add(getReport);
    
    cancel = new JButton("Cancel");
    cancel.setBounds(400, 200, 100, 30);
    panelCity.add(cancel);
    
    temperature = new JLabel("Temperature");
    temperature.setBounds(180, 300, 100, 30);
    panelCity.add(temperature);
    
    humidity = new JLabel("Humidity");
    humidity.setBounds(180, 340, 100, 30);
    panelCity.add(humidity);
    
    pressure = new JLabel("Pressure");
    pressure.setBounds(180, 380, 100, 30);
    panelCity.add(pressure);
    
    maxTemperature = new JLabel("Max Temperature");
    maxTemperature.setBounds(180, 420, 120, 30);
    panelCity.add(maxTemperature);
    
    minTemperature = new JLabel("Min Temperature");
    minTemperature.setBounds(180, 460, 100, 30);
    panelCity.add(getReport);
		
    
    bTemperature = new JTextField();
    bTemperature.setBounds(400, 300, 200, 30);
    panelCity.add(bTemperature);
    
    bHumidity = new JTextField();
    bHumidity.setBounds(400, 340, 200, 30);
    panelCity.add(bHumidity);
    
    bPressure = new JTextField();
    bPressure.setBounds(400, 380, 200, 30);
    panelCity.add(bPressure);
    
    bMaxTemperature = new JTextField();
    bMaxTemperature.setBounds(400, 420, 200, 30);
    panelCity.add(bMaxTemperature);
    
    bMinTemperature = new JTextField();
    bMinTemperature.setBounds(400, 460, 200, 30);
    panelCity.add(bMinTemperature);
                //add(panel2);

                //add(panel2);		
}
        
        
    public void ActionPerformed(ActionEvent e){
      MenuLamina panel1 = new MenuLamina();
      MenuCity panel2 = new MenuCity();

     //interfazCityPanel panel2 = new interfazCityPanel();

    if(e.getSource() == panel1.zip){
        panel1.setVisible(true);
        panel2.setVisible(false);
       //fondo.setBackground(new Color(255,0,0));
    }
    if(e.getSource() == panel1.city){
        panel1.setVisible(false);
        panel2.setVisible(true);
        //newCity.setVisible(true);
        //this.dispose();
        
        //fondo.add(this);
       //fondo.setBackground(new Color(0,255,0));
    }
    if(e.getSource() == panel1.salir){
        exit(1);
    }

  } */

        
       /* public void desabilitarBotones(){
            MenuLamina panel1 = new MenuLamina();
            if(panel1.isVisible()){
                //panel1.setEnable(true);
            }
        } */
	
}


/*class tablaPanel extends JPanel implements ActionListener{
    JLabel zipCode;
    JLabel temperature, humidity, pressure, maxTemperature, minTemperature;
    JButton getReport, cancel;
    public tablaPanel(){
    setLayout(null);
    zipCode = new JLabel("ZipCode");
    zipCode.setBounds(10, 80, 100, 30);
    add(zipCode);
    getReport = new JButton("Get Report");
    getReport.setBounds(10, 100, 100, 30);
    add(getReport);
    cancel = new JButton("Cancel");
    cancel.setBounds(50, 100, 100, 30);
    add(cancel);
    
    temperature = new JLabel("Temperature");
    temperature.setBounds(50, 400, 100, 30);
    add(temperature);
    humidity = new JLabel("Humidity");
    humidity.setBounds(50, 400, 100, 30);
    add(humidity);
    pressure = new JLabel("Pressure");
    pressure.setBounds(50, 400, 100, 30);
    add(pressure);
    maxTemperature = new JLabel("Max Temperature");
    maxTemperature.setBounds(50, 400, 100, 30);
    add(maxTemperature);
    minTemperature = new JLabel("Min Temperature");
    minTemperature.setBounds(50, 400, 100, 30);
    add(minTemperature);
    
   }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   } 
*/

	
/*	public void actionPerformed2(ActionEvent e) {
		if(e.getSource()==salir) {
			System.exit(0);
		}
		
  }*/
	



/*
class menu_Botones extends JPanel implements ActionListener{
	JButton juego = new JButton("Juego");
	JButton acerca = new JButton("Acerca");
	
	public menu_Botones() {
		add(juego);
		add(acerca);
		
		juego.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
class opciones extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 =(Graphics2D) g;
		Font miFuente = new Font("Arial", Font.BOLD, 26);
		g2.setFont(miFuente);
		g.drawString("BattleShip", 200, 160);
	}
}
*/


