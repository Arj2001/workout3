class InvalidFeeException extends Exception{

    InvalidFeeException(){
        super();
    }

}
interface StduentFee{

    void getFees() throws InvalidFeeException;

}
class Student1 implements StduentFee {

    int fees;
    String name;


    Student1(int fees, String name) {
        this.fees = fees;
        this.name = name;
        try {
            if(fees<0)
            this.getFees();
            System.out.println("Success");
        } catch (InvalidFeeException e) {
            System.out.println("Entered negative value");
        }
    }

    @Override
    public void getFees() throws InvalidFeeException {
        
        if(fees<0)
        throw new InvalidFeeException();

    }
    
}
class School{

    public static void main(String[] args) {
        
        Student1 st = new Student1(-2,"Kannan");
        System.out.println("Continuning");
        
    }
}

