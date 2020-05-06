package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        policeman Vasiliy = new policeman("Vasia","Черный","@vblack.com");
        policeman Jack = new policeman("Jack","Scott","@jackie.com");

        policeman pol1 = new policeman("pol", "first", "@pol1.com" );
        policeman pol2 = new policeman("pol", "second", "@pol2.com");
        policeman pol3 = new policeman("pol", "third", "@pol3.c0m");
        policeman pol4 = new policeman("pol", "four", "@pol4.com");
        policeman pol5 = new policeman("pol", "five", "@pol5.com");
        policeman pol6 = new policeman("pol", "six","@pol6.com");

        pol1.Back_to_дежурство();
        pol2.Back_to_дежурство();
        pol3.Back_to_дежурство();
        pol4.Back_to_дежурство();
        pol5.Back_to_дежурство();

        List<policeman> PartnerList = new ArrayList<>();
        Vasiliy.addPartner(pol2);
        pol1.addPartner(pol3);
        Vasiliy.ShowPartner();
        pol1.ShowPartner();
    }
}
