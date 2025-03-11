import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazSwingEjemplo extends JFrame implements AccionBoton {

    private final JButton boton;

    public InterfazSwingEjemplo() {
        
        setTitle("Ejemplo de Swing con Interfaz");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

      
        boton = new JButton("Haz clic aqui");
        
   
        boton.addActionListener((ActionEvent e) -> {
            ejecutarAccion(); 
        });

        add(boton);
    }

    public void ejecutarAccion() {
   
        JOptionPane.showMessageDialog(this, "¡Botón pulsado, bien echo!");
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            new InterfazSwingEjemplo().setVisible(true);
        });
    }
}
