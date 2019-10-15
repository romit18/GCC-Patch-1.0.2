package skeleton.answers;

public class Question1 {

    public static double calculateTotalPayment(double initialLevelOfDebt, double interestPercentage, double repaymentPercentage) {
          public static double calculateTotalPayment(double initialLevelOfDebt, double interestPercentage, double repaymentPercentage) {
        double fixedRe=(repaymentPercentage*initialLevelOfDebt)/100;
        if(fixedRe<50){
	fixedRe=50;
          fixedRe=50;
        }
        double temp=initialLevelOfDebt;
        int count=0;
        while(temp>=50){
            temp=temp+(temp)*(interestPercentage/100);
            temp=temp-fixedRe;
            count++;
        }
        double final1=count*fixedRe+temp+fixedRe;
        return Math.round(final1);
}
    }

}
