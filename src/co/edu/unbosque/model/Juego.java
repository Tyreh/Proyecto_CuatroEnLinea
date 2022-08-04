package co.edu.unbosque.model;

/**
 * Clase encargada de realizar el algoritmo del programa.
 * @author Oscar Moreno
 * @author Jose Salcedo
 * @author Daniel Pedreros
 */
public class Juego {

    /**
     * Metodo encargado de determinar si hay un ganador.
     * @param matriz Indica la matriz que se debe ingresar.
     * @param marca Indica la marca ('X' o 'O') que se va a validar.
     * @return retorna falso o verdadero.
     */
    public boolean verificarGanador(String[][] matriz, String marca) {
        String marcaFinal = marca + marca + marca + marca;
        String filas;
        String columnas;
        String diagonalIzq;
        String diagonalDer;
        int auxDiagonal;

        for (int i = 0; i < matriz.length; i++) {
            filas = "";
            columnas = "";
            diagonalIzq = "";
            diagonalDer = "";
            auxDiagonal = 0;

            for (int k = 0; k <= 3; k++) {
                if (matriz[k][i].equals(marca)) {
                    filas += marca;
                }

                if (matriz[i][k].equals(marca)) {
                    columnas += marca;
                }

                if (matriz[k][k].equals(marca)) {
                    diagonalIzq += marca;
                }

                if (matriz[3 - k][auxDiagonal++].equals(marca)) {
                    diagonalDer += marca;
                }

                if (filas.equalsIgnoreCase(marcaFinal) || columnas.equalsIgnoreCase(marcaFinal) || diagonalIzq.equalsIgnoreCase(marcaFinal) || diagonalDer.equalsIgnoreCase(marcaFinal)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Metodo encargado de determinar si el juego fue o no un empate.
     * @param matriz Indica la matriz que se debe ingresar.
     * @return retorna verdadero o falso.
     */
    public boolean verificarEmpate(String[][] matriz) {
        for (String[] strings : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                if (strings[j].equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Metodo encargado de colocar la marca 'X' o 'O' en la matriz cuando un jugador oprima de a un boton.
     * @param matriz - Indica la matriz que se debe ingresar.
     * @param comando - Indica la accion que se este ejecutando en cuestion.
     * @param turno - Indica si es el turno del jugador 1 o el jugador 2.
     */
    public void colocarMarca(String[][] matriz, String comando, boolean turno) {
        if (comando.equalsIgnoreCase("GAME_BUTTON1")) {
            if (!turno) {
                matriz[0][0] = "X";
            } else {
                matriz[0][0] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON2")) {
            if (!turno) {
                matriz[1][0] = "X";
            } else {
                matriz[1][0] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON3")) {
            if (!turno) {
                matriz[2][0] = "X";
            } else {
                matriz[2][0] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON4")) {
            if (!turno) {
                matriz[3][0] = "X";
            } else {
                matriz[3][0] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON5")) {
            if (!turno) {
                matriz[0][1] = "X";
            } else {
                matriz[0][1] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON6")) {
            if (!turno) {
                matriz[1][1] = "X";
            } else {
                matriz[1][1] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON7")) {
            if (!turno) {
                matriz[2][1] = "X";
            } else {
                matriz[2][1] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON8")) {
            if (!turno) {
                matriz[3][1] = "X";
            } else {
                matriz[3][1] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON9")) {
            if (!turno) {
                matriz[0][2] = "X";
            } else {
                matriz[0][2] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON10")) {
            if (!turno) {
                matriz[1][2] = "X";
            } else {
                matriz[1][2] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON11")) {
            if (!turno) {
                matriz[2][2] = "X";
            } else {
                matriz[2][2] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON12")) {
            if (!turno) {
                matriz[3][2] = "X";
            } else {
                matriz[3][2] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON13")) {
            if (!turno) {
                matriz[0][3] = "X";
            } else {
                matriz[0][3] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON14")) {
            if (!turno) {
                matriz[1][3] = "X";
            } else {
                matriz[1][3] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON15")) {
            if (!turno) {
                matriz[2][3] = "X";
            } else {
                matriz[2][3] = "O";
            }
        } else if (comando.equalsIgnoreCase("GAME_BUTTON16")) {
            if (!turno) {
                matriz[3][3] = "X";
            } else {
                matriz[3][3] = "O";
            }
        }
    }
}

