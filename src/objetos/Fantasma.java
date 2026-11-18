package objetos;

import java.awt.*;

public class Fantasma extends Movel {
    private boolean assustado;

    public Fantasma(int x, int y, int altura, int largura, Image imagem, int tamanhoDeslocamento) {
        super(x, y, altura, largura, imagem, tamanhoDeslocamento);
    }

    public boolean isAssustado() {
        return assustado;
    }

    public void setAssustado(boolean assustado) {
        this.assustado = assustado;
    }
}
