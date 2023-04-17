import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int NumeroDiaria;
        double ValorPago = 0;

        System.out.println("Informe o tipo de apartamento (Simples/Duplo)");
        String Apto = input.nextLine().toUpperCase();

        System.out.println("Informe o numero de diárias");
        NumeroDiaria = input.nextInt();

        double total = NumeroDiaria * ValorPago;

        if(Apto.equals("Simples")){
            if(NumeroDiaria < 10){
                ValorPago = 100;
            }else if(NumeroDiaria >= 10 && NumeroDiaria <=15){
                ValorPago = 90;
            }else{
                ValorPago = 80;
            }
        }else if(Apto.equals("Duplo")){
            if(NumeroDiaria < 10){
                ValorPago = 140;
            }else if(NumeroDiaria >= 10 && NumeroDiaria <= 15){
                ValorPago = 120;
            }else{
                ValorPago = 100;
            }
        }
        System.out.println("O valor a ser pago é de : RS " + total);


    }

}