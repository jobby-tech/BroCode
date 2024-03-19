package OOPS;

public class Friend {

    String name;
    static  int numberOfFriends;
    Friend(String name){
        this.name=name;
        numberOfFriends++;
    }

    static void totalNumberOfFriends(){
        System.out.println("You have "+numberOfFriends+" of Friends");
    }
}
