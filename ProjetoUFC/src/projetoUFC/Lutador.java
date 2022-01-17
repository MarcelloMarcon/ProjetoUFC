package projetoUFC;
public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade;
    private float altura, peso;
    private int vitorias, derrotas, empates;
    
    //Métodos Especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float al){
        this.altura = al;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float pe){
        this.peso = pe;
        this.setCategoria();
    }
    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vi){
        this.vitorias = vi;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int de){
        this.derrotas = de;
    }
    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int em){
        this.empates = em;
    }
    public String getCategoria(){
        return categoria;
    }
    private void setCategoria(){
        if(this.peso<52.3)
            this.categoria = "inválido";
        else if(this.peso<70.3)
            this.categoria = "leve";
        else if(this.peso<83.9)
            this.categoria = "médio";
        else if(this.peso<120.2)
            this.categoria = "pesado";
        else this.categoria = "inválido";
    }
    //Métodos
    public void apresentar(){
        System.out.println("-------Dados do Lutador-------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitóritas: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        
    }
    public void status(){
        System.out.println(this.getNome() + " é um lutador peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }
    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
        
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
        
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
        
    }
}
