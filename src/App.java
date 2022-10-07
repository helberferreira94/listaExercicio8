import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
        //Calcule e mostre o total do seu salário no referido mês.
        double salarioHora;
        double horasTrabalhadas;
        double salarioMes;
        //passo 1) digite seu salário por hora
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu salário por hora trabalhada");
        salarioHora = teclado.nextDouble();
        //passo 2) digite a quantidade de horas trabalhadas no mes
        System.out.println("digite a quantidade de horas trabalhadas no mes");
        horasTrabalhadas = teclado.nextDouble();
        teclado.close();
        salarioMes = salarioHora * horasTrabalhadas;

        System.out.println("Seu salário total no mês é " + salarioMes);
        





    }
}
