import java.util.Scanner;

// Confeccionar un programa que pida por teclado tres notas de un alumno, calcule el
// promedio e imprima alguno de estos mensajes:
//Si el promedio es >=7 mostrar "Promocionado".
//Si el promedio es >=4 y <7 mostrar "Regular".
//Si el promedio es <4 mostrar "Reprobado".
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int nota1,nota2,nota3;
        int suma,promedio;
        System.out.print("Primera nota:");
        nota1=teclado.nextInt();
        System.out.print("Segunda nota:");
        nota2=teclado.nextInt();
        System.out.print("Tercera nota:");
        nota3=teclado.nextInt();
        suma=nota1+nota2+nota3;
        promedio=suma/3;
        System.out.println("La suma de las notas es "+suma+ ". Y el promedio es "+promedio);
        if(promedio >=7){
            System.out.println("PROMOCIONADO");
        }else{
            if(promedio>=4){
                System.out.println("REGULAR");
            }else{
                System.out.println("REPROBADO");
            }
        }
    }
}