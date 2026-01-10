package ARRAYS;

import java.util.Objects;

public class LINEAR_STRING_search {
    public static int linearsearch(String[] food, String foodname){
        for ( int i = 0 ; i<food.length ; i++){
            if(Objects.equals(food[i], foodname)){ //food[i]==foodname
                return i ;
            }
        } return -1;
    }
    public static void main(String[] args) {
        String foodname = "daal";
        String food[] = {"dosa","idlii","protien","daal"};
int index =linearsearch( food, foodname);
if(index == -1 ) {System.out.println("not found element");}
        System.out.println("index is:"+ index);
    }
}
