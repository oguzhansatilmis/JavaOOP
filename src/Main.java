public class Main  extends  Person{

    public Main(String personName, String personSurname, String personAge) {
        super(personName, personSurname, personAge);
    }

    public static void main(String[] args) {

        Main myMain= new Main("ali","veli","50");

        personInfo("ali","veli","50");

        myMain.userLogin();
        myMain.userOut();

        topla(10,20);
        topla(10,20,30);



    }
    public static Integer topla (int a,int b){

        return a+b;
    }

    public static Integer topla (int a,int b,int c){

        return a+b+c;
    }

}