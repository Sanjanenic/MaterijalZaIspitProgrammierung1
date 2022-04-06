package RadSaSadrzajemStringa;

public class StringObrnuti {
    public static void main(String args[]) {

        //quick way to reverse String in Java - Use StringBuffer
        StringBuffer buffer= new StringBuffer("HelloWorld");
        buffer.reverse();
        System.out.println(buffer);

        StringBuilder str=new StringBuilder();
        str.append("HelloWorld");
        System.out.println(str.toString());

        //another quick to reverse String in Java - use StringBuilder
        System.out.println(reverse("HelloWorld"));
    }

//metoda koja vraca obrnuti string
    public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }

        return reverse;
    }
}
