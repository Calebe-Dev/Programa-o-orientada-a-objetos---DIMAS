/**
 *
 * @author cah
 */
public class Exemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int X;
        
        X=(int)(Math.random()*100);
        
        if (X < 50){
            System.out.print("O valor "+X+" é menor que 50 \n" );
        }
        else {
            System.out.print("O valor "+X+" é maior que 50 \n"  );
        }

    }
    
}
