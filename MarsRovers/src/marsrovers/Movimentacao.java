/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrovers;

/**
 *
 * @author rodri
 */
public class Movimentacao {
    
    private Coordenadas posicao;
    private char orientacao;
    
    public Movimentacao(Coordenadas posicao, char orientacao){
    
        this.posicao = posicao;
        this.orientacao = orientacao;
    
    }

    public Coordenadas getPosicao() {
        return posicao;
    }

    public char getOrientacao() {
        return orientacao;
    }

    public void setPosicao(Coordenadas posicao) {
        this.posicao = posicao;
    }

    public void setOrientacao(char orientacao) {
        this.orientacao = orientacao;
    }
    
            public void movimentar  (char informacao){
                
            if(informacao=='L'||informacao=='R')
                this.virar(informacao);
            if(informacao=='M')
                this.andar();
                
}
    
    
    public void virar(char comando){
        switch(this.orientacao){
            case 'N':
                if(comando == 'L')
                    this.setOrientacao('W');                
                if(comando == 'R')
                    this.setOrientacao('E');
                break;
                
            case 'S':
                if(comando == 'L')
                    this.setOrientacao('E');                
                if(comando == 'R')
                    this.setOrientacao('W');
                break;
                
            case 'E':
                if(comando == 'L')
                    this.setOrientacao('N');                
                if(comando == 'R')
                    this.setOrientacao('S');
                break;

            case 'W':
                if(comando == 'L')
                    this.setOrientacao('S');                
                if(comando == 'R')
                    this.setOrientacao('N');
                break;    
            default:
                System.out.println("Orientacao inexistente!");
                break;
        }
}
    public void andar(){
      Coordenadas aux = new Coordenadas(this.getPosicao().getX(), this.getPosicao().getY());
      
        switch(this.orientacao){
            case 'N':
                aux.setY((this.getPosicao().getY())+1);
                break;
                
            case 'S':
                aux.setY((this.getPosicao().getY())-1);
                break;
                
            case 'E':
                aux.setX((this.getPosicao().getX())+1);
                break;
          
            case 'W':
                aux.setX((this.getPosicao().getX())-1);
                break;            
            default:
                System.out.println("Posicao inexistente!");
                break;
        }
        this.setPosicao(aux);
}
    
}
