package objetos;

import graficos.Imagens;

import java.awt.*;

public class PacMan extends Movel {
    public PacMan(int x, int y, int altura, int largura, Image imagem, int tamanhoDeslocamento) {
        super(x, y, altura, largura, imagem, tamanhoDeslocamento);
    }

    public void atualizarImagem(char c, Imagens imagem){
        switch(c){
            case 'U':
                setImagem(imagem.pacmanUp);
                break;
            case 'D':
                setImagem(imagem.pacmanDown);
                break;
            case 'L':
                setImagem(imagem.pacmanLeft);
                break;
            case'R':
                setImagem(imagem.pacmanRight);
                break;
        }
    }

}
