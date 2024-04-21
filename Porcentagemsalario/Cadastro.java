
package pais;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


Locale.setDefault(Locale.US);
Scanner sc = new Scanner (System.in);

List<atributos>list = new ArrayList<>();
	
System.out.println("Quantos empregados na empresa");
int n = sc.nextInt();	

for(int i=0; i<n; i++) {
	
	System.out.println("ID funcionario");
	Integer id = sc.nextInt();
	System.out.println(" Nome funcionario ");
	sc.nextLine();
	String name = sc.nextLine();
	System.out.println(" Salario funcionario");
	Double Salary = sc.nextDouble();
	
	atributos emp = new atributos(id,name,Salary);
	
	
	list.add(emp);
	
	
}

System.out.println("Entre com o número de ID do empregado");
int idsalary = sc.nextInt();


Integer pos =  posit(list,idsalary);



if (pos==null) {
	System.out.println("Este Id não existe");
}
else {
	System.out.println(" Entre com a porcetagem");
	double perc = sc.nextDouble();
	list.get(pos).aumento(perc);
}

System.out.println();
System.out.println("Empregados ");
for (atributos emp : list) {
	System.out.println(emp);
}
		
	}
	
	
	public static Integer posit(List<atributos>list, int idsalary) {
		
		for( int i =0; i<list.size();i++) {
			if (list.get(i).getId() == idsalary) {
				
				return i;
			}
			else {
				
			} return (Integer) null;
			
			
		}
		return idsalary;
		
		
	}
	
	
	
	
}
