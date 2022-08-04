package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 * Clase encargada del panel del juego y la matriz grafica.
 * @author Oscar Moreno
 * @author Jose Salcedo
 * @author Daniel Pedreros
 */
public class PanelJuego extends JPanel {
    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button1;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button2;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button3;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button4;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button5;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button6;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button7;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button8;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button9;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button10;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button11;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button12;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button13;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button14;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button15;

    /**
     * Objeto de la clase JButton, permite generar un boton de la matriz del juego.
     */
    private JButton button16;

    /**
     * Objeto de la clase JButton, permite generar un boton para reiniciar el juego.
     */
    private JButton buttonReiniciar;

    /**
     * Objeto de la clase ImageIcon, permite generar la imagen para la marca de 'X' en el juego.
     */
    private ImageIcon xImage;

    /**
     * Objeto de la clase ImageIcon, permite generar la imagen para la marca de 'O' en el juego.
     */
    private ImageIcon oImage;

    /**
     * Objeto de la clase ImageIcon, permite generar la imagen para los botones del juego.
     */
    private ImageIcon imageButton;

    /**
     * Objeto de la clase JLabel, permite indicar al usuario el turno en cuestion.
     */
    private JLabel turnoActual;

    /**
     * Metodo constructor de la clase.
     */
    public PanelJuego() {
        setLayout(null);
        inicializarComponentes();
        setVisible(false);
    }

    /**
     * Metodo que inicializa y estructura los componentes y objetos de la clase.
     */
    public void inicializarComponentes() {
        imageButton = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/button.png")));
        Font font = new Font("TimesRoman", Font.BOLD, 15);

        xImage = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/xImage.png")));
        oImage = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/oImage.png")));

        buttonReiniciar = new JButton("Reiniciar");
        buttonReiniciar.setBounds(55, 240, 100, 40);
        buttonReiniciar.setOpaque(false);
        buttonReiniciar.setContentAreaFilled(false);
        buttonReiniciar.setBorderPainted(false);
        buttonReiniciar.setFont(font);
        buttonReiniciar.setForeground(Color.WHITE);
        buttonReiniciar.setIcon(new ImageIcon(imageButton.getImage().getScaledInstance(buttonReiniciar.getWidth(), buttonReiniciar.getHeight(), Image.SCALE_SMOOTH)));
        buttonReiniciar.setHorizontalTextPosition(SwingConstants.CENTER);
        buttonReiniciar.setVerticalTextPosition(SwingConstants.CENTER);
        buttonReiniciar.setActionCommand("REINICIAR_JUEGO");
        add(buttonReiniciar);

        turnoActual = new JLabel();
        turnoActual.setBounds(10,0,300,40);
        turnoActual.setFont(font);
        add(turnoActual);

        button1 = new JButton();
        button1.setBounds(10,40,40,40);
        button1.setActionCommand("GAME_BUTTON1");
        add(button1);

        button2 = new JButton();
        button2.setBounds(60,40,40,40);
        button2.setActionCommand("GAME_BUTTON2");
        add(button2);

        button3 = new JButton();
        button3.setBounds(110,40,40,40);
        button3.setActionCommand("GAME_BUTTON3");
        add(button3);

        button4 = new JButton();
        button4.setBounds(160,40,40,40);
        button4.setActionCommand("GAME_BUTTON4");
        add(button4);

        button5 = new JButton();
        button5.setBounds(10,90,40,40);
        button5.setActionCommand("GAME_BUTTON5");
        add(button5);

        button6 = new JButton();
        button6.setBounds(60,90,40,40);
        button6.setActionCommand("GAME_BUTTON6");
        add(button6);

        button7 = new JButton();
        button7.setBounds(110,90,40,40);
        button7.setActionCommand("GAME_BUTTON7");
        add(button7);

        button8 = new JButton();
        button8.setBounds(160,90,40,40);
        button8.setActionCommand("GAME_BUTTON8");
        add(button8);

        button9 = new JButton();
        button9.setBounds(10,140,40,40);
        button9.setActionCommand("GAME_BUTTON9");
        add(button9);

        button10 = new JButton();
        button10.setBounds(60,140,40,40);
        button10.setActionCommand("GAME_BUTTON10");
        add(button10);

        button11 = new JButton();
        button11.setBounds(110,140,40,40);
        button11.setActionCommand("GAME_BUTTON11");
        add(button11);

        button12 = new JButton();
        button12.setBounds(160,140,40,40);
        button12.setActionCommand("GAME_BUTTON12");
        add(button12);

        button13 = new JButton();
        button13.setBounds(10,190,40,40);
        button13.setActionCommand("GAME_BUTTON13");
        add(button13);

        button14 = new JButton();
        button14.setBounds(60,190,40,40);
        button14.setActionCommand("GAME_BUTTON14");
        add(button14);

        button15 = new JButton();
        button15.setBounds(110,190,40,40);
        button15.setActionCommand("GAME_BUTTON15");
        add(button15);

        button16 = new JButton();
        button16.setBounds(160,190,40,40);
        button16.setActionCommand("GAME_BUTTON16");
        add(button16);

    }

