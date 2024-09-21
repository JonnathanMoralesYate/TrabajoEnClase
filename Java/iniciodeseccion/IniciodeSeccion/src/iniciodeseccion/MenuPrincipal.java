package iniciodeseccion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    
    public MenuPrincipal() 
    
    {
        
        setTitle("Menu Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JMenuBar menuBar = new JMenuBar ();
        
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemLogin = new JMenuItem("Iniciar Secion");
        JMenuItem itemRegistro = new JMenuItem("Registar Usuario");
        JMenuItem itemSalir = new JMenuItem("Salir");
        JMenu menuClases = new JMenu("Cursos");
        
        itemLogin.addActionListener(new ActionListener() {
            
            @Override
            
            public void actionPerformed (ActionEvent e) {
                
                new LoginFrame().setVisible(true);
                
            }       
        });
        
        itemRegistro.addActionListener(new ActionListener() {
            
            @Override
            
            public void actionPerformed(ActionEvent e) {
                
                new RegistroFrame().setVisible(true);
                
            }
        });
        
        itemSalir.addActionListener(new ActionListener() {
            
            @Override
            
            public void actionPerformed(ActionEvent e) {
                
                System.exit(0);
            }
        });
                
        menuArchivo.add(itemLogin);
        menuArchivo.add(itemRegistro);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);
        
        
        menuBar.add(menuArchivo); // colocar o agregar item de menu
        menuBar.add(menuClases);
        setJMenuBar(menuBar);
             
        }
    
    public static void main (String[] args){
        
        SwingUtilities.invokeLater(new Runnable(){
            
            @Override
            
            public void run() {
                
                new MenuPrincipal().setVisible(true);
            }
        });
        
    }
      
    }