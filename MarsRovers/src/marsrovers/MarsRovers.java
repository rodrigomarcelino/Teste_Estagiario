/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrovers;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class MarsRovers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char orientacao;
        char[] informacao;
        int x, y;
         ArrayList<Movimentacao> lista = new ArrayList<Movimentacao>();
        
        Scanner sc = new Scanner(System.in);
           
        do{
                
            System.out.println("Insira o tamanho de Plateau: ");
        
        x = sc.nextInt();
        y = sc.nextInt(); 
        
        if(x<=0 || y<=0){
         
            System.out.println("Tamanho de Plateau inexistente.");
        }
        }while(x<=0 || y<=0);
        
        Coordenadas plateau = new Coordenadas(x, y);
        
        System.out.println("Para sair entre com -1,-1");
        
          while(true){
            System.out.println("Entre com a posicao e a orientacao do Rover: ");
            x = sc.nextInt(); 
            y = sc.nextInt();
            
            if(x<=0 && y<=0)
               break;
            
            orientacao = sc.next().charAt(0);
            
            plateau.setX(x);
            plateau.setY(y);
            
            
            Movimentacao movimentacao = new Movimentacao(plateau, orientacao);
            
            System.out.println("Entre com as orientacoes do Rover: ");
            sc.nextLine();
            informacao = sc.nextLine().toCharArray();
            
            for(char z:informacao){
                movimentacao.movimentar(z); 
            }
            lista.add(movimentacao);
}
                  for(Movimentacao w: lista){
            System.out.println(w.getPosicao().getX() + " " + w.getPosicao().getY() + " " + w.getOrientacao());
}
    }
    }
    
