package estructurasrepetitivas;

public class tarea26 {
    public static void main(String[] args){
        System.out.println("Este programa calcula el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado. ");
        System.out.println("Introduce el primer número, por favor: ");
        int numero = Integer.parseInt(System.console().readLine());
        System.out.println("Número introducido + n \t Cuadrado \t Cubo");
        for (int i =1 ; i <= 5; i++ ) {
          System.out.println("\t " + (numero + 1) + "\t\t  " + Math.pow((numero + 1),2) + "\t\t  " + Math.pow((numero + 1),3));
          numero++;
        } 
      }
}
