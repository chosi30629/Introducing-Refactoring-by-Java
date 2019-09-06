package _13_replaceinheritancewithdelegation.example.before;


import java.util.Random;


public class Dice extends Random {

    public Dice() {
        super(314159L);
    }

    public Dice(long seed) {
        super(seed);
    }


    @Override
    public int nextInt() {
        // Random 에서 상속받은 매개변수 있는 nextInt
        return nextInt(6) + 1;
    }

    // throw new UnsupportedOperationException(); 를 통해 상속거부

    @Override
    public void nextBytes(byte[] bytes) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long nextLong() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean nextBoolean() {
        throw new UnsupportedOperationException();
    }

    @Override
    public float nextFloat() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double nextDouble() {
        throw new UnsupportedOperationException();
    }

    @Override
    public synchronized double nextGaussian() {
        throw new UnsupportedOperationException();
    }

}
