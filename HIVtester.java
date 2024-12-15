public class HIVtester{
private String name;
private int age;
private String symptom;
private double temp;
private double minimumtemp;
private boolean sick;

public HIVtester(String n, int a, String s, double t){
    name = n;
    age = a;
    symptom = s;
    temp = t;
    minimumtemp = 100.4
    sick = False



}

public void changesymptom(String s){
    symptom = s
}
public String toString(){
if(temp >= minimumtemp && symptom.toLowerCase() == "cough"){
System.out.println(name + "is" + age + "years old and due to the symptoms" + symptom + temp + "and most likely has HIV");
}
}
}