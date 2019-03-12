package genericRiasad.genericJava;

import java.util.ArrayList;

public class People<N,A> {
	
	  private N n;
	  private A a;
     // private data [] =new ;
	
	
	public void add(N n, A a) {
		 this.n =n;
		 this.a =a;
	}
	
	
	
	
	public N getN() {
		return n;
	}




	public void setN(N n) {
		this.n = n;
	}




	public A getA() {
		return a;
	}




	public void setA(A a) {
		this.a = a;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//People <String ,Integer> list = new People <String ,Integer>();
		ArrayList <People> alist =new ArrayList<People>();
     People p1 =new People();
	
	
	p1.n ="Riasad";
	p1.a=20;
	
	 People p2 =new People();
		
		
		p2.n ="Refat";
		p2.a=40;
		
People p3=new People();
		
		
		p3.n ="Ana";
		p3.a=90;
		
		alist.add(p1);
		alist.add(p2);
		alist.add(p3);
		
		
		for(People i : alist) {
			
			System.out.println("Name :"+i.n+" "+"Age :"+i.a);
			
		}
		
	
		
	
		
		
		//list.add("Riasad", 20);
		
		//System.out.println("name :"+list.getN()+" "+"Age :"+list.getA());
	
		//list.add("Refat", 25);
		
		//String name = list.getN();
		//Integer age =list.getA();
		
		//System.out.println("name :"+list.getN()+" "+"Age :"+list.getA());
	}
}

