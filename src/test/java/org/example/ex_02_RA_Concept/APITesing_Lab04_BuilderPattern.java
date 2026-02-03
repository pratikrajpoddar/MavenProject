package org.example.ex_02_RA_Concept;

public class APITesing_Lab04_BuilderPattern {
    public APITesing_Lab04_BuilderPattern step1(){
        System.out.println("step 1");
        return this;
    }
    public APITesing_Lab04_BuilderPattern step2(){
        System.out.println("step 2");
        return this;
    }

    public APITesing_Lab04_BuilderPattern step3(String param1) {
        System.out.println("step 3");
        return this;
    }

    public static void main(String[] args) {
        APITesing_Lab04_BuilderPattern bp = new APITesing_Lab04_BuilderPattern();
        bp.step1().step2().step3("Pratik");
    }



    }


