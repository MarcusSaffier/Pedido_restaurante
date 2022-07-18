
package restaurante_pedido;


public class Pedido {
    
    String nome_cliente;
    int num_pessoas;
    double valor_total, rateio;
    
    public void metodo_rateio(){
        
        rateio = valor_total / num_pessoas;
        
        if(rateio>= 30 ){
            System.out.println("Vamos dividir!!!");
        }
        
    }
    
    public double metodo_rateio2(){
        return valor_total/num_pessoas;
    
    
    
    
    }
        
        
    
    

    
}
