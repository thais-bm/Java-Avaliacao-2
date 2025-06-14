package negocios;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/*
Criei essa classe abstrata pra ter um lugar onde guardar os sprites sem deixar um negocio enorme dentro do codigo das outras classes
por sinal, barrinha inclinada pra esquerda "\" dentro de string causa erro sozinha por causa da formatação de strings
duas barrinhas tipo "\\" saem como uma só barrinha "\" na hora de fazer o print
então cada par de "\\" representa um "\"

fora isso
sprite do player em batalha: 8 x 42
sprite do inimigo em batalha: 13 x 42

*/

public abstract class Spritesheets {
    public static ArrayList<String> getCavaleirinho() {
        ArrayList<String> sprite;
        sprite = new ArrayList<String>();
        sprite.add("                                          ");
        sprite.add("                                          ");
        sprite.add("           __                /            ");
        sprite.add("           \\ Z_            / /            ");
        sprite.add("             \\_\\__       /__ /            ");
        sprite.add("             /  \\\\\\_     //               ");
        sprite.add("             \\_____/    //                ");
        sprite.add("             /    \\    //                 ");
        return sprite;
    }
    
    public static ArrayList<String> getFantasminha() {
        ArrayList<String> sprite;
        sprite = new ArrayList<String>();
        sprite.add("                                          ");
        sprite.add("                                          ");
        sprite.add("                                          ");
        sprite.add("                                          ");
        sprite.add("             __------__                   ");
        sprite.add("            /          \\\\                 ");
        sprite.add("         __|       O     _\\__             ");
        sprite.add("        |  |  O      _       \\            ");
        sprite.add("         \\_|    ___--      _/             ");
        sprite.add("            \\              _\\             ");
        sprite.add("             |         ___/               ");
        sprite.add("             \\_/\\_____/                   ");
        sprite.add("                                          ");
        return sprite;
    }

    public static ArrayList<String> getEsnupi() {
        ArrayList<String> sprite;
        sprite = new ArrayList<String>();
        sprite.add("            ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⢿⣿⣿⣿⣿           ");
        sprite.add("            ⣿⣿⣿⣿⠿⣟⣛⣛⣛⣫⣵⣿⣿⣿⣮⠻⣿⣿           ");
        sprite.add("            ⣿⣿⡿⣱⣿⣿⣿⣿⣿⢻⣿⣿⣿⣿⣿⣷⢻⣿           ");
        sprite.add("            ⣿⠫⠡⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠉⠇⣿           ");
        sprite.add("            ⣿⣶⣦⡻⢿⣿⣿⣿⣿⣿⣿⣿⡇⠣⠈⢠⠐⣿           ");
        sprite.add("            ⣿⣿⣿⣿⣷⣾⣽⣻⢿⣿⣿⡿⡸⠂⠀⡠⣳⣿           ");
        sprite.add("            ⣿⣿⣿⣿⣿⣿⣿⡿⣁⣛⡣⣿⣷⣮⣽⣾⣿⣿           ");
        sprite.add("            ⣿⣿⣿⣿⣿⣿⢟⣼⣿⣻⣇⣿⣿⣿⣿⣿⣿⣿           ");
        sprite.add("            ⣿⣿⣿⣿⣿⡟⣾⣿⣏⣿⡟⢸⣿⣿⣿⣿⣿⣿           ");
        sprite.add("            ⣿⣿⣿⣿⣿⣇⡻⣿⡿⡟⢏⡙⡿⣿⣿⣿⣿⣿           ");
        sprite.add("            ⣿⣿⣿⣿⣿⣿⠿⠆⣿⢻⣷⢾⣭⣵⣿⣿⣿⣿           ");
        sprite.add("            ⣿⣿⣿⣿⠻⢞⣭⣯⣯⣾⣿⣝⢿⣿⣿⣿⣿⣿           ");
        sprite.add("            ⣿⣿⣿⣿⣷⣦⣥⣯⣯⣯⣭⣭⣼⣿⣿⣿⣿⣿           ");
        return sprite;
    }

    public static ArrayList<String> getPalitinho() {
        ArrayList<String> sprite;
        sprite = new ArrayList<String>();
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                  O                      ");
        sprite.add("                 /|\\                     ");
        sprite.add("                 / \\                     ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        return sprite;
    }

    public static ArrayList<String> getInimigoVazio() {
        ArrayList<String> sprite;
        sprite = new ArrayList<String>();
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        sprite.add("                                         ");
        return sprite;
    }

    public static ArrayList<String> getEspadinha() {
        ArrayList<String> spritelist = new ArrayList<>();
        spritelist.add("     / \\     ");
        spritelist.add("     |Y|     ");
        spritelist.add("     \\|/     ");
        spritelist.add("    <=O=>    ");
        spritelist.add("      ⡇      ");
        return spritelist;
    }

    public static ArrayList<String> getEspadaMinecraft() {
        ArrayList<String> spritelist = new ArrayList<>();
        spritelist.add("     ⠀⠀⠀⠀⡐⡉⣹ ");
        spritelist.add("   ⠀⡀⠀⠀⡔⢊⡬⠊⠁ ");
        spritelist.add("  ⠀⠚⣗⣤⡪⡢⠓⠁⠀⠀ ");
        spritelist.add("  ⠀⢀⣼⠾⣳⣅⠀⠀⠀⠀ ");
        spritelist.add("  ⣿⡯⠁⠀⠀⠉⠁⠀⠀⠀ ");
        return spritelist;
    }
    public static ArrayList<String> getPicaretaMinecraft() {
        ArrayList<String> spritelist = new ArrayList<>();
        spritelist.add(" ⠀⠀⠀⠀⣀⣀⡀⠀⠀⠀  ");
        spritelist.add(" ⠀⠀⠀⠁⠒⢒⢪⠙⣇⠀  ");
        spritelist.add(" ⠀⠀⠀⠀⡠⡮⠋⢱⢸⠅  ");
        spritelist.add(" ⠀⠀⣠⡺⠝⠀⠀⠘⠬⠁  ");
        spritelist.add(" ⠀⠺⠊⠀⠀⠀⠀⠀⠀⠀  ");
        return spritelist;
    }
    public static ArrayList<String> getVitoria() {
        ArrayList<String> spritelist = new ArrayList<>();
        spritelist.add("o-------------------o");
        spritelist.add("[  MATOU O INIMIGO  ]");
        spritelist.add("]      PARABENS     [");
        spritelist.add("[     VITORIA!!1    ]");
        spritelist.add("o-------------------o");
        return spritelist;
    }
    public static ArrayList<String> getClearItem() {
        ArrayList<String> spritelist = new ArrayList<>();
        spritelist.add("             ");
        spritelist.add("             ");
        spritelist.add("             ");
        spritelist.add("             ");
        spritelist.add("             ");
        return spritelist;
    }
    public static ArrayList<String> getEscudo1() {
        ArrayList<String> spritelist = new ArrayList<>();
        spritelist.add("  //=====\\\\  ");
        spritelist.add(" ||   \\__ || ");
        spritelist.add(" ||      \\|| ");
        spritelist.add("  \\\\_____//  ");
        spritelist.add("   \\-----/   ");
        return spritelist;
    }
}