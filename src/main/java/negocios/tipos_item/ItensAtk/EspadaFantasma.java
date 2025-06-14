package negocios.tipos_item.ItensAtk;
import java.util.ArrayList;

import negocios.Jogador;
import negocios.tipos_item.ItemAtk;

public class EspadaFantasma extends ItemAtk{
    public EspadaFantasma() {
        super("Espada Fantasma", "- ESPADA FANTASMA -", "aumenta dano de ataques em 5",
                   "bônus aumenta em mais 15 para cada", "espaço vazio restante no inventário");
        this.setRaridade("menos comum");
        ArrayList<String> spritelist = new ArrayList<String>();
        spritelist.add("      .      ");
        spritelist.add("     : :     ");
        spritelist.add("     : :     ");
        spritelist.add("    < O >    ");
        spritelist.add("      :      ");
        this.setSpriteList(spritelist);
    }

    public int Efeito(int entrada, Jogador jogador) {
        int resposta = entrada + 5;
        for (int i = 1; i <= 8; i++) {
            if (jogador.getInventario().getItem(i) == null) resposta += 15;
        }
        return resposta;
    }
}
