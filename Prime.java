public class Prime {
	static void loop(int range) {
     for(int n=2;n<=range;n++) {
    	 int i;
    	 boolean b= false;
		for(i=2; i<= n/2;i++) {
           
         if(n % i == 0) {
                    b= true;
                    break;
                }
            }
           if(!b)
        	   System.out.println(n);
	}
}
            public static void main(String[] args) {
            loop(50);
        }
    }