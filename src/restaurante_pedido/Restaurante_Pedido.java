
package restaurante_pedido;

import java.util.Scanner;

public class Restaurante_Pedido {

    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        Pedido p1 = new Pedido();
        
        System.out.println("Digite seu nome: ");
        p1.nome_cliente = scanner.next();
        System.out.println("Digite a quantidade de pessoas na mesa: ");
        p1.num_pessoas = scanner.nextInt();
        System.out.println("Digite o valor total do pedido: ");
        p1.valor_total = scanner.nextDouble();
        p1.metodo_rateio();
        
        
        
        Pedido p2 = new Pedido();
         System.out.println("Digite seu nome: ");
        p2.nome_cliente = scanner.next();
        System.out.println("Digite a quantidade de pessoas na mesa: ");
        p2.num_pessoas = scanner.nextInt();
        System.out.println("Digite o valor total do pedido: ");
        p2.valor_total = scanner.nextDouble();
        if(p2.metodo_rateio2()>=30){
            System.out.println("Vamos dividir!!!");
        }
          
        
        
        
        
        
        
    }
    
}
