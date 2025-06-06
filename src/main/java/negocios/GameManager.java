package negocios;
import telas.ScreenManager;
import telas.Sprite;

import java.util.Scanner;
import telas.Sprite;

public class GameManager {
    private Batalha batalha;
    private ScreenManager tela;

    public GameManager(Batalha batalha, ScreenManager tela) {
        this.batalha = batalha;
        this.tela = tela;
    }

    //Getters e Setters

    public Batalha getBatalha() {
        return batalha;
    }

    public void setBatalha(Batalha batalha) {
        this.batalha = batalha;
    }

    //Métodos
    public void iniciarBatalha(Batalha batalha) {
        batalha.setSeAtivo(true);
        System.out.println("Batalha iniciada com sucesso!");
        System.out.println(batalha.getNumTurnos() + " turnos ao total");
    }

    public void battleSpriteLoad(Batalha batalha, String... args) {
        tela.updatePlayerData(batalha.getPersonagem());
        tela.updateEnemyData(batalha.getInimigo());
        tela.updatePlayerSprite(batalha.getPersonagem().getSpriteList());
        tela.updateInimigoSprite(batalha.getInimigo().getSpriteList());
        tela.drawBattleScreen(args);
        if (args.length > 0) {
            
            if (args[0].equals(batalha.getInimigo().getNome() + " morreu, prosseguir")) {
                System.out.println("morreu");
                new Sprite(Spritesheets.getVitoria(), 11, 45).draw(tela.getScreen());
            }
        }
        tela.renderScreen();
    }

    public void controleTurno(Batalha batalha) {
        if (batalha.getSeAtivo()) {
            while (batalha.getNumTurnos() > 0 && batalha.getSeAtivo()) {
                System.out.println("Turno atual: " + batalha.getNumTurnos());
                battleSpriteLoad(batalha, "Atacar", "Defender", "Inventario", "Nao sei");
                batalha.turnoJogador();

                //Conseguiu derrotar o inimigo
                if (batalha.getInimigo().getVida() <= 0) {
                    battleSpriteLoad(batalha, batalha.getInimigo().getNome() + " morreu, prosseguir");
                    Scanner scanner = new Scanner(System.in);
                    scanner.next();
                    derrotouInimigo();
                    break;
                }

                System.out.println("Turno atual: " + batalha.getNumTurnos());
                batalha.turnoInimigo();

                if (batalha.getInimigo().getVida() <= 0) {
                    derrotouInimigo();
                    break;
                }
                //Não conseguiu derrotar no numero de turnos dados
                if(batalha.getNumTurnos() <= 0 && batalha.getInimigo().getVida() > 0) {
                    perdeu();
                    break;
                }

            }
        }
    }

    public void derrotouInimigo() {
        batalha.setSeAtivo(false);
        System.out.println("Batalha acabou!");
        if (batalha.getInimigo().recompensa != null) {
            adicionarAoInventario();

        }
        reinciarBatalha();
    }

    //Se o inimigo tiver recompensas adiciona elas ao inventario
    //Nao sei se o jogador vai ter que escolher entre oq adicioar e descartar ou se vai adicionar tudo direto
    public void adicionarAoInventario(){
        System.out.println("O inimigo dropou recompensas: ");
        for (int i = 0; i < batalha.getInimigo().recompensa.size(); i++) {
            System.out.println("-" + batalha.getInimigo().recompensa.get(i).getNome());
        }

        //Adiciona as recompensas que o inimigo tinha no inventario
        for (int i = 0; i < batalha.getInimigo().recompensa.size(); i++) {
            System.out.println(batalha.getInimigo().recompensa.get(i).getNome() + " adicionado no inventário");
            batalha.getInventário().adicionarItem(batalha.getInimigo().recompensa.get(i));
        }
    }

    public void perdeu(){
        batalha.setSeAtivo(false);
        System.out.println("Batalha acabou!");
        System.out.println("Não conseguiu ganhar no numero de turnos determinados ");
        reinciarBatalha();
    }

    public void reinciarBatalha() {
        System.out.println("Turno reinciado!");
        batalha.setSeAtivo(false);
    }

}


