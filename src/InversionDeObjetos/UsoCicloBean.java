package InversionDeObjetos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//obtencion del bean
		
		Empleados Juan = contexto.getBean("miEmpleado",Empleados.class);
		
		System.out.println(Juan.getInforme());
		
		contexto.close();

	}

}
