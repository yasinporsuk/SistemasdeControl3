package practica3;

public class practica3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//el area del triangulo
		System.out.println("Introduce la altura del triangulo: ");
		int altura = entrada.nextInt();
		System.out.println("Introduce la base del triangulo : ");
		int base = entrada.nextInt();
		System.out.println("el area del triangulo es : "+calcularArea(base,altura));
    }
	public static double calcularArea(int base, int altura) {
		return base * altura / 2; }
	
}
