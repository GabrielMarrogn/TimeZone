import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int horaP = sc.nextInt(); // horario da partida
        int tempoV = sc.nextInt(); // tempo da viagem
        int timeZone = sc.nextInt(); // o fuso horario
        int sum = 0;
        sc.close();

        if(horaP == 0){
            horaP = 24;
        }
        
        sum = horaP + tempoV + timeZone;

        if(sum > 24){
            sum -= 24;
        }else if(sum == 24){
            sum = 0;
        }

        System.out.println(sum);
    }
}
