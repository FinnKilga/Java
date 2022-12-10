package at.finn.oo.projects.Handy;

public class PhotoFile
{
    public enum DATATYPE{jpg,png,mp4}
    private String name;
    private int fileSize;
    private DATATYPE dataType;
    public PhotoFile(DATATYPE dataType,String name,int fileSize)
    {
        this.dataType = dataType;
        this.name = name;
        this.fileSize = fileSize;
    }
    public void getInfo()
    {
        System.out.println("name: " + this.name + "size: " + this.fileSize + "mb data type: " + this.dataType);
    }

    public int getFileSize()
    {
        return fileSize;
    }

    public void setFileSize(int fileSize)
    {
        this.fileSize = fileSize;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDataType(DATATYPE dataType)
    {
        this.dataType = dataType;
    }
}
