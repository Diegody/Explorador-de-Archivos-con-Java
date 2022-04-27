package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class PanelAccesoRapido extends JPanel {
    
    
    public PanelAccesoRapido(){
         BufferedImage carpetaImagen = null;
         BufferedImage computadorImagen = null;
        try {
            File carpeta = new File("C:\\Users\\Diegody\\Documents\\NetBeansProjects\\ExploradorDeArchivos-Diego\\src\\Imagenes\\carpeta.png");
            carpetaImagen = ImageIO.read(carpeta);
            File computador2 = new File("C:\\Users\\Diegody\\Documents\\NetBeansProjects\\ExploradorDeArchivos-Diego\\src\\Imagenes\\computador.png");
            computadorImagen = ImageIO.read(computador2);
        } catch (Exception e) {
        }
        
        
        ImageIcon imageIcon = new ImageIcon(carpetaImagen);
        ImageIcon imageIcon2 = new ImageIcon(computadorImagen);
        
        setBackground(Color.WHITE);
        setLayout(null);

        JLabel c1 = new JLabel("Documentos");
        c1.setIcon(imageIcon);
        c1.setBounds(50, 50, 250, 250);

        JLabel c2 = new JLabel("Imagenes");
        c2.setIcon(imageIcon);
        c2.setBounds(350, 50, 250, 250);

        JLabel c3 = new JLabel("Descargas");
        c3.setIcon(imageIcon);
        c3.setBounds(50, 250, 250, 250);

        JLabel computador = new JLabel("PC");
        computador.setIcon(imageIcon2);
        computador.setBounds(350, 250, 250, 250);
        computador.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ConfiguracionDelPC();
            }
        });

        add(c1);
        add(c2);
        add(c3);
        add(computador);
    }

}
