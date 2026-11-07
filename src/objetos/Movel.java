package objetos;

import java.awt.*;
import java.util.HashSet;

public class Movel extends Elemento {
    int inicioX;
    int inicioY;
    char direcao;
    int velocidadeX;
    int velocidadeY;

    public Movel(int x, int y, int altura, int largura, Image imagem) {
        super(x, y, altura, largura, imagem);
        this.inicioX = x;
        this.inicioY = y;
    }

    //Função de atualizar direção, chama mover e atualzar direcao ,caso tenha uma colisão naquela direção volta pra que tava antes e atualiza a velocidade;
    public void atualizarDirecao(char c, HashSet<Bloco> blocos){}

    //autoexplicativo né
    public void mover(){

    }

    // usa quando colidir com uma parede pra diminuir o x e o y
    public void moverParaTras(){}

    // atualiz a velocidade de acordo com a direção
    public void atualizarVelocidade(){

    }

    //voltar pro x e y de começo
    public void resetarPosicao(){

    }

    // autoexplicativo né part II
    public void parar(){}

    public char getDirecao() {
        return direcao;
    }
}
