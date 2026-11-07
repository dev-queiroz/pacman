package objetos;

import java.awt.*;
import java.util.HashSet;

public class Elemento {
    int x;
    int y;
    int altura;
    int largura;
    public Image imagem;

    public Elemento(int x, int y, int altura, int largura, Image imagem) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.largura = largura;
        this.imagem = imagem;
    }

    public  boolean colisao(HashSet <Elemento> elemento){
        // fazer logica de colisão
        return true; //retorno pra teste, tirar depois
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getLargura() {
        return largura;
    }

    public Image getImagem() {
        return imagem;
    }

    public int getAltura() {
        return altura;
    }

    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }
}
