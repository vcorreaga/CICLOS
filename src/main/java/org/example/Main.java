import java.util.Scanner;

public class Main {
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double nota = 0, acumulado  = 0, cantidadNotas = 0;
        System.out.print("Ingrese la cantidad de notas a promediar: ");
        cantidadNotas = sc.nextDouble();
        System.out.println("Promedio de notas Logica programcion");

        /*for(int i = 1; i <= cantidadNotas; i++){
            System.out.print("Ingrese la nota" + i + ": ");
            nota = sc.nextDouble();
            acumulado+=nota;

        }*/

        System.out.print("El promedioo del estudiante es: " + (acumulado/cantidadNotas));
    }
}



/*acumulado = acumulado + nota;
acumulado+=nota;

for(int i = 1; i <= 5; i++){
            System.out.print("Ingrese la nota" + i + ": ");
            nota = sc.nextDouble();
            acumulado+=nota;

        }
*/