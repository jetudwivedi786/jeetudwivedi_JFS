
   public class StringOperation {


        public static void main(String[] args) {


            // String class

            String str = "Hello World";
            System.out.println(str.length());




            String str1 = "Hello,";
            String str2 = "How are you?";
            System.out.println(str1 + " " + str2);




            String str4 = "Java String pool refers to collection of Strings which are stored in heap memory";



            System.out.println(str4.toLowerCase());


            // b

            System.out.println(str4.toUpperCase());


            // c

            System.out.println(str4.replace('a','$'));


            //d

            System.out.println(str4.contains("collections"));


            // e

            String str5 = "java string pool refers to collection of strings which are stored in heap memory";
            System.out.println(str4 == str5);


            //f

            System.out.println(str4.equals(str5));




            // String Buffer



            StringBuffer s = new StringBuffer("String Buffer");
            s.append("is a peer class of string");
            s.append("that provide much of");
            s.append("the functionality of the string");
            System.out.println(s);



            StringBuffer s1 = new StringBuffer("It is used to at the specified index position");
            s1.insert(13," insert text");
            System.out.println(s1);



            StringBuffer s2 = new StringBuffer("This method returns the reversed object on which it was called");
            System.out.println(s2.reverse());




            // String Builder



            StringBuilder s20 = new StringBuilder("String Builder");
            s20.append("is a peer class of string");
            s20.append("that provide much of");
            s20.append("the functionality of the string");
            System.out.println(s20);




            StringBuilder s22 = new StringBuilder("It is used to at the specified index position");
            s22.insert(13," insert text");
            System.out.println(s22);



            StringBuilder s21 = new StringBuilder("This method returns the reversed object on which it was called");
            System.out.println(s21.reverse());


        }
    }