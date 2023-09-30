package com._8OOPs;

//CLASS NOT DEPENDENT, STATIC VARIABLE PRESENT AND WILL PRINT THE UPDATED VALUE BOTH THE TIMES
//class Test{
//    static String name;
//    public Test(String name){
//        Test.name = name;
//    }
//}
//
//public class _9Static {
//    public static void main(String[] args) {
//        Test a = new Test("Tanvi");  //IN THIS CASE, PALAK PALAK WILL BE PRINTED
//        Test b = new Test("Palak");
//
//        System.out.println(a.name);
//        System.out.println(b.name);
//    }
//}

public class _9Static {

    static class Test{   //CLASS IS STATIC, IT MEANS IT'S DEPENDENT ON CLASS NOT THE OBJECT SO NO ERRORS
        String name;
        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Tanvi"); // TANVI, PALAK WILL BE PRINTED, AND TEST AND MAIN CAN HAVE INSTANCES OF EACH OTHER THAT'S WHY UPDATION DOESN'T MATTER
        Test b = new Test("Palak");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
