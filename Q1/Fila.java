
public class Fila {

    private int quant;
    private int end;
    private int comec;
    private static String[] estructure;

    
    public void line(String value) {        

        if (isEmpty()) {
            comec++;
            end++;
            estructure[comec] = value;
            quant++;
        }
        else{
            if (!isFull()) { 
                end++;
                estructure[end] = value;
                quant++;
            }
            else{

            }
        }
    } 
    
    public Fila(){
        estructure = new String[100];
        quant = 0;
        comec = -1;
        end = -1;
    }

    public String dline() {
        String valorRetornar = "";
        if (isEmpty()) {
           
        }
        else{
          
        	valorRetornar = estructure[comec];            
                        
            if (comec == end) {
                comec = -1;
                end = -1;
                quant--;
            }
            else{
                comec++;
                Reorganizar();
            }
        }
        return valorRetornar;
    }

    public String front() {
        return estructure[end];
    }

    public boolean isEmpty() {
        return comec == -1;
    }

    public boolean isFull() {
        return end == estructure.length - 1;
    }

    public int size() {
        return quant;
    }

    private void Reorganizar() {
        for (int i = comec; i <= end; i++) {
            estructure[i-1] = estructure[i];
        }

        comec--;
        end--;
    }
    
    public void ExibirFila(){
        if (!isEmpty()) {
             for (int i = comec; i <= end; i++) {
                System.out.print(estructure[i] + " ");
            }
        }    
        System.out.println("");
    }  
}
