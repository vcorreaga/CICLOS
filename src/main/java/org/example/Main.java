import java.util.Scanner;

public class Main {
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double nota = 0, acumulado  = 0, cantidadNotas = 0;
//        System.out.print("Ingrese la cantidad de notas a promediar: ");
//        cantidadNotas = sc.nextDouble();
        System.out.println("Promedio de notas Logica programcion");

        /* Ciclo
        for(int i = 1; i <= cantidadNotas; i++){
            System.out.print("Ingrese la nota" + i + ": ");
            nota = sc.nextDouble();
            acumulado+=nota;

        }*/
        /*Ciclo while por defecto (cuando se sabe el numero de repeticiones)

        int i = 1;
        while (i <= cantidadNotas){
            System.out.print("Ingrese la nota " + i + ": ");
            nota = sc.nextDouble();
            acumulado += nota;
            i++;
        }

        /*Ciclo controlado por un centinela, bandera o interruptor (cuando no se sabe la cantidad de veces a repetir)*/

        int centinela = 1;
        int opcion = 0;
        int i = 1;
        while (centinela == 1){
            System.out.print("Ingrese la nota " + i + ": ");
            nota = sc.nextDouble();
            acumulado += nota;
            i++;
            System.out.println("Desea registrar otra nota? \n1 - Si\n0 - No ");
            opcion = sc.nextInt();
            if (opcion == 0){
                centinela = 0;

            }
        }
        System.out.print(i);
        System.out.print("El promedioo del estudiante es: " + (acumulado/(i-1)));
    }
}



/*acumulado = acumulado + nota;
acumulado+=nota;

for(int i = 1; i <= 5; i++){
            System.out.print("Ingrese la nota" + i + ": ");
            nota = sc.nextDouble();
            acumulado+=nota;

        }
        System.out.print("El promedioo del estudiante es: " + (acumulado/cantidadNotas));


        int centinela = 1;
        int opcion = 0;
        int i = 1;
        while (centinela == 1){
            System.out.print("Ingrese la nota " + i + ": ");
            nota = sc.nextDouble();
            acumulado += nota;
            i++;
            System.out.println("Desea registrar otra nota? \n1 - Si\n0 - No ");
            opcion = sc.nextInt();
            if (opcion == 0){
                centinela = 0;

            }
        }
        System.out.print(i);
        System.out.print("El promedioo del estudiante es: " + (acumulado/i));
*/