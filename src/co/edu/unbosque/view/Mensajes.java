package co.edu.unbosque.view;

import javax.swing.*;

/**
 * Clase encargada de manejar mensajes por ventana mediante JOptionPane.
 * @author Oscar Moreno
 * @author Jose Salcedo
 * @author Daniel Pedreros
 */
public class Mensajes {
    /**
     * Objeto de la clase Icon, permite inicializar un icono o imagen.
     */
    private Icon icon;

    /**
     *
     * @param mensaje indica el mensaje que va a aparecer en ventana cuando un jugador gana.
     * @return retorna siempre verdadero
     */
    public boolean mensajeGanador(String mensaje) {
        icon = new ImageIcon("src/images/winner.png");
        JOptionPane.showMessageDialog(null, mensaje, "Cuatro en línea", JOptionPane.PLAIN_MESSAGE, icon);
        return true;
    }

    /**
     * Indica el mensaje que va a aparecer en ventana cuando el juego es un empate.
     * @param mensaje indica el mensaje que va a aparecer en ventana.
     * @return retorna siempre verdadero
     */
    public boolean mensajeEmpate(String mensaje) {
        icon = new ImageIcon("src/images/draw.png");
        JOptionPane.showMessageDialog(null, mensaje, "Cuatro en línea", JOptionPane.PLAIN_MESSAGE, icon);
        return true;
    }

    /**
     *
     * @param mensaje indica el mensaje que va a aparecer en ventana cuando hay un error.
     */
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Cuatro en línea", JOptionPane.ERROR_MESSAGE);
    }
}
