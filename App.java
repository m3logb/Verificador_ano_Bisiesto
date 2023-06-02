import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);

        String mes[] = {"J","F","M","A","M","J","JU","AG","S","O","N","D"};

        int fm[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Indique o ano que você esta!");
        int ano = sc.nextInt();
        
        
            if (ano % 4 == 0){
            fm[1] = 29;
            System.out.println("O ano é Bisiesto");
            }

            for (int i = 0;i<mes.length;i++){
            
            System.out.println("Mês de " + mes[i] + " ultimo dia do mês " + fm[i] );
        
    }
       
    }
}


