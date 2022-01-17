package projetoUFC;
public class ProjetoUFC {
    public static void main (String args[]){
        Lutador l[] = new Lutador[4];
        l[0] = new Lutador ("Pretty Boy", "França" , 31 , 1.75f , 68.9f, 
                             11 , 1 , 2);
        l[1] = new Lutador ("Putscript", "Brasil", 29, 1.68f, 57.8f,
                             14 , 2, 3);
        l[2] = new Lutador ("Snapshadow", "EUA", 35, 1.65f, 80.9f,
                             12, 2, 1);
        l[3] = new Lutador ("Dead Coad", "Australia", 28, 1.93f, 81.6f,
                              13, 0, 2);
        Luta uec01 = new Luta();
        uec01.marcarLuta(l[0], l[1]);
        uec01.lutar();
        l[0].status();
        l[1].status();
        
        Luta uec02 = new Luta();
        uec02.marcarLuta(l[2],l[2]);
        uec02.lutar();
    }
}
