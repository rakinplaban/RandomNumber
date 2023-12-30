public class Random {
    private double rand;
    
    public Random(double rand) {
    	this.rand = rand;
    }
    
    private long longconverter(double n) {
    	double amplify = n * 10000000000000.00;
    	
    	return (long) amplify;
    }

    private boolean isPrime(long n){
        int count = 0;
        for(long i=100000;i<=n;i+=2000){
            if (n%i==0 && i%2!=0)
                count++;
        }
        return (count == 2);
    }
    
    public long primeGenerator() {
    	long n = longconverter(rand);
    	while(!isPrime(n)) {
    		if(n%2==0)
    			continue;
    		else
    			n+=2;
    	}
    	return n;
    }
    
}
