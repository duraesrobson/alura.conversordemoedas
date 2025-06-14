import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.invoke.VarHandle;

public class Principal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite oa opção: ");
        var escolha = scanner.nextLine();
        String moedaBase;
        String moedaAlvo;
        String valor;

        if (escolha.equalsIgnoreCase("1")) {
            moedaBase = "USD";
            moedaAlvo = "BRL";
        }
        
        System.out.print("Digite o valor que deseja converter: ");
        valor = scanner.nextLine();

        ConversorMoeda usd = new ConversorMoeda("USD","BRL", valor);
        // System.out.println(usd);

        // Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // System.out.println(gson.fromJson(usd, ConversorMoeda.class));

    }
}
