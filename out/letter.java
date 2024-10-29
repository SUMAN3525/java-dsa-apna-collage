package out;
//dout
public class letter {
    public static void touppercase(String str){
        StringBuilder sb = new StringBuilder("");
      char ch=Character.toUpperCase(str.charAt(0));
      sb.append(ch);
      for(int i=0; i<str.length(); i++){

      }
    }
    public static void main(String []args){
        String str = "hi, i am suman";
        touppercase(str);
    }
}
