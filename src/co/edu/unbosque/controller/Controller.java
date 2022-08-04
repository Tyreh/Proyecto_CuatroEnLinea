package co.edu.unbosque.controller;

import co.edu.unbosque.model.Juego;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.view.PanelJuego;
import co.edu.unbosque.view.PanelPrincipal;
import co.edu.unbosque.view.VentanaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Clase encargada de la ejecucion del programa.
 *
 * @author Oscar Moreno
 * @author Jose Salcedo
 * @author Daniel Pedreros
 */

public class Controller implements ActionListener {
    /**
     * Objeto de la clase VentanaPrincipal, permite llamar a la ventana principal y sus respectivos paneles del paquete vista.
     */
    private final VentanaPrincipal ventanaPrincipal;

    /**
     * Objeto de la clase Juego, permite llamar a la clase Juego del paquete modelo
     */
    private final Juego juego;

    /**
     * Objeto de la clase Archivo, permite manejar la persistencia en el programa y guardar un historial del mismo.
     */
    private final Archivo archivo;

    /**
     * Objeto tipo String, permite almacenar el nombre del jugador 1.
     */
    private String j1;

    /**
     * Objeto tipo String, permite almacenar el nombre del jugador 2.
     */
    private String j2;

    /**
     * Objeto tipo boolean, permite almacenar el turno del programa en cuestion.
     */
    private boolean turno;

    /**
     * Objeto tipo String[][], permite crear y almacenar una matriz.
     */
    private String[][] matriz;

    /**
     * Objeto ArrayList de JButton, permite almacenar los botones de la GUI.
     */
    private ArrayList<JButton> arrayButtons;

    /**
     * Objeto de la clase DateTimeFormatter, permite crear un formato de fecha y hora.
     */
    private DateTimeFormatter dateTimeFormatter;

    /**
     * Objeto de la clase LocalDateTime, permite obtener la fecha y hora en cuestion.
     */
    private LocalDateTime localDateTime;

    /**
     * Metodo constructor de la clase.
     */
    public Controller() {
        ventanaPrincipal = new VentanaPrincipal();
        juego = new Juego();
        archivo = new Archivo();
        inicializarArrays();
        listeners();
    }

