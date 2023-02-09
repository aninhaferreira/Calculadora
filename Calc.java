import javax.swing.JOptionPane;

    public class Calc{
public static void main(String[] args){

String firstNumber = JOptionPane.showInputDialog("Digite o primeiro número"); 
String secondNumber = JOptionPane.showInputDialog("Digite o segundo número" );


int number1 = Integer.parseInt(firstNumber);
int number2 = Integer.parseInt(secondNumber);

String opera = JOptionPane.showInputDialog("Digite o número para a operação deseja: 1)Soma, 2)subtração, 3)Divisão, 4)multiplicação " );
int op1 = Integer.parseInt(opera);

if(op1 == 1 ){
int sum = number1 + number2;
JOptionPane.showMessageDialog( null, "A soma de: " + sum, "Resposta", JOptionPane.PLAIN_MESSAGE );
   }

if(op1 == 2){
    int sub = number1 - number2;
    JOptionPane.showMessageDialog( null, "A subtração de: " + sub, "Resposta", JOptionPane.PLAIN_MESSAGE );
}

if(op1 == 3){
    int sub = number1/number2;
    JOptionPane.showMessageDialog( null, "A divisão de: " + sub, "Resposta", JOptionPane.PLAIN_MESSAGE );
}

if(op1 == 4){
    int sub = number1*number2;
    JOptionPane.showMessageDialog( null, "A multiplicação de: " + sub, "Resposta", JOptionPane.PLAIN_MESSAGE );
}
}
       }