    /**
     * Metodo que permite obtener el boton button1.
     * @return button1
     */
    public JButton getButton1() {
        return button1;
    }

    /**
     * Metodo que permite obtener el boton button2.
     * @return button2
     */
    public JButton getButton2() {
        return button2;
    }

    /**
     * Metodo que permite obtener el boton button3.
     * @return button3
     */
    public JButton getButton3() {
        return button3;
    }

    /**
     * Metodo que permite obtener el boton button4.
     * @return button4
     */
    public JButton getButton4() {
        return button4;
    }

    /**
     * Metodo que permite obtener el boton button5.
     * @return button5
     */
    public JButton getButton5() {
        return button5;
    }

    /**
     * Metodo que permite obtener el boton button6.
     * @return button6
     */
    public JButton getButton6() {
        return button6;
    }

    /**
     * Metodo que permite obtener el boton button7.
     * @return button7
     */
    public JButton getButton7() {
        return button7;
    }

    /**
     * Metodo que permite obtener el boton button8.
     * @return button8
     */
    public JButton getButton8() {
        return button8;
    }

    /**
     * Metodo que permite obtener el boton button9.
     * @return button9
     */
    public JButton getButton9() {
        return button9;
    }

    /**
     * Metodo que permite obtener el boton button10.
     * @return button10
     */
    public JButton getButton10() {
        return button10;
    }

    /**
     * Metodo que permite obtener el boton button11.
     * @return button11
     */
    public JButton getButton11() {
        return button11;
    }

    /**
     * Metodo que permite obtener el boton button12.
     * @return button12
     */
    public JButton getButton12() {
        return button12;
    }

    /**
     * Metodo que permite obtener el boton button13.
     * @return button13
     */
    public JButton getButton13() {
        return button13;
    }

    /**
     * Metodo que permite obtener el boton button14.
     * @return button14
     */
    public JButton getButton14() {
        return button14;
    }

    /**
     * Metodo que permite obtener el boton button15.
     * @return button15
     */
    public JButton getButton15() {
        return button15;
    }

    /**
     * Metodo que permite obtener el boton button16.
     * @return button16
     */
    public JButton getButton16() {
        return button16;
    }

    /**
     * Metodo que permite obtener la imagen de la marca 'X'.
     * @return xImage
     */
    public ImageIcon getxImage() {
        return xImage;
    }

    /**
     * Metodo que permite obtener la imagen de la marca 'O'.
     * @return xImage
     */
    public ImageIcon getoImage() {
        return oImage;
    }

    /**
     * Metodo que permite obtener el label del turno en cuestion.
     * @return turnoActual
     */
    public JLabel getTurnoActual() {
        return turnoActual;
    }

    /**
     * Metodo que permite obtener el boton buttonReiniciar.
     * @return buttonReiniciar
     */
    public JButton getButtonReiniciar() {
        return buttonReiniciar;
    }
}
