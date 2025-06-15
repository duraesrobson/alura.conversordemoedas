import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        var escolha = "";
        
        Asterisco();
        System.out.println("       Seja bem vindo(a) ao Conversor de Moedas!");
        Asterisco();

        while (!escolha.equals("7")) {
        
            System.out.println("""

                            Digite a opção de conversão:

                            1) Real Brasileiro =>> Euro\r 
                            2) Euro =>> Real Brasileiro\r
                            3) Real Brasileiro =>> Dólar\r
                            4) Dólar =>> Real Brasileiro\r
                            5) Real Brasileiro =>> Peso Mexicano\r
                            6) Peso Mexicano =>> Real Brasileiro\r
                            7) Sair
                            """);

                            
            escolha = scanner.nextLine();
            System.out.println();
            String moedaBase = "";
            String moedaAlvo = "";
            String valor = "";

            switch (escolha) {
                case "1":
                    moedaBase = "BRL";
                    moedaAlvo = "EUR";
                    break;
                case "2":
                    moedaBase = "EUR";
                    moedaAlvo = "BRL";
                    break;
                case "3":
                    moedaBase = "BRL";
                    moedaAlvo = "USD";
                    break;
                case "4":
                    moedaBase = "USD";
                    moedaAlvo = "BRL";
                    break;
                case "5":
                    moedaBase = "BRL";
                    moedaAlvo = "MXN";
                    break;
                case "6":
                    moedaBase = "MXN";
                    moedaAlvo = "BRL";
                    break;
                case "7":
                    continue;
                default:
                    System.out.println("Digite uma opção válida!\n");
                    continue;
            }
            
            System.out.print("Digite o valor que deseja converter: ");
            valor = scanner.nextLine();
            System.out.println();

            ConversorMoeda conversor = new ConversorMoeda();
            Moeda resultado = conversor.ConversorMoeda(moedaBase, moedaAlvo, valor);
            
            Asterisco();
            System.out.print("O valor de " + valor + "(" + moedaBase + ")" + " corresponde ao valor final de " + resultado + "(" + moedaAlvo + ")" + "\n");
            Asterisco();
        }

        Asterisco();
        System.out.println("                Programa finalizado!");
        Asterisco();
    }

    public static void Asterisco(){
        System.out.print("***********************************************************\n");
    }
}
