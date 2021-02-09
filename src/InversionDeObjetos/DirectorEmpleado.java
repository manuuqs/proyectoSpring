package InversionDeObjetos;

public class DirectorEmpleado implements Empleados {
	
	//creacion campo tipo creacionInforme
	private CreacionInformes informeNuevo;

	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo=informeNuevo;
		
	}
	
	
	public String getTareas() {
		// TODO Auto-generated method stub
		return "gestionar empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe creado por el director: " + informeNuevo.getInforme();
	}

}
