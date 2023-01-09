package Method_Return_Object.Challenge_1;

public class Payrool {

    int normalHour;
    int extraHour;



    double calcPayment(Contract contract){
       int normalPayment = normalHour * contract.normalHourValue;
       int extraPayment = extraHour * contract.extraHourValue;
       int result = normalPayment + extraPayment;
       return result;
    }
}
