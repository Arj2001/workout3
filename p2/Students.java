package p2;

public class Students {
    
    int semster;
    int rollNo;
    public Students(int sem,int roll){
        semster = sem;
        rollNo = roll;
    }
    public void getStudent(){
        System.out.println("In package 2");
        System.out.println("I am a student my semster is "+ semster +" and roll no is "+rollNo);
    }
}