    /**
     * Metodo encargado de inicializar y agregar datos a los objetos matriz y arrayButtons.
     */
    public void inicializarArrays() {
        matriz = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = "";
            }
        }

        arrayButtons = new ArrayList<>();
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton1());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton2());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton3());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton4());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton5());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton6());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton7());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton8());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton9());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton10());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton11());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton12());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton13());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton14());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton15());
        arrayButtons.add(ventanaPrincipal.getPanelJuego().getButton16());
    }

    /**
     * Metodo encargado de asignas los oyentes o funcionalidad a cada boton.
     */
    public void listeners() {
        ventanaPrincipal.getPanelPrincipal().getButtonOk().addActionListener(this);
        ventanaPrincipal.getPanelJuego().getButtonReiniciar().addActionListener(this);

        for (JButton button : arrayButtons) {
            button.addActionListener(this);
        }
    }

    /**
     * Metodo encargado de realizar la logica del programa y de juntar el modelo y vista con el controlador.
     *
     * @param e Se refiere al ActionEvent, obtiene la acción que se haya asignado a un boton.
     */
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        System.out.println(command);

        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        localDateTime = LocalDateTime.now();

        PanelPrincipal panelPrincipal = ventanaPrincipal.getPanelPrincipal();
        PanelJuego panelJuego = ventanaPrincipal.getPanelJuego();

        if (command.equalsIgnoreCase("BIENVENIDA_OK")) {
            if (panelPrincipal.getFieldJ1().getText().equals("") || panelPrincipal.getFieldJ2().getText().equals("")) {
                ventanaPrincipal.getMensajes().mostrarError("Los campos no pueden estar vacíos.");
            } else {
                j1 = panelPrincipal.getFieldJ1().getText();
                j2 = panelPrincipal.getFieldJ2().getText();
                panelPrincipal.setVisible(false);
                ventanaPrincipal.setSize(245, 350);
                ventanaPrincipal.setLocationRelativeTo(null);
                panelJuego.getTurnoActual().setText("Turno de: " + j1);
                panelJuego.setVisible(true);
                archivo.escribirArchivo("[" + dateTimeFormatter.format(localDateTime) + "]: ================================================================");
                archivo.escribirArchivo("[" + dateTimeFormatter.format(localDateTime) + "]: ¡Se ha iniciado un nuevo juego! (" + j1 + " (J1) vs " + j2 + " (J2))");
                archivo.escribirArchivo("[" + dateTimeFormatter.format(localDateTime) + "]: ================================================================");
            }
        }

        for (int i = 1; i <= 16; i++) {
            if (command.equalsIgnoreCase("GAME_BUTTON" + i)) {
                if (!turno) {
                    arrayButtons.get(i - 1).setIcon(new ImageIcon(panelJuego.getxImage().getImage().getScaledInstance(arrayButtons.get(i - 1).getWidth(), arrayButtons.get(i - 1).getHeight(), Image.SCALE_SMOOTH)));
                    archivo.escribirArchivo("[" + dateTimeFormatter.format(localDateTime) + "]: '" + j1 + "' marcó 'X' en la casilla " + i + ". (J1)");
                    panelJuego.getTurnoActual().setText("Turno de: " + j2);
                } else {
                    arrayButtons.get(i - 1).setIcon(new ImageIcon(panelJuego.getoImage().getImage().getScaledInstance(arrayButtons.get(i - 1).getWidth(), arrayButtons.get(i - 1).getHeight(), Image.SCALE_SMOOTH)));
                    archivo.escribirArchivo("[" + dateTimeFormatter.format(localDateTime) + "]: '" + j2 + "' marcó 'O' en la casilla " + i + ". (J2)");
                    panelJuego.getTurnoActual().setText("Turno de: " + j1);
                }

                arrayButtons.get(i - 1).setEnabled(false);
                juego.colocarMarca(matriz, command, turno);
                turno = !turno;
            }
        }

        if (juego.verificarGanador(matriz, "O") && ventanaPrincipal.getMensajes().mensajeGanador("¡" + j2 + " ha ganado el juego!") || juego.verificarGanador(matriz, "X") && ventanaPrincipal.getMensajes().mensajeGanador("¡" + j1 + " ha ganado el juego!") || juego.verificarEmpate(matriz) && ventanaPrincipal.getMensajes().mensajeEmpate("¡Es un empate!") || command.equalsIgnoreCase("REINICIAR_JUEGO")) {
            ventanaPrincipal.getPanelJuego().setVisible(false);
            ventanaPrincipal.setSize(510, 210);
            ventanaPrincipal.getPanelPrincipal().setVisible(true);
            ventanaPrincipal.setLocationRelativeTo(null);

            if (juego.verificarEmpate(matriz)) {
                archivo.escribirArchivo("[" + dateTimeFormatter.format(localDateTime) + "]: ================================================================");
                archivo.escribirArchivo("[" + dateTimeFormatter.format(localDateTime) + "]: ¡El juego terminó en un empate! (" + j1 + " (J1) vs " + j2 + " (J2)) * JUEGO FINALIZADO *");
                archivo.escribirArchivo("[" + dateTimeFormatter.format(localDateTime) + "]: ================================================================");
            } else if (juego.verificarGanador(matriz, "X")) {
                archivo.escribirArchivo("[" + dateTimeFormatter.format(localDateTime) + "]: ================================================================");
                archivo.escribirArchivo("[" + dateTimeFormatter.format(localDateTime) + "]: ¡El ganador del juego fue " + j1 + " (J1)! * JUEGO FINALIZADO *");
                archivo.escribirArchivo("[" + dateTimeFormatter.format(localDateTime) + "]: ================================================================");
            } else if (juego.verificarGanador(matriz, "O")) {
                archivo.escribirArchivo("[" + dateTimeFormatter.format(localDateTime) + "]: ================================================================");
                archivo.escribirArchivo("[" + dateTimeFormatter.format(localDateTime) + "]: ¡El ganador del juego fue " + j2 + " (J2)! * JUEGO FINALIZADO *");
                archivo.escribirArchivo("[" + dateTimeFormatter.format(localDateTime) + "]: ================================================================");
            }

            for (int i = 0; i <= 15; i++) {
                arrayButtons.get(i).setIcon(null);
                arrayButtons.get(i).setEnabled(true);
            }

            turno = false;
            matriz = null;
            arrayButtons = null;
            inicializarArrays();
        }
    }
}