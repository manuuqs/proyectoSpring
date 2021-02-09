package InversionDeObjetos;

public class SecretarioEmpleado implements Empleados {
	
	public CreacionInformes informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;
	
	//contrcutor
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getTareas() {
		// TODO Auto-generated method stub
		return "gestionar agenda jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe creado por el secretario: " +  informeNuevo.getInforme();
	}

}
