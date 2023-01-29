
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    
        //Write your code here
		Stack<Integer> st = new Stack<>();
		int n = asteroids.length;

		for(int i =0;i<n;i++){

			if(asteroids[i]>0){
				st.push(asteroids[i]);
			}
			else{

				while(st.size()>0 && st.peek() > 0 && st.peek() < -asteroids[i]){
					st.pop();
				}

				if(st.size() > 0 && st.peek() == -asteroids[i]){
					st.pop();
				}

				else if(st.size()==0 || st.peek()<0){
					st.push(asteroids[i]);
				}
			}
		}

		int sizee = st.size();
		int [] ans= new int[sizee];
		for(int i = sizee-1; i >=0;i--){
			ans[i]=st.pop();
		}
		return ans;
    }
}