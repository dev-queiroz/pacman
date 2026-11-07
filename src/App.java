import logica.Jogo;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();

        JFrame pagina = new JFrame("Pacman");
        pagina.setPreferredSize(new Dimension(625, 707));
        pagina.pack();

        pagina.add(jogo);
        pagina.setResizable(false);
        pagina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pagina.setLocationRelativeTo(null);
        pagina.setVisible(true);

        jogo.requestFocus();
    }
}
