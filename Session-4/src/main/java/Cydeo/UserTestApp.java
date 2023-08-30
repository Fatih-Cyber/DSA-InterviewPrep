package Cydeo;

public class UserTestApp {
    public static void main(String[] args) {
        User user1=new User("FF","hf@gmail.com");
        System.out.println(user1.next);
        User user2=new User("qq","hq@gmail.com");
        User user3=new User("aa","hq@gmail.com");
        User user4=new User("cc","hc@gmail.com");
        user1.next=user2;
        user2.next=user3;
        user3.next=user4;

        User head=user1;
   addLast(head, new User("ww", "ww@w.com"));

    }
    static void addLast(User head, User newNode){
      User current=head;
      while(current.next!=null){
          current=current.next;
      }
        System.out.println(current.name);
      current.next=newNode;
      // print all
      current=head;
      while(current!=null) {
          System.out.println(current.name);
          current=current.next;
      }
    }



}
