import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        //Variáveis
        double peso, altura,imc;
        //Objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat ("#0.00");
        System.out.println("Cálculo do IMC");
        //Entrada
        System.out.println("Digite seu Peso: ");
        peso = teclado.nextDouble();
        System.out.println("Digite sua Altura: ");
        altura = teclado.nextDouble();
        //Processamento
        imc = peso / (altura * altura);
        //Saida
        System.out.println("IMC: " + formatador.format(imc));
        teclado.close();
        //Classificação
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso Ideal");
        } else if (imc < 30) {
            System.out.println("Levemente acima do Peso");
        } else if (imc < 35) {
            System.out.println("Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade grau II (Severa)");
        } else {
            System.out.println("Obesidade grau III (Mórbida)");
        }
    }
 }
