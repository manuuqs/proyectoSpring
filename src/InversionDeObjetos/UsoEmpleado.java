package InversionDeObjetos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Empleados e1 = new DirectorEmpleado();
		//System.out.println(e1.getTareas());
	
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
	/*	Empleados Adrian = contexto.getBean("miEmpleado",Empleados.class);
		
		System.out.println(Adrian.getTareas());
		
		System.out.println(Adrian.getInforme());//inyeccion de dependencias constructor
	*/	
		JefeEmpleado MariaJefe = contexto.getBean("miEmpleado",JefeEmpleado.class);
		
		System.out.println(MariaJefe.getInforme() + "\n" + MariaJefe.getTareas());
		
		System.out.println(MariaJefe.getNombreEmpresa());
		
		System.out.println("Email del jefe: " + MariaJefe.getEmail());
		
		SecretarioEmpleado Juan = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		System.out.println("email secretario: " + Juan.getEmail() + "\n" + Juan.getNombreEmpresa() + "\n" + Juan.getInforme() + "\n" + Juan.getTareas());
		
		contexto.close();
		
	
	}

}
