import p1.Students;
import p1.Faculty;
class Demo {

    public static void main(String[] args) {
        Faculty p1f = new Faculty(12,"English");
        Students p1s = new Students(4,43);

        p2.Faculty p2f = new p2.Faculty(32,"Maths");
        p2.Students p2s = new p2.Students(78,67);

        p1f.getFaculty();
        p1s.getStudent();
        p2f.getFaculty();
        p2s.getStudent();
        
        
    }
    
}