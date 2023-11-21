import java.util.Scanner;

import entities.Product;

public class Programa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Insira os dados do produto");
        System.out.print("Nome: "); 
        product.name = input.nextLine();
        System.out.print("Preço: "); 
        product.price = input.nextDouble();
        System.out.print("Quantidade: "); 
        product.quantity = input.nextInt();
        

        System.out.println(product.name + ", " + product.price + ", " + product.quantity + ", Total: " + product.TotalValueInStock());


        input.close();
    }
}
