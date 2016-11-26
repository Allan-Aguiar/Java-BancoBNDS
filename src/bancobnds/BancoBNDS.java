package bancobnds;

import java.util.Scanner;

public class BancoBNDS {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Instancia da conta criada
        Conta c = new Conta();
        Conta c2 = new Conta();
        
        //Colocando valores dentro das conta
        c.id = 1;
        c.dono = "Joao";
        c.saldo = 5000;
        c.limite = 6000;
        
        c2.id = 2;
        c2.dono = "Maria";
        c2.saldo = 1000;
        c2.limite = 2000;
        
        //Mostrando Conta 1
        System.out.println("ID:" + c.id);
        System.out.println("Nome:" + c.dono);
        System.out.println("Saldo:" + c.saldo);
        System.out.println("Limite:" + c.limite);
        
        //Mostrando Conta 2
        System.out.println("\nID:" + c2.id);
        System.out.println("Nome:" + c2.dono);
        System.out.println("Saldo:" + c2.saldo);
        System.out.println("Limite:" + c2.limite);
        
        //sacando valor da Conta 1
        c.saca(0);

        //depositando valor na Conta 2
        c2.deposita(0);

        //sacar utilizando o boolean
        c.saca2(0);
        
        //tranferencia de saldo da conta 1 para conta 2
        c.transfere(c, 3000);
        
         //Mostrando Conta 1
        System.out.println("ID:" + c.id);
        System.out.println("Nome:" + c.dono);
        System.out.println("Saldo:" + c.saldo);
        System.out.println("Limite:" + c.limite);
        
        //Mostrando Conta 2
        System.out.println("\nID:" + c2.id);
        System.out.println("Nome:" + c2.dono);
        System.out.println("Saldo:" + c2.saldo);
        System.out.println("Limite:" + c2.limite);
    }
}
