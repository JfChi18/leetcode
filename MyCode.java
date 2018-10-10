import java.io.*;

class MyCode {
  public static void main (String[] args) {
    System.out.println("Hello Java");
    //loop over , calculate delta 
    int[][] input = {{100,50},{200,24},{100, 300}, {200, 200}};
    helper[] temp = new helper[input.length];
    foreach(){}
    
    // sort by the abs delta
    Arrays.sort(temp, (o1,o2) => Math.abs(o1.delta) - Math.abs(o2.delta));
    

    //the count for current people in ny
    int count_ny = 0;
    int count_sf = 0;
    // calculate total cost
    int total = 0;
    while(count_sf < input.length/2 && count_ny < input.length/2){
      if(temp[count] > 0){
        total += temp[count].sf;
        count_sf ++;
      } else if(temp[count] <0){
        total += temp[count].ny;
        count_ny ++; 
      }
    }
    //check which count is less than length/2
    //the remaining should all be sent to there
    //calculate cost again
    
    return total
    
  }
  
  public class helper{
    int ny, sf, delta;
    int id;
    
    public helper(int ny, int sf, int id){
      this.id = id;
      this.ny = ny;
      this.sf = sf;
      this.delta = ny - sf;
    }
  }
}



delta : 40,  40, -20, 20
sf    : 80,  1000,  40, 10
ny    : 120, 1040,  20, 30  

sf 500, 200, 300, 1000
ny 1000,300, 200, 1500
 
500 + 200 , 1700 = 2400
2000
/* 
Your last Java code is saved below:
// package whatever; // don't place package name!


  
  
  
  
}

 */
