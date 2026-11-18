package logica;

import graficos.Imagens;
import objetos.Bloco;
import objetos.Comida;
import objetos.Fantasma;
import objetos.PacMan;

import java.util.HashSet;


public class Mapa {
    private static final int TAMANHO_COMIDA = 4;
    private static final int TAMANHO_COMIDA_PODER = 16;
    // mapa
    int colunas = 19;
    int linhas = 21;
    int pixelsPorElemento = 32;
    int larguraMapa = colunas * pixelsPorElemento;
    int alturaMapa = linhas * pixelsPorElemento;

    // elementos
    HashSet<Bloco> blocos = new HashSet<>();
    HashSet<Comida> comidas = new HashSet<>();
    HashSet<Fantasma> fantasmas = new HashSet<>();
    PacMan pacman;

    //imagens
    Imagens imagem = new Imagens();


    // X = parede, O = nada, P = Pacman, espaço = comida, C = comida normal maior
    //Fantasmas: b = blue, o = orange, p = pink, r = red
    private String[] tileMap = {
            "XXXXXXXXXXXXXXXXXXX",
            "XC       X       CX",
            "X XX XXX X XXX XX X",
            "X C             C X",
            "X XX X XXXXX X XX X",
            "X    X       X    X",
            "XXXX XXXX XXXX XXXX",
            "OOOX X       X XOOO",
            "XXXX X XXrXX X XXXX",
            "O       bpo       O",
            "XXXX X XXXXX X XXXX",
            "OOOX X       X XOOO",
            "XXXX X XXXXX X XXXX",
            "X        X        X",
            "X XX XXX X XXX XX X",
            "X  X     P     X  X",
            "XX X X XXXXX X X XX",
            "X    X   X   X    X",
            "X XXXXXX X XXXXXX X",
            "XC               CX",
            "XXXXXXXXXXXXXXXXXXX"
    };

    public void carregarMapa(){ // inicializa os elementos com base no mapa de strings aí de cima
        for(int linha = 0; linha < tileMap.length; linha++){
            for(int coluna = 0; coluna <tileMap[linha].length(); coluna++){
                int x = coluna * pixelsPorElemento;
                int y = linha * pixelsPorElemento;

                if(tileMap[linha].charAt(coluna) == 'P'){
                    pacman = new PacMan(x, y, pixelsPorElemento, pixelsPorElemento, imagem.pacmanRight, pixelsPorElemento/4);
                } else if (tileMap[linha].charAt(coluna) == 'X') {
                    blocos.add(new Bloco(x,y,pixelsPorElemento,pixelsPorElemento,imagem.bloco));
                } else if (tileMap[linha].charAt(coluna) == ' ') {
                    comidas.add(new Comida(x+14, y+14, TAMANHO_COMIDA, TAMANHO_COMIDA, imagem.comida));
                } else if (tileMap[linha].charAt(coluna) == 'C') {
                    // Usa a mesma imagem da comida comum; muda apenas o tamanho.
                    comidas.add(new Comida(x+8, y+8, TAMANHO_COMIDA_PODER, TAMANHO_COMIDA_PODER, imagem.comida, true));
                } else if (tileMap[linha].charAt(coluna) == 'b') {
                    fantasmas.add(new Fantasma(x,y,pixelsPorElemento,pixelsPorElemento,imagem.fantasmaazul, pixelsPorElemento/4));
                }else if (tileMap[linha].charAt(coluna) == 'o') {
                    fantasmas.add(new Fantasma(x,y,pixelsPorElemento,pixelsPorElemento,imagem.fantasmalaranja, pixelsPorElemento/4));
                }else if (tileMap[linha].charAt(coluna) == 'p') {
                    fantasmas.add(new Fantasma(x,y,pixelsPorElemento,pixelsPorElemento,imagem.fantasmarosa, pixelsPorElemento/4));
                }else if (tileMap[linha].charAt(coluna) == 'r') {
                    fantasmas.add(new Fantasma(x,y,pixelsPorElemento,pixelsPorElemento,imagem.fantasmavermelho, pixelsPorElemento/4));
                }
            }
        }
    }

    public HashSet<Bloco> getBlocos() {
        return blocos;
    }

    public HashSet<Comida> getComidas() {
        return comidas;
    }

    public HashSet<Fantasma> getFantasmas() {
        return fantasmas;
    }

    public PacMan getPacman() {
        return pacman;
    }

    public int getLarguraMapa() {
        return larguraMapa;
    }

    public int getAlturaMapa() {
        return alturaMapa;
    }
}
