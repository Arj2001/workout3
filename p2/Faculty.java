package p2;

public class Faculty {
    
    int facNo;
    String subject;

    public Faculty(int fac, String sub){
        facNo = fac;
        subject = sub;
    }
    public void getFaculty(){
        System.out.println("In package 2");
        System.out.println("I am a Faculty my subject is "+ subject +" and faculty no is "+facNo);
    }
}
