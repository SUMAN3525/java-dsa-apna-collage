public class prifix {
    public static void main(String args[]){
        String str[]={"flower","flow","flight"};
       for(int i=0; i<str.length; i++){
        for(int j=i+1; j<str.length; j++){
            if(str[i].charAt(i)==str[j].charAt(i)){
                System.out.println(str[i].charAt(i));
            }
            else{
                System.out.println("no");
            }
        }
       }
    }
}
