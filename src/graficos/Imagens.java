package graficos;

import javax.swing.*;
import java.awt.*;

public class Imagens {
    public Image bloco = new ImageIcon(getClass().getResource("../resources/imagens/wall.png")).getImage();
    public Image fantasmaazul = new ImageIcon(getClass().getResource("../resources/imagens/blueGhost.png")).getImage();
    public Image fantasmalaranja = new ImageIcon(getClass().getResource("../resources/imagens/orangeGhost.png")).getImage();
    public Image fantasmarosa = new ImageIcon(getClass().getResource("../resources/imagens/pinkGhost.png")).getImage();
    public Image fantasmavermelho = new ImageIcon(getClass().getResource("../resources/imagens/redGhost.png")).getImage();
    public Image comida = new ImageIcon(getClass().getResource("../resources/imagens/food.png")).getImage();

    public Image pacmanUp = new ImageIcon(getClass().getResource("../resources/imagens/pacmanUp.png")).getImage();
    public Image pacmanDown = new ImageIcon(getClass().getResource("../resources/imagens/pacmanDown.png")).getImage();
    public Image pacmanLeft = new ImageIcon(getClass().getResource("../resources/imagens/pacmanLeft.png")).getImage();
    public Image pacmanRight = new ImageIcon(getClass().getResource("../resources/imagens/pacmanRight.png")).getImage();
}
