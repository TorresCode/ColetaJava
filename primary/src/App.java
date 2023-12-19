public class App {
    public static void main(String[] args) throws Exception {
        //Operadores Airtmeticos (+,-, /, *, %, ++, --)
        //Operadores de Atribuição =, +=, -=, /=, %=, ^=, >>=, <<= 
        /*float numero = 13; 
        float numero1 = 2;
        float media = (numero + numero1) / 2;
        String result = "";
        //Operadores de Comparação >=, <=, <, >, ==, !=        
        //Operadores de Lógicos &&, ||, !

        if((media > 7) && (media <= 20)){
            result = "Aluno apto, com média de " + media + " valores.";
        }else if(media == 7) {
            result = "O aluno foi ao rescurso com média de " + media + " valores.";
        }else{
            result = "O Aluno está reprovado com média de " + media + " valores.";
        }
        System.out.println(result);*/

       
        //int i = 64;
        //String aChar = new Character((char)i).toString();
        System.out.println("Hello, World");
    }
}


/*
 * Convertendo ASCII para String
 * você pode converter códigos ASCII para String utilizando o método toString(), de acordo com o código abaixo
 * int i = 64;
String aChar = new Character((char)i).toString();


Convertendo números em decimal para binário
É possível fazer a conversão de números na base hexadecimal para binário através do método toBinaryString(), como pode ser visto a seguir:

int i = 42;
String binstr = Integer.toBinaryString(i);
 * 
 * 
 *




 Convertendo um valor booleano para integer
Faça a conversão de valores booleanos para inteiros utilizando o seguinte código:

i = (b)?1:0;







Convertendo um número decimal para hexadecimal
Você pode converter um número decimal para hexadecimal de três formas diferentes. Conheça essas formas no código a seguir:

int i = 42;
String hexstr = Integer.toString(i, 16);

//ou

String hexstr = Integer.toHexString(i);

//ou (with leading zeroes and uppercase)

public class Hex {
  public static void main(String args[]){
    int i = 42;
    System.out.print(Integer.toHexString( 0x10000 | i).substring(1).toUpperCase());
  }
}








Convertendo um Double para um String
Você pode converter um variável do tipo double para um String usando o método toString() da classe Double, como apresentado a seguir:

double i = 42.0;
String str = Double.toString(i);






Convertendo um float para um StringConversion from float to String
Da mesma forma que a conversão número 5, você utiliza o método toString() da classe Float.

float f = 12.0f;
String str = Float.toString(f);





Convertendo números em hexadecimal para integer
Para fazer a conversão de um número em hexadecimal para integer você pode utilizar duas formas. Observe o código a seguir:

int i = Integer.valueOf("B8DA3", 16).intValue();

//ou

int i = Integer.parseInt("B8DA3", 16);







Convertendo um integer para código ASCII
Veja como fazer a conversão de um integer para ASCII:

char c = 'A';
int i = (int) c; // Você terá o valor 65







Convertendo um número integer para boolean
Veja no código abaixo a conversão integer -> boolean:

b = (i != 0);








Convertendo de um integer para uma String
Veja no código abaixo duas formas de fazer a conversão de um integer para uma String:

int i = 42;
String str = Integer.toString(i);

//ou

String str = "" + i ;







Convertendo de um long para uma String
Você pode fazer a conversão de long para String através do método toString da classe Long.

long l = 42;
String str = Long.toString(l);








Convertendo de uma String para Double
Você pode converter um String para double utilizando o método valueOf() e doubleValue() da classe Double, como mostrado no trecho abaixo.

double d = Double.valueOf(str).doubleValue();





Convertendo String para integer
Faça a conversão de um String para integer usando o método parseInt() da classe Integer, ou usando os métodos valueOf() e intValue() da classe Integer combinados, como mostra o código a seguir.

str = "25";
int i = Integer.valueOf(str).intValue();

//ou

int i = Integer.parseInt(str);







*/