public class ClassRelOtherMult {


    public static void main(String[] args) {

     Student.sayHello(1);
     Student.sayHello(2,20);
     Student.whereDoYouStudy(2);
     MasterStudent.whatMedals(3);

}
}

class Human {


    static void sayHello(int lang, int age){

        switch(lang){
            case 2:
                System.out.print("Привет! Мне " + age + " лет.");
                break;
            case 3:
                System.out.print("Salut! J'ai " + age + " ans.");
                break;
            default:
                System.out.print("Hi! I'm " + age + " years old.");
        }

    }
}

class Student extends Human{
    static int age = 20;

    static void sayHello(){
        sayHello(1,age);
    }

    static void sayHello(int lang){
        sayHello(lang,age);
    }

    static void sayHello(int lang, int age){
        Human.sayHello(lang,age);

        switch(lang){
            case 2:
                System.out.println(" Я студент.");
                break;
            case 3:
                System.out.println(" je suis etudiant");
                break;
            default:
                System.out.println(" I'm a student.");
        }
    }

    static void whereDoYouStudy(){
        whereDoYouStudy(1);
    }

    static void whereDoYouStudy(int lang){

        switch(lang){
            case 2:
                System.out.println("Я учусь в ГОС-е!");
                break;
            case 3:
                System.out.println("Je etudie a USM");
                break;
            default:
                System.out.println("I am studying in USM");
        }
    }
}

class MasterStudent extends Student {

    static int age = 25;

    static void sayHello(){
        sayHello(1,age);
    }

    static void sayHello(int lang){
        sayHello(lang,age);
    }

    static void whatMedals(){
        whatMedals(1);
    }

    static void whatMedals(int lang){

        switch(lang){
            case 2:
                System.out.println("У меня золотая медаль!");
                break;
            case 3:
                System.out.println("J'avec une medaille dor!");
                break;
            default:
                System.out.println("I have a gold medal!");
        }
    }


}
