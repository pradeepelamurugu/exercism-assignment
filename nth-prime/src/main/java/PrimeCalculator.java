class PrimeCalculator {

    int nth(int nth) {
        if (nth == 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (isPrime(i)) {
                nth--;
                System.out.println(nth+"-"+i);
                if (nth == 0) {
                    return i;
                }
            }
        }
        return 0;
    }

    private boolean isPrime(int i) {
        for (int j = 2; j <= i/2; j++) {
            if(i % j == 0) {
                return false;
            }
        }
        return true;
    }

}
