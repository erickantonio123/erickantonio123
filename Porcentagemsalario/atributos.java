package pais;

public class atributos {

	
	private Integer id;
	private  String name;
	private Double Salary;
	
	public  atributos(){
		}
	public atributos(Integer id, String name, Double Salary) {
		
		this.id = id;
		this.name = name;
		this.Salary = Salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	
	public void aumento(double porcentagem) {
		Salary += Salary * porcentagem/100.0;
	}
	public String toString() {
		return id + "Name " + name +  String.format("%.2f", Salary);
		
		
	}
}
