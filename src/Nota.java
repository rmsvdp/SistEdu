
public class Nota {

	Alumno alum;
	Asignatura asig;
	private int curso;
	private int eval;
	private int calif;
	
	
	
	public Nota(Alumno alum,Asignatura asig, int curso,
			int eval, int calif){
		
		
		this.alum = alum;
		this.asig = asig;
		this.curso = curso;
		this.eval = eval;
		this.calif = calif;
	}
	
	
	
	public Alumno getAlum() {
		return alum;
	}
	public void setAlum(Alumno alum) {
		this.alum = alum;
	}
	public Asignatura getAsig() {
		return asig;
	}
	public void setAsig(Asignatura asig) {
		this.asig = asig;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public int getEval() {
		return eval;
	}
	public void setEval(int eval) {
		this.eval = eval;
	}
	public int getCalif() {
		return calif;
	}
	public void setCalif(int calif) {
		this.calif = calif;
	}



}
