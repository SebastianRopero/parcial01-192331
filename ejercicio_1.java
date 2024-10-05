import java.util.Scanner;

public class ejercicio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el poligono al cual desea encontrarle el area");
        System.out.println("-----------------------------------------------------");
        System.out.println("1: Triangulo");
        System.out.println("2: Cuadrado");
        System.out.println("3: Rectangulo");
        System.out.println("-----------------------------------------------------");

        int figura = scanner.nextInt();

        if (figura == 1) {
            System.out.println("Ingrese la medida de la base de su triangulo");
            double baseTriangulo = scanner.nextDouble();
            System.out.println("Ingrese la medida de la altura de su triangulo");
            double alturaTriangulo = scanner.nextDouble();

            double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
            System.out.println("El area de su triangulo es de " + areaTriangulo);
        } else if (figura == 2) {
            System.out.println("Ingrese la medida del lado de su cuadrado");
            double ladoCuadrado = scanner.nextDouble();

            double areaCuadrado = (ladoCuadrado * ladoCuadrado);
            System.out.println("El area de su cuadrado es de " + areaCuadrado);
        } else if (figura == 3) {
            System.out.println("Ingrese la medida de la base de su Rectangulo");
            double baseRectangulo = scanner.nextDouble();
            System.out.println("Ingrese la medida de la altura de su Rectangulo");
            double alturaRectangulo = scanner.nextDouble();

            double areaRectangulo = (baseRectangulo * alturaRectangulo);
            System.out.println("El area de su rectangulo es de " + areaRectangulo);
        }
    }
}