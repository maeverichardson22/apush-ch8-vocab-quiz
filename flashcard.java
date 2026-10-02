import java.util.Scanner;
import java.util.Random; 

public class flashcard {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in); 
      Random random = new Random(); 
      
       System.out.println("Welcome to the apush ch. 8 (second half) vocab quiz!"); 
       System.out.println("This quiz will show you a definition, and you will select type in the correct vocab term"); 
       System.out.println("You will be given the correct answer immediately, along with the a total score at the end. Best of luck!"); 
      
    // answers and definitions in arrays 
      String [] answers = {"Marbury v. Madison", "Louisiana Purchaese ",
      "Lewis and Clark Expedition", "Barbary Wars", 
      "Emargo act ", "War of 1812", "Fort McHenry", 
      "Battle of New Orleans", "Hartford Convention",
      "Techmseh", "Tenskwatawa"  }; 

      String [] definitions = {"Supreme Court case that established the principle of judicial review - unconstiutional",
      "President thomas jefferson's 1803 purchsse from France of th import of New orleans and 828,000 square miles west of the mississippi river to the rocky mountains. In theory, it more than doubled the territory of the united states at a cost of only 15 million, in reality though, it was still the land of many native nations", 
      "Led by the Meriwether Lewis and William Clark, a mission to the pacific coast comissioned for the purposes of scientidic and geographical exploration",
      "The first wars fought by the US,a nd the nation's first encounter with the Islamic world. The wars were dought from 1901 to 1805 against plundering pirated off the mediterranean coast of Africa affter president jeffersons refusal to pay them tribute to protext american ships", 
      "Attempt in 1807 to exert economic pressure by prohibiting all expots from the US instead of waging war in reaction to continued british impressment of american sailors; smugglers easily circumvented the embargo, and it was repealed two years later", 
      "War fought with britain, 1812, 1814, over issues that included impressment of american sailors, interference with shipping, and collusion with Northwest Territory Indians; settled by the Treaty of Ghent in 1814.",
      "Fort in baltimore harbor, unsuccessfully bombarded by the british in september 1814; francis scott key, a witness to the battle, was moved to write the words to the star-spangled banner",
      " Last of the War 1812, fought on January 8, 1815, weeks after the peace treaty was signed but prior to the news reaching america; General andrey Jackson led the victorious American troops.",
      "Meeting of New England federalists on December 15, 1814, to protest the war of 1812; proposed by seven constiutional ammendment(limiting embargoes and changing requirements for officeholding, declaration of war, and admission of new states), but the war ended before congress could respond.",
      "Shawnee dipplomatic and military leader who followed the teachings of his brotjer tenskwatawa and tried to unite all indians into a confederation to resist white encroachement on their lands; his beliefs and leadership made him seem dangerous to the American government. He allied with the British during the War of 1812, and was killed at the battle of the thames",
      "Shawnee religious prophet who called for complete native american seperation from whites and their goods and influence and resistance to the united states, brother of techmesh" 
       }; 

       // ints 
       int question = answers.length; 
       int score = 0; 
       
       //used gemini to figure out asked logic... 
       boolean [] asked = new boolean[question];
       // generater for loop statement
      for (int i = 0; i < question; i++) {
         int index; 
        
         do {
            index = random.nextInt(answers.length); 
            // checks to make sure that only unasked questions repreat
         } while (asked[index]); 
         // what it does while it cycles through the index 
         asked[index] = true;
         System.out.println("Question " + (i + 1) );
         System.out.println("Def: " + definitions[index]); 
         System.out.println("What is the correct vocab word? : " ); 
         String input = scan.nextLine();
         // ok but is it right 
         if (input.equalsIgnoreCase(answers[index])) {
            System.out.println("yas slay queen");
            score = score + 1; 
         } else { 
            System.out.println("WRONG! The correct answer is: " + answers[index]);
         }


      }
    
      // final score anf final statements 

      System.out.println("Your final score is: " + score + "out of" + question);
  

      scan.close();


    } 
}
