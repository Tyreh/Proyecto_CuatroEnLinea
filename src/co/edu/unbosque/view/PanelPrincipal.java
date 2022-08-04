package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 * Clase encargada de manejar el panel principal del juego.
 * @author Oscar Moreno
 * @author Jose Salcedo
 * @author Daniel Pedreros
 */
public class PanelPrincipal extends JPanel {

    /**
     * Objeto de la clase JTextField, permite generar un campo para ingresar el nombre del jugador 1.
     */
    private JTextField fieldJ1;

    /**
     * Objeto de la clase JTextField, permite generar un campo para ingresar el nombre del jugador 2.
     */
    private JTextField fieldJ2;

    /**
     * Objeto de la clase JLabel, permite mostrar un texto de instrucción para el jugador 1.
     */
    private JLabel labelJ1;

    /**
     * Objeto de la clase JLabel, permite mostrar un texto de instrucción para el jugador 2.
     */
    private JLabel labelJ2;

    /**
     * Objeto de la clase JButton, permite generar el boton para aceptar las opciones de juego.
     */
    private JButton buttonOk;

    /**
     * Objeto de la clase ImageIcon, permite generar la imagen para el boton del juego.
     */
    private ImageIcon imageButton;

    /**
     * Metodo constructor de la clase.
     */
    public PanelPrincipal() {
        setLayout(null);
        inicializarComponentes();
        setVisible(true);
    }

    /**
     * Metodo que inicializa y estructura los componentes y objetos de la clase.
     */
    public void inicializarComponentes() {
        imageButton = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/button.png")));
        Font font = new Font("TimesRoman", Font.BOLD, 15);

        labelJ1 = new JLabel("Jugador 1: ");
        labelJ1.setFont(font);
        labelJ1.setBounds(20, 20, 200, 20);
        add(labelJ1);

        fieldJ1 = new JTextField();
        fieldJ1.setBounds(20, 40, 200, 20);
        add(fieldJ1);

        labelJ2 = new JLabel("Jugador 2: ");
        labelJ2.setFont(font);
        labelJ2.setBounds(250, 20, 200, 20);
        add(labelJ2);

        fieldJ2 = new JTextField();
        fieldJ2.setBounds(250, 40, 200, 20);
        add(fieldJ2);

        buttonOk = new JButton("Aceptar");
        buttonOk.setBounds(185,80,100,40);
        buttonOk.setOpaque(false);
        buttonOk.setContentAreaFilled(false);
        buttonOk.setBorderPainted(false);
        buttonOk.setFont(font);
        buttonOk.setForeground(Color.WHITE);
        buttonOk.setIcon(new ImageIcon(imageButton.getImage().getScaledInstance(buttonOk.getWidth(), buttonOk.getHeight(), Image.SCALE_SMOOTH)));
        buttonOk.setHorizontalTextPosition(SwingConstants.CENTER);
        buttonOk.setVerticalTextPosition(SwingConstants.CENTER);
        buttonOk.setActionCommand("BIENVENIDA_OK");
        add(buttonOk);
    }

    /**
     * Metodo que permite obtener el field fieldJ1.
     * @return fieldJ1
     */
    public JTextField getFieldJ1() {
        return fieldJ1;
    }

    /**
     * Metodo que permite obtener el field fieldJ2.
     * @return fieldJ2
     */
    public JTextField getFieldJ2() {
        return fieldJ2;
    }

    /**
     * Metodo que permite obtener el boton buttonOk.
     * @return buttonOk
     */
    public JButton getButtonOk() {
        return buttonOk;
    }
}
