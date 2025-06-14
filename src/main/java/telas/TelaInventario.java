package telas;
import java.util.ArrayList;

import utilidades.ComandosUteis;
/*
ITENS POSICAO:
item 1: Linha 3, Coluna 8 
item 2: Linha 3, Coluna 8 + 20
item 3: Linha 3, Coluna 8 + 20 + 20
item 4: Linha 3, Coluna 8 + 20 + 20 + 20
item 5: Linha 11, Coluna 8
item 6: Linha 11, Coluna 8 + 20
item 7: Linha 11, Coluna 8 + 20 + 20
item 8: Linha 11, Coluna 8 + 20 + 20 + 20

tamanho: 5 x 13
*/
public abstract class TelaInventario {
    public static void drawUI(ArrayList<String> tela) {
        new Sprite(SpritesInterface.getInvBase(), 0, 0).draw(tela);
    }

    //usando como argumento a tela, o sprite de um item e o index de um item no inventario, coloca
    //o item no espacinho certinho perfeito
    public static void drawItem(ArrayList<String> tela, Sprite sprite, int itemindex) {
        int linha, coluna;
        if (itemindex < 5 && itemindex > 0) {linha = 3;} else if (itemindex < 9 && itemindex > 4) {linha = 11;} else {return;}
        coluna = 8;
        for (int i = 0; i < ((itemindex + 3) % 4); i++) {coluna += 20;}

        sprite.draw(tela, linha, coluna);
    } //tambem pode usar a lista de string se quiser e ela vai ser convertida em objeto Sprite
    public static void drawItem(ArrayList<String> tela, ArrayList<String> spritelist, int itemindex) {
        drawItem(tela, new Sprite(spritelist), itemindex);
    }

    //nesse as opções NÃO vão ser numeradas automaticamente como no menu de batalha, a numeração deve ser parte da string
    //imagino que não tem nenhuma situação que pode necessitar de mais que 2 opções nessa tela do menu
    //então vou programar pra formatar pra 2 opções
    //limite de tamanho de string: 43
    public static void drawOptions(ArrayList<String> tela, String... args) {
        for (int i = 0; i < args.length && i < 2; i++) {
            StringBuilder builder = new StringBuilder(tela.get(17+i));
            builder.replace(1, 89, ComandosUteis.autocentraliza(args[i], 88));
            tela.set(17+i, builder.toString());
        }
    }
}
