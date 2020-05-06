package com.company;
import java.util.ArrayList;
import java.util.List;


public class policeman {


    String Name;
    String LastName;
    String Login;
    boolean Active;
    static int num_Of_all_police = 0;
    static int num_of_active_police = 0;

        public policeman(String name, String lastName, String login) {
        this.Name = name;
        this.LastName = lastName;
        this.Login = login;
        this.Active = false;
        num_Of_all_police= num_Of_all_police +1;
    }
          public void Дежурство() {
          if (this.Active == true) {
            System.out.println(Name + "  дежурит ");
        } else {
            System.out.println(Name + " не дежурит");
        }
      }
         public void Relax() {
         Active = false;

         this.Active = Active;
         num_of_active_police = num_of_active_police -1;
       }


         public void Back_to_дежурство() {
         Active = true;
         this.Active = Active;
        num_of_active_police = num_of_active_police+1 ;
        }
    public void setLastName(String lastName) {
        this.LastName = lastName;
    }
        public List<policeman> PartnerList = new ArrayList();
        public void addPartner(policeman policeman) {
        this.PartnerList.add(policeman);
    }
        public void showPartner() {
        System.out.println(this.PartnerList);

    }
            public void ShowPartner() {
            for (int i = 0; i < PartnerList.size(); i++) {
            System.out.println("partner of " + Name+ "  :   " + ((PartnerList.get(i).toString()))+" ");
        }
    }
    @Override
    public String toString() {
        return  this.Name+ "   "+this.LastName ;
    }

    public static int getNum_of_active_police() {
        return num_of_active_police;
    }

}





