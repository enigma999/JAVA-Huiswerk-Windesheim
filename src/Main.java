
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.naam = "Piet";
        s1.nummer = 5236;
        s2.naam = "Angelo";
        s2.nummer = 8569;
        KbsGroep groep1 = new KbsGroep();
        s1.setGroep(groep1);
        s2.setGroep(groep1);
    }
}