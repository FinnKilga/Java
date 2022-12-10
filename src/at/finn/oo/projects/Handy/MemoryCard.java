package at.finn.oo.projects.Handy;

import java.util.ArrayList;

public class MemoryCard
{
    private int StorageSpace;
    private ArrayList<PhotoFile> fileList = new ArrayList<PhotoFile>();

    public MemoryCard(int StorageSpace)
    {
        this.StorageSpace = StorageSpace;
    }
    public void saveFiles(PhotoFile f)
    {
        if (this.StorageSpace - f.getFileSize() < 0)
        {
            System.out.println("Storage has not enough space");
        }
        else
        {
            this.StorageSpace = this.StorageSpace - f.getFileSize();
            this.fileList.add(f);
        }
    }
    public void getFreeSpace()
    {
        System.out.println("You have " + this.StorageSpace + "mb left on your memory Card");
    }
    public void listFiles()
    {
        for (PhotoFile f:fileList)
        {
            f.getInfo();
        }
    }
}
