class Basic{
    public static void main(String[] args){
        

        // create obj on this Student class
        // new Student is dynamicialy allocated and return referance
        //   Student sudip;  static type allocated in stack
        //so, initial it
         Student sudip = new Student();
                sudip.rno=10;
                sudip.name="sudip";
                
         // print
         System.out.println(sudip.rno);
         System.out.println(sudip.name);
    }

    //create a class student
   static class Student{
        int rno;
        String name;
        float cgpa;
    }

}