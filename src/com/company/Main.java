package com.company;

import static com.company.Calculations.Call;

public class Main {

    public static void main(String[] args) {

        try {

            Call();

        }catch (Exception ex) {

            ex.toString();
            ex.printStackTrace();
            //System.out.println(ex);

        }

    }


}


