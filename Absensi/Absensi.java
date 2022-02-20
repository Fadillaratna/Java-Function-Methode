
package Absensi;


public class Absensi {

    public static void main(String[] args) {
        int returnedLikes = 0;
        int totalLikes = returnedLikes;
        boolean like = true;
        likePhoto(returnedLikes,"nice photo!", like);
        likePhoto(totalLikes, "nice photo!", like);
      
    }
    public static int likePhoto(int returnedLikes, String comment, boolean like){
        int currentLikes = 0;
        System.out.println("Feedback: " + comment + " " + like);
        if(like){
           
           currentLikes += 1;
        } 
        
        System.out.println("Number of Likes: " + currentLikes + " " +like);
      return currentLikes;
    }


    
}
