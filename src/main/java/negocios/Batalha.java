package negocios;


import java.util.Random;
import java.util.Scanner;

public class Batalha {
    private int numTurnos;
    private Jogador personagem;
    private Inimigo inimigo;
    private Inventario inventario;
    private boolean seAtivo;
    private GameManager manager;

    public Batalha(int numTurnos, Jogador personagem, Inimigo inimigo, GameManager manager) {
        this.numTurnos = numTurnos;
        this.inventario = personagem.getInventario();
        this.personagem = personagem;
        this.inimigo = inimigo;
        this.manager = manager;
    }

    //Getter e Setters

    public void setInimigo(Inimigo inimigo) {
        this.inimigo = inimigo;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventário(Inventario inventario) {
        this.inventario = inventario;
    }

    public void setNumTurnos(int numTurnos) {
        this.numTurnos = numTurnos;
    }
    public void setPersonagem(Jogador personagem) {
        this.personagem = personagem;
    }
    public void setSeAtivo(boolean seAtivo) {
        this.seAtivo = seAtivo;
    }
    public Inimigo getInimigo() {
        return inimigo;
    }
    public int getNumTurnos() {
        return numTurnos;
    }
    public Jogador getPersonagem() {
        return personagem;
    }
    public boolean getSeAtivo() {
        return seAtivo;
    }

    //Métodos

    public void turnoJogador() {
            Scanner sc = new Scanner(System.in);

            int turno;
            try {
                turno = sc.nextInt();
            } catch (Exception e) {
                turno = -1;
            } 
            switch(turno) {
                case 1:
                    personagem.atacar(this,inimigo);
                    numTurnos--;
                    break;
                case 2:
                    manager.popUpStats(new String[] {"", (inimigo.getAtk() + " ATAQUE"), (inimigo.getDef() + " DEFESA"), "pressione enter para fechar essa tela"});
                    manager.getTela().renderScreen();
                    sc.nextLine();
                    sc.nextLine();
                    numTurnos--;
                    break;
                case 3:
                    manager.manusearInventario();
                    numTurnos--;
                    break;
                case 4:
                    break;
            }


    }
    public void turnoInimigo() {
        inimigo.atacar(this, personagem);
    }
}
