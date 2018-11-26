package course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    /*A Utility function which evaluates the expression
		public static double eval(final Calculator cal) {
		String str=cal.getexpression();
	    return new Object() {
	        int pos = -1, ch;

	        void nextChar() {
	            ch = (++pos < str.length()) ? str.charAt(pos) : -1;
	        }

	        boolean eat(int charToEat) {
	            while (ch == ' ') nextChar();
	            if (ch == charToEat) {
	                nextChar();
	                return true;
	            }
	            return false;
	        }

	        double parse() {
	            nextChar();
	            double result = parseExpression();
	            if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
	            return result;
	        }

	        double parseExpression() {
	            double result = parseTerm();
	            for (;;) {
	                if      (eat('+')) x += parseTerm(); // addition
	                else if (eat('-')) x -= parseTerm(); // subtraction
	                else return x;
	            }
	        }

	        double parseTerm() {
	            double result = parseFactor();
	            for (;;) {
	                if      (eat('*')) result *= parseFactor(); // multiplication
	                else if (eat('/')) result /= parseFactor(); // division
	                else return result;
	            }
	        }

	        double parseFactor() {
	            if (eat('+')) return parseFactor(); // unary plus
	            if (eat('-')) return -parseFactor(); // unary minus

	            double result;
	            int startPos = this.pos;
	            if (eat('(')) { // parentheses
	                result = parseExpression();
	                eat(')');
	            } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
	                while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
	                result = Double.parseDouble(str.substring(startPos, this.pos));
	            } else if (ch >= 'a' && ch <= 'z') { // functions
	                while (ch >= 'a' && ch <= 'z') nextChar();
	                String func = str.substring(startPos, this.pos);
	                result = parseFactor();
	                if (func.equals("sqrt")) x = Math.sqrt(result);
	                else if (func.equals("sin")) x = Math.sin(Math.toRadians(result));
	                else if (func.equals("cos")) x = Math.cos(Math.toRadians(result));
	                else if (func.equals("tan")) x = Math.tan(Math.toRadians(result));
	                else throw new RuntimeException("Unknown function: " + func);
	            } else {
	                throw new RuntimeException("Unexpected: " + (char)ch);
	            }

	            if (eat('^')) result = Math.pow(x, parseFactor()); // exponentiation

	            return result;
	        }
	    }.parse();
	}
	
}
