import com.google.gson.Gson;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee obj= new Employee();
		
		obj.setName("silambarasan");
		obj.setEmpid(100);
		obj.setMobile(8438971);
		obj.setSalary(50000);
		obj.setCity("chennai");
		
		Gson gson= new Gson();
		
		String empjson= gson.toJson(obj);
		System.out.println("json formata:"+empjson);
		
		System.out.println("============================");
		
		Employee emp1= gson.fromJson(empjson, Employee.class);
		System.out.println("name:"+emp1.getName()+"id:"+emp1.getEmpid()+"mobile:"+emp1.getMobile()+"salary:"+emp1.getSalary()+"city:"+emp1.getCity());
		
	}

}
