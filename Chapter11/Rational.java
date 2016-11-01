//
//	 Rational.java
//	 Chapter11
//
//	 Created	by	Apollo Zhu on 8/13/16.
//	 Copyright © 2015-2016 WWITDC. All rights	reserved.
//

public class Rational{
   public static void main(String args[]){
      Rational	temp1	= new	Rational();
      temp1.setNumerator(17);
      temp1.setDenominator(-12);
      temp1.printRational();
      Rational	temp2	= new	Rational(temp1.getDenominator(),15);
      temp2.negate();
      temp2.invert();
      System.out.println(temp2+" "+temp2.add(temp1)+" "+temp2.toDouble());
   }
   private int	numerator;
   private int	denominator;
   public void	setNumerator(int numerator){
      this.numerator	= numerator;
      this.correct();
   }
   public int getNumerator(){
      return this.numerator;
   }
   public void	setDenominator(int denominator){
      this.denominator = denominator;
      this.correct();
   }
   public int getDenominator(){
      return this.denominator;
   }
   public Rational(){
      this(0,1);
   }
   public Rational(Rational that){
      this(that.numerator,that.denominator);
   }
   public Rational(int numerator, int denominator){
      this.set(numerator,denominator);
   }
   public void	set(Rational that){
      this.set(that.numerator, that.denominator);
   }
   public void	set(int numerator, int denominator){
      this.numerator	= numerator;
      this.denominator = denominator;
      this.correct();
   }
   public void	printRational(){
      System.out.println(this.numerator+"/"+this.denominator);
   }
   public String toString(){
      return this.numerator+"/"+this.denominator;
   }
   public void	negate(){
      this.numerator	= -this.numerator;
   }
   public void	invert(){
      this.numerator+=this.denominator;
      this.denominator=this.numerator-this.denominator;
      this.numerator=this.numerator-this.denominator;
      this.correct();
   }
   public Double toDouble(){
      return (double)this.numerator	/ this.denominator;
   }
   public Rational reduce(){
      int gcd = gcd();
      return new Rational(this.numerator / gcd,	this.denominator / gcd);
   }
   public int gcd(){
      return gcd(this.numerator,	this.denominator);
   }
   private int	gcd(int m,int n){
      if	(m	% n == 0) {
         return n;
      } 
      else {
         return gcd(n,m	% n);
      }
   }
   public Rational add(Rational that){
      int newNumerator = this.numerator *	that.denominator + that.numerator *	this.denominator;
      int newDenominator =	this.denominator * that.denominator;
      Rational	result =	new Rational(newNumerator,	newDenominator).reduce();
      result.correct();
      this.set(result);
      return result;
   }
   private void correct(){
      if	(this.denominator	< 0){
         this.negate();
         this.denominator = -this.denominator;
      }
   }
}