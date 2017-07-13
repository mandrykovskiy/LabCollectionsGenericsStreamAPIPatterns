package com.epam.lab.lab_04_homework.classTwoStrings;
/*Create a class containing two String objects and make it Comparable so that the comparison only
cares about the first String. Fill an array and an ArrayList with objects of your class by using
a custom generator (eg, which generates pairs of Country-Capital). Demonstrate that sorting
works properly. Now make a Comparator that only cares about the second String and demonstrate
that sorting works properly. Also perform a binary search using your Comparator.
*/

public class TwoStrings implements Comparable<TwoStrings> {

    String country;
    String capital;

    public TwoStrings(String capital) {
        this.capital = capital;
    }

    public TwoStrings(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return "country='" + country + '\'' +
                ", capital='" + capital + '\''
                ;
    }

    @Override
    public int compareTo(TwoStrings o) {
//        if(this.country.compareTo(o.country)==0){
//            return 0;
//        }else if(this.country.compareTo(o.country)>0){
//            return 1;
//        }else{
//            return -1;
//        }
        return this.country.compareTo(o.country);
    }


}
