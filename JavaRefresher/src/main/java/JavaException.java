public class JavaException {
    public static void main(String args[]){
        try{
            //code that may raise exception
            int data=100/0;
        }catch(ArithmeticException e){System.out.println(e);}
        finally {
            System.out.println("Then we get to this");
        }
        //rest code of the program
        System.out.println("rest of the code...");
    }
}
