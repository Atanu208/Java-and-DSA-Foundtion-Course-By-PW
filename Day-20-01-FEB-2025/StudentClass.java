public class StudentClass {
    static class InnerStudentClass {
        String name;
        int rollNo;
        int registrationNo;
    }
    public static void main(String[] args) {
        InnerStudentClass obj=new InnerStudentClass();
        obj.name="Atanu";
        obj.rollNo=234;
        obj.registrationNo=657203112;
        System.out.println("Name: "+obj.name);
        System.out.println("Roll No: "+obj.rollNo);
        System.out.println("Registration Number: "+obj.registrationNo);

    }
}