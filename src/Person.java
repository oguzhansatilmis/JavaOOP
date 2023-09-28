public class Person implements UserAuth {

    String personName;
    String personSurname;
    String personAge;



    public Person(String personName,String personSurname,String personAge) {
        this.personName = personName;
        this.personSurname = personSurname;
        this.personAge = personAge;

    }


    @Override
    public void userLogin() {
        System.out.println(personName + "login .");
    }

    public static void personInfo(String personName,String personSurname,String personAge){

        System.out.println("person info " + personName + " " + personSurname + " "+ personAge );

    }

    @Override
    public void userOut() {
        System.out.println(personName + "out .");
    }
}
