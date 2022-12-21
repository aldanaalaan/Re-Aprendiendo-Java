
// Importaciones
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

// Clase
public class Propuesta extends JFrame implements ActionListener {

    // Componentes
    private JLabel titulo;
    private JButton bs, bn;

    public Propuesta() {

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Propuesta");

        titulo = new JLabel("¿Quieres casarte conmigo?");
        titulo.setBounds(260, 10, 400, 30);
        add(titulo);

        bs = new JButton("Si");
        bs.setBounds(100, 90, 100, 30);
        add(bs);
        bs.addActionListener(this);

        bn = new JButton("No");
        bn.setBounds(500, 90, 100, 30);
        add(bn);
        bn.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bs) {
            JOptionPane.showMessageDialog(null, "Lo sabia, te quiero mucho <3");
            System.exit(0);
        }
        if (e.getSource() == bn) {
            Random r = new Random();
            bn.setBounds(r.nextInt(600), r.nextInt(100) + 50, 100, 30);
        }

    }

    public static void main(String[] args) {
        Propuesta ventana = new Propuesta();

        ventana.setBounds(0, 0, 700, 220);
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}