package operacoes_poo;

public class Operações {
	
	
	//Atributos.
	private int   num1;
	private float num2; 
	private float soma;
	private float  sub;
	private float  div;
	private float  mult;
	private int    fat;
	
	
	//Construtores.
	public Operações() {	
	}


	public Operações(int num1, float num2, float soma, float sub, float div, float mult, int fat) {
		this.num1 = num1;
		this.num2 = num2;
		this.soma = soma;
		this.sub = sub;
		this.div = div;
		this.mult = mult;
		this.fat = fat;
	}
	

	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public float getNum2() {
		return num2;
	}


	public void setNum2(float num2) {
		this.num2 = num2;
	}


	public float getSoma() {
		return soma;
	}


	public void setSoma(float soma) {
		this.soma = soma;
	}
	
	//Métodos de Classe.
	public void Somar() {
		
		 System.out.println("Soma = " + (this.getNum1()+this.getNum2()));
		
		 
	}
	
	public float getSub() {
		return sub;
	}


	public void setSub(float sub) {
		this.sub = sub;
	}
	
	
	//Métodos de Classe.
	public void Subtração() {
		
		 System.out.println("Subtração = " + (this.getNum1()-this.getNum2()));
	}
	
	
	public float getDiv() {
		return div;
	}


	public void setDiv(float div) {
		this.div = div;
	}
	
	//Métodos de Classe.
	public void Divisão() {
		
		 System.out.println("Divisão = " + (this.getNum1()/this.getNum2()));
	}
	
	
	public float getMult() {
		return mult;
	}


	public void setMult(float mult) {
		this.mult = mult;
	}
	
	//Métodos de Classe.
	public void Multiplicação() {
		
		 System.out.println("Multiplicação = " + (this.getNum1()*this.getNum2()));
	}
	
	
	public int getFat() {
		return fat;
	}


	public void setFat(int fat) {
		this.fat = fat;
	}
	
	//Métodos de Classe.
	public void Fatorial() {
		
		
		int fatorial = 1;
		
		for(int i = this.getNum1(); i >= 1; i--) {	
			fatorial *= i;	
		}
		
		num1 = fatorial;
		 System.out.println("Fatorial = " + this.getNum1());
	}
	

}
