package logica;

import graficos.Imagens;
import objetos.Bloco;
import objetos.Comida;
import objetos.Fantasma;
import objetos.PacMan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;

public class Jogo extends JPanel implements ActionListener, KeyListener {
    // o que tá em haset é o que pode ir sendo acessado ou removido caso necessário
    Mapa mapa;
    HashSet<Bloco> blocos;
    HashSet<Comida> comidas;
    HashSet<Fantasma> fantasmas;
    PacMan pacman;
    Imagens imagens = new Imagens();

    boolean fimDeJogo;
    Timer gameLoop;

    int vidas;
    int score = 0;


    public Jogo() {
        // construtor que inicia o painel do jogo, mapa, e tbm o timer de gameloop
        mapa = new Mapa();
        setSize(mapa.getLarguraMapa(), mapa.getAlturaMapa());
        setBackground(Color.BLACK);
        setVisible(true);

        mapa.carregarMapa();
        blocos = mapa.getBlocos();
        comidas = mapa.getComidas();
        fantasmas = mapa.getFantasmas();
        pacman = mapa.getPacman();

        fimDeJogo = false;

        gameLoop = new Timer(50, this);
        gameLoop.start();

        addKeyListener(this); // Adiciona o leitor de chave
        setFocusable(true); // deixa como foco
    }

    public void mover(){ // função que vai cuidar de cada frame do jogo(considerar colisão, se comeu a comida etc etc)
        //fazer logica de movimento usando colisão;
        // implementar o teleporte de um lado pro outro
        //se vcs quiserem fazer aquelas frutas diferentes ou poderzinhos add tbm
    }

    public void resetar(){
        //chama a resetar das classes moveis
    }

    public void resetarTotal(){ // reinicia tudo

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Função da ActionListener que vai ficar executando os frames do jogo
        mover();
        repaint(); // função da classe que redesenha os componentes
        if(fimDeJogo){
            gameLoop.stop();
        }

        //fazer uma logica pra ir alterando a imagem do pacman de acordo como a direção dele
    }


    @Override
    public void keyTyped(KeyEvent e) {} // não vai ser usado só ta ái pq tem que tá

    @Override
    public void keyPressed(KeyEvent e) {} // não vai ser usado só ta ái pq tem que tá

    @Override
    public void keyReleased(KeyEvent e) {
        // apertar botão pra qndo o jogo tiver acabado ele voltar
        if(fimDeJogo){
            resetarTotal();
            repaint();
        }

        // alterar direção de acordo com as teclas do teclado
        int codigo = e.getKeyCode();

        if(codigo == KeyEvent.VK_UP){
            // fazeer logica de alterar direção
        } else if (codigo == KeyEvent.VK_DOWN) {

        }else if (codigo == KeyEvent.VK_LEFT) {

        }else if (codigo == KeyEvent.VK_RIGHT) {

        }
    }

    @Override
    protected void paintComponent(Graphics g) { // Desenho de componentes
        super.paintComponent(g);

        g.drawImage(pacman.getImagem(), pacman.getX(), pacman.getY(), pacman.getLargura(), pacman.getAltura(),null);

        for(Fantasma fantasma : fantasmas){
            g.drawImage(fantasma.getImagem(), fantasma.getX(), fantasma.getY(), fantasma.getLargura(), fantasma.getAltura(),null);
        }

        for(Bloco bloco : blocos){
            g.drawImage(bloco.getImagem(), bloco.getX(), bloco.getY(), bloco.getLargura(), bloco.getAltura(),null);
        }

        for(Comida comida : comidas){
            g.drawImage(comida.getImagem(), comida.getX(), comida.getY(), comida.getLargura(), comida.getAltura(),null);

        }

        g.setFont(new Font("Courier", Font.PLAIN, 18));
        if (fimDeJogo) {
            g.drawString("Game Over: " + String.valueOf(score), 16, 16);
        }
        else {
            g.drawString("x" + String.valueOf(vidas) + " Score: " + String.valueOf(score), 16, 16);
        }

    }
}
