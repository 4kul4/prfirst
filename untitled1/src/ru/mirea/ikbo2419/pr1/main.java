package ru.mirea.ikbo2419.pr1;

public class main {
    public static void main(String[] args) {
        sobaka s=new sobaka("Nikola", 5);
        s.setAge(2);
        System.out.println(s);
        s.intoHumanAge();

        shar sh=new shar("Red",20);
        sh.setColor("Blue");
        System.out.println(sh);

        kniga k=new kniga("Zabolotski",1940, 4);
        k.setPage(22);
        System.out.println(k);

    }
}
