// Dev: Lucas Pereira do Amaral #
package ppratica5;
import java.util.Scanner;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno();
        Disciplina disciplina = new Disciplina();
        
        sc = new Scanner(System.in); 
               
        System.out.println("Digite um nome: ");
        String a = sc.nextLine();        
        aluno1.alteraNome(a);
        
        System.out.println("Digite um id: ");
        int b = sc.nextInt();
        aluno1.alteraId(b);
        
        aluno1.nota1 = 3.5;
        aluno1.nota2 = 6.5;
        
        System.out.println("A média do aluno é " + aluno1.retornaMedia());
       
        if (aluno1.passou()){
            System.out.println("O aluno foi aprovado por média");
        } else{
            System.out.println("O aluno não foi aprovado por média");
        }
        
        System.out.println("Populando array...");
        disciplina.populaArray();
        
        System.out.println("Digite uma posição na lista para imprimir o sucessor e antecessor");
        int c = sc.nextInt();
        disciplina.antecessorSucessor(c);
    
    }
    

}


