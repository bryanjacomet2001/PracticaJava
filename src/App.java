import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int n1 = 0, n2 = 0, suma = 0, resta = 0, mult = 0;
        App p = new App();
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese el primer numero: ");
        n1 = sc.nextInt();

        System.out.println("Ingrese el primer segundo numero: ");
        n2 = sc.nextInt();

        suma = p.Sumar(n1, n2);        
        System.out.println("El total de la suma es: "+suma);

    }
    
    public int Sumar(int n1, int n2){
        int res = 0;
        
        res = n1 + n2;
        
        return res;
    }

}