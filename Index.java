public class Index {
    public static void main(String []args){
        String haystack ="sadbutsad";
        String  needle = "sad";
        int n=0;
        for(int i=0; i<needle.length(); i++){
            if(needle.charAt(i)==haystack.charAt(i)){
                n++;
                n=0;
                System.out.print(needle.charAt(i));
            }
        }
    }
}

