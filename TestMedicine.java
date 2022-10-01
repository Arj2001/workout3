class Medicine{
    String companyName,companyAddress;

    Medicine(String companyName, String companyAddress) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    void getLabel(){

        System.out.println("Company name: "+ companyName);
        System.out.println("Company Address: "+companyAddress);
    }

}
class Tablet extends Medicine{

    String name;
    Tablet(String companyName, String companyAddress, String name) {
        super(companyName, companyAddress);
        this.name = name;
    }
    @Override
    void getLabel() {

        super.getLabel();
        System.out.println("Tablet name: "+name);
        System.out.println("Store in a cool dry place");
    }

}
class Syrup extends Medicine{

    String name;
    Syrup(String companyName, String companyAddress, String name) {
        super(companyName, companyAddress);
        this.name = name;
    }
    @Override
    void getLabel() {

        super.getLabel();
        System.out.println("Syrup name: "+name);
        System.out.println("Store in a cool dry place");
    }

}
class Onintment extends Medicine{

    String name;
    Onintment(String companyName, String companyAddress, String name) {
        super(companyName, companyAddress);
        this.name = name;
    }
    @Override
    void getLabel() {

        super.getLabel();
        System.out.println("Onintment name: "+name);
        System.out.println("Store in a cool dry place");
        System.out.println("External use only");
    }

}
public class TestMedicine {
    public static void main(String[] args) {
        int random;
        for (int i = 0;i<3; i++) {
            
            random = (int)((Math.random() * (3 - 1 + 1)) + 1) ;
            System.out.println(random);
            
            switch (random) {
                case 1:
                        Tablet t = new Tablet("Medo ltd","Delhi","Dollo");
                        t.getLabel();
                        continue;
                case 2:
                        Syrup sy = new Syrup("Ethnic ltd","Kolkata","Sneefree");
                        sy.getLabel();
                        continue;
                case 3:
                        Onintment onint = new Onintment("Skin Med ltd","Kochi","Pragrees");
                        onint.getLabel();
                        continue;
            }
        }
        
    }
}
