package Teste;
import java.util.Scanner;

public class LacoRepeticaoWHILE {

    public static void main(String[] args) {
        
        int numeros,contPar=0,contImpar=0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("\nEntre com um número: ");
        numeros = ler.nextInt();
        
        while(numeros!= -99) {
            if(numeros % 2 == 0) {
                contPar++;
            }else {
                contImpar++;
            }
            System.out.println("\nEntre com um número: ");
            numeros = ler.nextInt();
        }
        System.out.println("\nNós temos: "+contPar+" números pares");
        System.out.println("\nNós temos: "+contImpar+" números ímpares");
    }

}
