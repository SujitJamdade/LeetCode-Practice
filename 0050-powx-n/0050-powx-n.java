class Solution {
    /*
    public double myPow(double x, int n) {
        // Need to rewise 
        // if(n==0){
        //     return 1;
        // }
        // return x * myPow(x,n-1);
        
        if(n==0){
            return 1;
        }
        
        double halfNum = myPow(x,n/2) * myPow(x,n/2);
        
        if(n%2 != 0){
            halfNum = x * halfNum;
        }
        
        return halfNum;
    }
    */
    
    public double myPow(double x, int n) {
       if(n>=0){
           return calPower(x,n);
       }
        else{
            return 1/calPower(x,n);
        }
    }
    private double calPower(double x, int n){
        if(n==0) return 1;
        
        double res=calPower(x,n/2);
        if(n%2!=0){
            return res*res*x;
        }
      return res*res;  
    }
}