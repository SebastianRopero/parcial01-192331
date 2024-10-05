import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese su lista de numeros");
        int [] numeros={2,4,6};

        for(int i=0;i<=numeros.length;i++);
        double promedio=(numeros[0]+numeros[1]+numeros[2])/3;

        System.out.println("Su promedio es de "+promedio);
    }
}
