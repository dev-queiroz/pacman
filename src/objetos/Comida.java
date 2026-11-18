package objetos;

import java.awt.*;

public class Comida extends Elemento {
    private final boolean poder;

    public Comida(int x, int y, int altura, int largura, Image imagem) {
        this(x, y, altura, largura, imagem, false);
    }

    public Comida(int x, int y, int altura, int largura, Image imagem, boolean poder) {
        super(x, y, altura, largura, imagem);
        this.poder = poder;
    }

    public boolean isPoder() {
        return poder;
    }
}
