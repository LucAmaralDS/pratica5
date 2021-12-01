package ppratica5;

public class Aluno {
	protected String nome; 
    private int id;
    private double media;

    protected double nota1;
    protected double nota2;
    
    public void imprimeNome (){
        System.out.println("O nome é: " + this.nome);        
    }
    
    public void alteraNome(String nome){
        this.nome = nome;               
    }
    
    public void imprimeId(){
        System.out.println("O id é: " +this.id);
    }

    public void alteraId(int id){
        this.id = id;
    }
    
    public double retornaMedia(){
        calculaMedia();
        return this.media;
           
    }
    
    public boolean passou(){
        return this.media >= 7;
    }
    
   
    private void calculaMedia(){
        media = ((this.nota1 + this.nota2) / 2);
    }

    
}



