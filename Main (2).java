import java.io.*;

public class posicion {

public static void main(String args[]) throws IOException {

BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

String array[];

int i;

String num;

array = new String[10];

for (i=1;i<=10;i++) {

System.out.println("Ingrese numero: "); 

num = bufEntrada. readLine(); 

array[i-1] = num;

}

for (i=2;i<=10;i+=2) {

System.out.println("Posicion: "+i+" es "+array[i-1]); 

}
}
}   