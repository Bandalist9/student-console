public class Slot<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() throws IllegalStateException{
        if (item == null){
            throw new IllegalStateException("오류: 빈 칸입니다.");
        }
        return item;
    }
}
