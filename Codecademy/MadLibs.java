public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: Charlotte
    Date: 9/4/2034
    */
        public static void main(String[] args){
        
        String name1 = "Charlotte"; 
        String name2 = "Amanda";
        String adjective1 = "Sticky!"; 
        String adjective2 = "heavy";
        String adjective3 = "creaky";
        String noun1 = "capsule";
        String noun2 = "cat";
        String noun3 = "cup";
        String noun4 = "book";
        String noun5 = "headphones";
        String noun6 = "shoe";
        String verb1 = "jumped";
        String place1 = "Istanbul";
        int number = 7324; 
  
        
        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
  
        System.out.println(story);
      }       
  }
  