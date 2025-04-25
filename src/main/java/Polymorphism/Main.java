package Polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello India");

//        Declaring Parent type reference variable
        Teacher teacher;

//       R.H.S. creating child object and storing in L.H.S. parent type reference
//        variable. Also known as Loose coupling, means parent type
//        reference variable is referring to child type object.
         teacher= new PhysicsTeacher();
//      now here teacher is acting as Physics Teacher
         teacher.teach();
         teacher.markAttendance();
        System.out.println("==================================");

         teacher= new ChemistryTeacher();
//      now here teacher is acting as Chemistry Teacher
        teacher.teach();
        teacher.markAttendance();
        System.out.println("==================================");


        teacher = new BiologyTeacher();
//      now here teacher is acting as Biology Teacher
//      So, in different situation teacher is acting different hence
//      this is Polymorphism
        teacher.teach();
        teacher.markAttendance();


//        Output of the Program
/*        Hello India
          Physics Teacher teaches Newtons law
          Teacher is marking Attendance
          ==================================
          Chemistry Teacher nicely explaining Periodic table
          Teacher is marking Attendance
          ==================================
          Biology Teacher is explaining anatomy
          Teacher is marking Attendance
*/




    }
}
