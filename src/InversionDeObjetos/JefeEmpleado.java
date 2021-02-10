package InversionDeObjetos;

public class JefeEmpleado implements Empleados{
	
	private CreacionInformes informeNuevo;
	
    private String email;
	
	private String nombreEmpresa;
	
	public void metodoInit() {
		System.out.println("metodo que se ejecutara antes del bean");
	}
	
	public void metodoFinal() {
		
		System.out.println("metodo que se ejecutara al acabar el ciclo de vida del bin");
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

	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas(){
		// TODO Auto-generated method stub
		return "gestiono cuestiones de mis trabajadores";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe presentado por jefe: " + informeNuevo.getInforme();
	}

}
