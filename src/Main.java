public class Main {
    public static void main(String[] args) {

        // Chapter 1
        System.out.println("Hello world!");
        Integer [] int_array = {1,2,3,4,5};
        String [] str_array = {"My","name","is","serhat"};
        Student [] stdnt_array = {new Student("Serhat","Erdem"),new Student("Ali","Yaman")};
        write(int_array);
        System.out.println("........");
        write(str_array);
        System.out.println("........");
        write(stdnt_array);

    }

    /**
     * Generics methods are methods which is independent of data type
     * @param e
     * @param <E>
     */
    //a generic method (Chapter 1)
    public static <E> void write (E e[] ){
        for(E array:e){
            System.out.println(array);
        }

    }
}