package Test_1;
public class UsingConstructor
{
     String name;
     String usn;
        public UsingConstructor(String name, String usn)
        {
            this.name = name;
            this.usn = usn;
        }
        public void printDetails() {
            System.out.println("Student Details:");
            System.out.println("Name: " + name);
            System.out.println("USN:  " + usn);
        }

    public static void main(String[] args) {
        UsingConstructor Student1 = new UsingConstructor("Spoorthi", "USN3421");
        UsingConstructor Student2 = new UsingConstructor("Nidhi", "USN1908");
        Student1.printDetails();
        Student2.printDetails();
    }
    }