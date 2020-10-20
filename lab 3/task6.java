class Solution {
    public boolean isHappy(int n) {
        if (n == 1)
			return true;
		int a, m = n;
		int happy = 0;
		while (m > 0) { 
			a = m % 10;  
			happy += a * a;  
			m = m / 10; 
		}
		if (happy == 1)
			return true; 
		if (happy == 4) 
			return false; 
		return isHappy(happy);
    }
}
