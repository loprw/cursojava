package es.cursojava.inicio;

public class OperadoresAritmeticos {
	public static void main(String [] args) {
		
		int num = 5;
		System.out.println(num/2);
		System.out.println(num%2);//operador modulo, resto de división entera
		
		//Operador ++ y --, num = num + 1 / num = num - 1
		System.out.println(num++);//suma uno a la variable sobre el que se aplica después de usarla. Pinta 5
		System.out.println(num);//Pinta 6
		System.out.println(++num);//suma uno a la variable sobre el que se aplica antes de usarla. Pinta 7
		
		//Operador +=, -=, *= y /=; num = num + 3 / num = num - 3 / num = num * 3 / num = num / 3
		System.out.println(num += 3);
		System.out.println(num -= 3);
		System.out.println(num *= 3);
		System.out.println(num /= 3);
	}
}