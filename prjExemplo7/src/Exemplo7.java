/**
 *
 * @author cah
 */
public class Exemplo7 {

    public static void main(String[] args) {
        
        int TabNum[] ={4,8,17,23,27,87};
        int Cont;
        
        for(Cont=0;Cont<TabNum.length;Cont++){
            System.out.print("Conteudo de TabNum["+ Cont +"] = ");
            System.out.println(TabNum[Cont]);
        }
        
        System.out.println("O vetor possue "+ TabNum.length + "Elementos" );
    }
    
}
