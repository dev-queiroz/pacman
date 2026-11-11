package objetos;

import java.awt.*;
import java.util.HashSet;

public class Movel extends Elemento {
    int inicioX;
    int inicioY;
    char direcao;
    int velocidadeX;
    int velocidadeY;
    int tamanhoDeslocamento;

    public Movel(int x, int y, int altura, int largura, Image imagem, int tamanhoDeslocamento) {
        super(x, y, altura, largura, imagem);
        this.inicioX = x;
        this.inicioY = y;
        this.tamanhoDeslocamento = tamanhoDeslocamento;
    }

    //Função de atualizar direção, chama mover e atualzar direcao ,caso tenha uma colisão naquela direção volta pra que tava antes e atualiza a velocidade;
    public void atualizarDirecao(char c, HashSet<Bloco> blocos){}

    //autoexplicativo né
    public void mover(){
        x += velocidadeX;
        y += velocidadeY;
    }

    // usa quando colidir com uma parede pra diminuir o x e o y
    public void moverParaTras(){
        x -= velocidadeX;
        y-= velocidadeY;
    }

    // atualiz a velocidade de acordo com a direção
    public void atualizarVelocidade(){
        switch (direcao){
            case 'R':
                velocidadeX = tamanhoDeslocamento;
                velocidadeY = 0;
                break;
            case 'L':
                velocidadeX = -tamanhoDeslocamento;
                velocidadeY = 0;
                break;
            case 'U':
                velocidadeX = 0;
                velocidadeY = tamanhoDeslocamento;
                break;
            case 'D':
                velocidadeX = 0;
                velocidadeY = -tamanhoDeslocamento;
                break;
        }
    }

    //voltar pro x e y de começo
    public void resetarPosicao(){
        x = inicioX;
        y = inicioY;
    }

    // autoexplicativo né part II
    public void parar(){
        velocidadeX = 0;
        velocidadeY = 0;
    }

    public char getDirecao() {
        return direcao;
    }
}
