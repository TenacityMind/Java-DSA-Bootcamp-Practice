package solutions.first_java;

public class SimpleInterest {
   private double principal;
   private double interestRate;
   private double time;
   public SimpleInterest(double principal, double rate, double time) {
       this.principal = principal;
       this.interestRate = rate;
       this.time = time;
   }
   public double getPrincipal() {
       return principal;
   }
   public void setPrincipal(double principal) {
       this.principal = principal;
   }
   public double getInterestRate() {
       return interestRate;
   }
   public void setInterestRate(double interestRate) {
       this.interestRate = interestRate;
   }
   public double getTime() {
       return time;
   }
   public void setTime(double time) {
       this.time = time;
   }
   public double calculateSimpleInterest() {
       double simpleInterest = 0;
       simpleInterest = (principal * interestRate * time)/100 ;
       return simpleInterest;
   }

}
