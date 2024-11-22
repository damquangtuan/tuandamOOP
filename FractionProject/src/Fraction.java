
public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public Fraction add(Fraction g) {
		this.numerator += g.getNumerator();
		this.denominator += g.denominator;
		return this;
	}
	
	public Fraction(String fract){
		// Split the string using the '/' delimiter
        String[] parts = fract.split("/");

        // Parse the numerator and denominator as integers
        this.numerator = Integer.parseInt(parts[0]);
        this.denominator = Integer.parseInt(parts[1]);
	}
	
	public String toPrettyString() {
		return numerator + "/" + denominator;
	}
}
