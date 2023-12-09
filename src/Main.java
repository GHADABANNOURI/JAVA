import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*SocieteArrayList S = new SocieteArrayList();
        Employee e1 = new Employee(1, "ghada", "bannouri", "J24", 16);
        Employee e2 = new Employee(2, "aya", "bannouri", "G40", 13);
        Employee e3 = new Employee(3, "abdelghani", "bannouri", "A23", 15);
        Employee e4 = new Employee(4, "khalil", "bannouri", "A23", 18);

        S.ajouterEmploye(e4); 
        S.ajouterEmploye(e2);
        S.ajouterEmploye(e1);
        S.ajouterEmploye(e3);
        System.out.println(S.rechercherEmploye(e1)); 
        S.displayEmploye(); 
        System.out.println("\n"); 
        S.supprimerEmploye(e1); 
        S.displayEmploye();
        System.out.println(S.rechercherEmploye("banour")); 
        System.out.println("\n"); 
        S.trierEmployeParId(); //Tri ID works
        S.displayEmploye();
        System.out.println("\n"); 
        S.trierEmployeParNomDepartementEtGrade(); 
        S.displayEmploye();*/

        /* ---------------------------------------- Prosit 10 ------------------------------------------------------ */

        DepartementHashSet D = new DepartementHashSet();

        D.ajouterDepartement(new Departement(3, "J24", 15)); 
        D.ajouterDepartement(new Departement(2, "J23", 15));
        D.ajouterDepartement(new Departement(1, "J22", 15));
        D.displayDepartement(); 
        System.out.println(D.rechercherDepartement("J24"));
        System.out.println(D.trierDepartementById()); 
    }
}