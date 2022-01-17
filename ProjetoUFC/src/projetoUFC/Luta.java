package projetoUFC;

import java.util.Random;
public class Luta {
    //ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rouds;
    private boolean aprovada;
    
    //MÉTODOS PÚBLICOS
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
            
    }
    public void lutar(){
        if(this.getAprovada()){
            System.out.println("###DESAFIADO###");
            this.getDesafiado().apresentar();
            System.out.println("###DESAFIANTE###");
            this.getDesafiante().apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("====RESULTADO DA LUTA====");
            switch(vencedor){
                
                case 0: //empate
                    System.out.println("Empatou!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1: //desafiado vence
                     System.out.println("Vitória do " + this.getDesafiado().getNome() + "!");
                     this.getDesafiado().ganharLuta();
                     this.getDesafiante().perderLuta();
                    break;
                case 2: //desafiante vence
                    System.out.println("Vitória do " + this.getDesafiante().getNome() + "!");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }
            System.out.println("=====================");
            
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
    //MÉTODOS ESPECIAIS

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
