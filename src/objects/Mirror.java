package objects;

public class Mirror
{
    private int size;
    private int position;

    public Mirror(int size, int position)
    {
        this.size = size;
        this.position = position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public int getPosition() {
        return position;
    }

    public int getSize() {
        return size;
    }
}
