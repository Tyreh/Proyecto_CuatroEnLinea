package co.edu.unbosque.view;

import javax.swing.*;

/**
 * Clase encargada de crear la ventana principal mediante un JFrame.
 * @author Oscar Moreno
 * @author Jose Salcedo
 * @author Daniel Pedreros
 */
public class VentanaPrincipal extends JFrame {
    /**
     * Objeto de la clase PanelPrincipal, permite llamar a la clase y sus respectivos metodos y objetos.
     */
    private PanelPrincipal panelPrincipal;

    /**
     * Objeto de la clase PanelJuego, permite llamar a la clase y sus respectivos metodos y objetos.
     */
    private PanelJuego panelJuego;

    /**
     * Objeto de la clase Mensajes, permite llamar a la clase y sus respectivos metodos y objetos.
     */
    private Mensajes mensajes;

    /**
     * Metodo constructor de la clase.
     */
    public VentanaPrincipal() {
        setTitle("Cuatro en línea");
        setSize(510,210);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        inicializarComponentes();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    /**
     * Metodo que inicializa los componentes del JFrame, como los paneles.
     */
    public void inicializarComponentes() {
        panelPrincipal = new PanelPrincipal();
        panelPrincipal.setBounds(10,10,470,150);
        getContentPane().add(panelPrincipal);

        panelJuego = new PanelJuego();
        panelJuego.setBounds(10,10,700,700);
        getContentPane().add(panelJuego);

        mensajes = new Mensajes();
    }

    /**
     * Metodo que permite obtener el panel PanelPrincipal.
     * @return panelPrincipal
     */
    public PanelPrincipal getPanelPrincipal() {
        return panelPrincipal;
    }

    /**
     * Metodo que permite obtener el panel PanelJuego.
     * @return panelJuego
     */
    public PanelJuego getPanelJuego() {
        return panelJuego;
    }

    /**
     * Metodo que permite obtener la clase Mensajes.
     * @return mensajes
     */
    public Mensajes getMensajes() {
        return mensajes;
    }
}
