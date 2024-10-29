import java.util.Scanner;
import java.util.ArrayList;
    class TIT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Tecnocrates t=new Tecnocrates();
        t.collagename="tit-main";
        System.out.println(t.collagename);
        Student s=new Student();
        s.name="Suman Rowl";
        System.out.println(s.name);
        s.fees=80000;
        System.out.println(s.fees);
        ArrayList<Integer> list=new ArrayList<>();
        String b[]={"bag","tshirt","libary","blazer","pant","identitycard","t&p","lab manual"};
        int a[]={1440,800,200,1100,400,200,200,600};
        Managment m=new Managment();
        String issus[]={"Attendance","panalty","other activity"};
        int fine[]={1500,5000,800};
        String companyname[]={"TCS","Capgamini","Accenture","SAP"};
        int  studentplacement[]={200,225,120,5};
        m.miscellaneous(b,a);
        m.fine(issus, fine);
        Campus c=new Campus();
        c.company(companyname,studentplacement);
        }
        }
        class Tecnocrates{
    public String collagename;
    public String course;
    public int fees;
    public String infrastucture;
    public int TeacherSalary;
    void collagename(){ 
    System.out.println(collagename);
    }
    void course(){
    System.out.println(course);
    }
    void salary(){
    System.out.println(TeacherSalary);
    }
    }
    class Student extends Tecnocrates{
    //  public  int fees;
    public String id;
    public String name;
    public String Branch;
    void id(){
        System.out.println(id);
    }
    void fees(){
        System.out.println(fees);
    }
    void branch(){
    System.out.println(Branch);
    }
    void name(){
        System.out.println(name);
    }
    }
    class Teacher {
    public String Teachername;
    void Teacher(){
        System.out.println(Teachername);
    }
    }
        class Managment{
        public int fines;
        public int miscellaneous;
        void miscellaneous(String b[],int a[]){
        if(b.length==a.length){
            for(int i=0; i<b.length; i++){
            System.out.print(b[i]+": "+a[i]);
            System.out.println();
            miscellaneous +=a[i];
            }
            System.out.print("Total "+ miscellaneous);
        }
        System.out.println();
        }
        void fine(String issus[], int fine[]){
        if(issus.length==fine.length){
            for(int i=0; i<issus.length; i++){
                System.out.println(issus[i]+": "+fine[i]);
                fines+=fine[i];
            }
            System.out.println("Fines"+": "+fines);
        }
                }
            }
    class Campus {
    public int nostudentplacement;
    public int notplaced;
    public int totalcompany;
    public int totalstudent;
    void company(String companyname[], int studentplacement[]){
    for(int i=0; i<companyname.length; i++){
        System.out.print(companyname[i]+",");
    }
    System.out.println();
    System.out.print("Total no.company: "+companyname.length);
    System.out.println();
    for(int i=0; i<studentplacement.length; i++){
    System.out.println(companyname[i]+": "+studentplacement[i]);
    nostudentplacement+=studentplacement[i];
    }
    System.out.println("Total placed: "+(nostudentplacement/totalstudent)*100);
    System.out.println("total no of student not placed"+(notplaced-nostudentplacement)/totalstudent*100);
    }
    }
        class MBACampus extends Campus{
        void company(String companyname[], int studentplacement[]){
        for(int i=0; i<companyname.length; i++){
        System.out.print(companyname[i]);
        totalcompany=companyname.length;
        }
        System.out.println(companyname);
        System.out.println();
        for(int i=0; i<studentplacement.length; i++){
            System.out.println(companyname[i]+": "+studentplacement[i]);
        }
        System.out.println();
        }
        }
        class BtechCampus extends Campus{
            String CSEcompany[];
            String ITcompany[];
            String CSEAIMLcompany[];
            String CSEDScompany[];
            int CSEstudentplacement[];
            int ITstudentplacement[];
            int CSEAIMLstudentplacement[];
            int CSEDSstudentplacement[];
            int CSEplacement;
            int ITplacement;
            int CSEAIMLplacement;
            int CSEDSplacement;
            void CSE(){
            System.out.println("CSE placement:-");
            for(int i=0; i<CSEcompany.length; i++){  
            System.out.println(CSEcompany[i]+": "+CSEstudentplacement[i]);
            CSEplacement+=CSEstudentplacement[i];
            }
            System.out.println("CSE placement rate: "+(CSEplacement/nostudentplacement)*100);
            }
            void IT(){
            System.out.println("IT placement:-");
            for(int i=0; i<ITcompany.length; i++){
            System.out.println(ITcompany[i]+": "+ITstudentplacement[i]);
            ITplacement+=ITstudentplacement[i];
            }
            System.out.println("IT placement rate: "+(ITplacement/nostudentplacement)*100);
            }
            void CSEAIML(){
                System.out.println("CSE-(AIML) placement:-");
            for(int i=0; i<CSEAIMLstudentplacement.length; i++){
                System.out.println(CSEAIMLcompany[i]+": "+CSEAIMLstudentplacement[i]);
                CSEAIMLplacement+=CSEAIMLstudentplacement[i];
            }
            System.out.println("CSEDS placement rate"+(CSEAIMLplacement/nostudentplacement)*100);
            }
            void CSEDS(){
            System.out.println("CSE-(DS) placement:-");
            for(int i=0; i<CSEDSstudentplacement.length; i++){
            System.out.println(CSEDScompany[i]+": "+CSEDSstudentplacement[i]);
            CSEDSplacement+=CSEDSstudentplacement[i];
            }
            System.out.println(CSEDSplacement);
            }
            }
            class MPharmaCampus extends Campus{
            }
            class MtechCampus extends Campus{
            }
            class BpharmaCampus extends Campus{
            }
    class DpharmaCampus extends Campus{
    }
    class MCA extends Campus{
    }
    class Nursing extends Campus{
    }