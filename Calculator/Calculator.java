/*Calculator class to initialize all the values*/
public class Calculator {

	private String expression;
	private String result;
	public Calculator() {
		
	}
	public Calculator(String expression, String result) {
		super();
		this.expression = expression;
		this.result = result;
		
	}
	
	public String getexpression() {
		return expression;
	}
	public void setexpression(String expression) {
		this.expression = expression;
	}
	public String getresult() {
		return result;
	}
	public void setresult(String result) {
		this.result = result;
	}
	
	
	
}
