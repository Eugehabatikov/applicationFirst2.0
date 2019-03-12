package model;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * in this class i save model of my application
 */

public class Model
{
    private HashMap<Float,String> arrOfTaskWhizNoFine;
    private HashMap<Float,String> arrOfTaskWhizFine;

   void clear()
   {
      arrOfTaskWhizFine.clear();
      arrOfTaskWhizNoFine.clear();
   }

    public HashMap<Float, String> getArrOfTaskWhizFine() {
        return arrOfTaskWhizFine;
    }

    public void setArrOfTaskWhizFine(HashMap<Float, String> arrOfTaskWhizFine) {
        this.arrOfTaskWhizFine = arrOfTaskWhizFine;
    }

    public HashMap<Float, String> getArrOfTaskWhizNoFine() {
        return arrOfTaskWhizNoFine;
    }

    public void setArrOfTaskWhizNoFine(HashMap<Float, String> arrOfTaskWhizNoFine) {
        this.arrOfTaskWhizNoFine = arrOfTaskWhizNoFine;
    }
}
