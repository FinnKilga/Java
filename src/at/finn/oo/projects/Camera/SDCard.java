package at.finn.oo.projects.Camera;

import at.finn.oo.projects.Handy.MemoryCard;

import java.util.ArrayList;

public class SDCard
{
    ArrayList<Photo> Photos = new ArrayList<Photo>();
    private int StorageSpace;
    public SDCard(int StorageSpace)
    {
        this.StorageSpace = StorageSpace;
    }
    public void saveImage(Photo f)
    {
        if (this.StorageSpace - f.getSize() >= 0)
        {
            this.StorageSpace -= f.getSize();
            this.Photos.add(f);
        }
        else
        {
            System.out.println("Not enough storage space left");
        }
    }
}
