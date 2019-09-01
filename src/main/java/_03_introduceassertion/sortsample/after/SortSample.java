package _03_introduceassertion.sortsample.after;


/**
 * int[]를 정렬하는 클래스
 */
public class SortSample {
    private final int[] _data;


    public SortSample(int[] data) {
        this._data = new int[data.length];
        System.arraycopy(data, 0, _data, 0, data.length);
    }


    public void sort() {
        for (int x = 0; x < _data.length - 1; x++) {
            int m = x;

            for (int y = x + 1; y < _data.length; y++) {
                if (_data[m] > _data[y]) {
                    m = y;
                }
            }

            /**
             * assert expr;             -> true 라면 아무 일도 일어나지 않고, false 면 AssertionError
             * assert expr: option;     -> false 일때만 AssertionError 발생 후 자세한 정보를 option 으로 표현
             */
            assert isMin(m, x, _data.length - 1) : this + ", x = " + x;
            int v = _data[m];
            _data[m] = _data[x];
            _data[x] = v;
            assert isSorted(0, x + 1) : this + ", x = " + x;
        }
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[ ");

        for (int i = 0; i < _data.length; i++) {
            buffer.append(_data[i]);
            buffer.append(", ");
        }

        buffer.append("]");
        return buffer.toString();
    }

    private boolean isMin(int pos, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (_data[pos] > _data[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isSorted(int start, int end) {
        for (int i = start; i < end; i++) {
            if (_data[i] > _data[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
