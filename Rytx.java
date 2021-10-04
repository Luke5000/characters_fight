
import java.util.ArrayList;
import java.util.Scanner;

public class Rytx {
	 public static void main(String[] args) {

         System.out.println("Application has started \n");
         
       /*  System.out.println("afficher les détails d'un personnage en entrant son numéro - A");
	        System.out.println("supprimer un personnage de la liste - B");
	        System.out.println("faire combattre 2 personnages en entrant les 2 numéros correspondants - C");
	        System.out.println("Leave application - D");
	        System.out.println("Create a character by default - E");
	        System.out.println("Show all created characters since the beginning - F ");
	        System.out.println("Create a real character - G \n"); */
	        
         String str1 = "une chaine de caractère au hasard" ;

         ArrayList<Archetype> list1 = new ArrayList<Archetype>() ;

        for(;str1!="D";) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("What do you want to do ? : \n ");
            System.out.println("afficher les détails d'un personnage en entrant son numéro - A");
	        System.out.println("supprimer un personnage de la liste - B");
	        System.out.println("faire combattre 2 personnages en entrant les 2 numéros correspondants - C");
	        System.out.println("Leave application - D");
	        System.out.println("Create a character by default - E");
	        System.out.println("Show all created characters since the beginning - F ");
	        System.out.println("Create a real character - G \n");
            
             str1 = sc1.nextLine();


            if (!str1.equals("A") && !str1.equals("B") && !str1.equals("C") && !str1.equals("D") && !str1.equals("E") && !str1.equals("F") && !str1.equals("G")) {
                System.out.println("Command not available , reminder about commands : ");
                CommandsManagement.help();
            }

            if (str1.equals("A")) {
                System.out.println("Numéro du personnage dont vous voulez obtenir les informations ?");
                Scanner sc2 = new Scanner(System.in); // Le programme récupère...(1)
                int y1 = sc2.nextInt();          //...(1)le numéro du personnage dont l'utilisateur veut obtenir les informations , c'est l'utilisateur qui tape le numéro à l'écran                 
                Archetype v1 = list1.get(y1);   // En supposant bien évidemment au préalable qu'il y'a bien un personnage avec un tel numéro dans la liste des archetypes (créé depuis le début...) , on récupère l'archetype avec un tel numéro
                String str2 =  v1.toString();    // On affiche les informations...(2)
                System.out.println(str2);   //...(2) du personnage dont on veut obtenir les informations
            }



            if (str1.equals("E")) {
                Archetype x1 = new Archetype(); // On crée un personnage par défaut 
                CommandsManagement.addArchetypeToList(x1, list1); // On ajoute ce nouveau personnage crée dans la liste des archetypes

            }

            if (str1.equals("C")) {
                System.out.println("a fight between two characters is going to start ");
                System.out.println("Enter the number of the two fighters");
                System.out.println("Fighter 1 : ");
                Scanner sc3 = new Scanner(System.in);
                int numeroPremiercombattant = sc3.nextInt();
                System.out.println("Fighter 2 : ");
                Scanner sc4 = new Scanner(System.in);
                int numeroDeuxiemeCombattant = sc4.nextInt();
                CommandsManagement.Start_A_Fight(list1, numeroPremiercombattant, numeroDeuxiemeCombattant);
            }
            
            if(str1.equals("D")) {
                break ;  // Si on tape "D" on sort de la boucle...(3)
                 }
            

            if (str1.equals("F")) {
                CommandsManagement.showCreatedArchetypes(list1);
            }

            if (str1.equals("G")) {
                
                System.out.println("name of the character ?");
                Scanner sc5 = new Scanner(System.in);
                String nameOfTheCharacter = sc5.nextLine();


                System.out.println("damages given to opponent ?");
                Scanner sc6 = new Scanner(System.in);
                int damagesGivenToOpponent = sc6.nextInt();
                System.out.println("Life Points of this new character ? ");
                Scanner sc7 = new Scanner(System.in);
                int lifePoints = sc7.nextInt();
                System.out.println("level of initiative of this new character ?");
                Scanner sc8 = new Scanner(System.in);
                int initiative = sc8.nextInt();
                System.out.println("number of creation of this new character ?");
                Scanner sc9 = new Scanner(System.in);
                int numberOfCreation = sc9.nextInt();

                Archetype x2 = new Archetype(nameOfTheCharacter, damagesGivenToOpponent, lifePoints, initiative, numberOfCreation);
                CommandsManagement.addArchetypeToList(x2, list1);


            }


        }

         System.out.println("Application is over") ;
         CommandsManagement.leave();//...(3) et on quitte le programme


 }
	

}
