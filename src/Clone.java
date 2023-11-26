public class Clone implements Cloneable{
    int x,y;
    int[] mas = new int[5];

    public Clone() {
        for (int i = 0; i < mas.length; i++) {
            mas[i]=i;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Clone clone = (Clone) super.clone();
        clone.mas = new int[mas.length];
        for (int i = 0; i < clone.mas.length; i++) {
            clone.mas[i]=mas[i];
        }
        return clone;
    }
}
