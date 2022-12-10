package at.finn.oo.projects.Handy;

public class Phone
{
    private SimCard simcard;
    private MemoryCard memoryCard;
    private Camera camera;
    public String color;
    public Phone(SimCard simcard,MemoryCard memoryCard,Camera camera,String color)
    {
        this.memoryCard = memoryCard;
        this.simcard = simcard;
        this.camera = camera;
        this.color = color;
    }
    public void makePhoto(String name, PhotoFile.DATATYPE datatype)
    {
        PhotoFile f;
        f = this.camera.takePicture();
        f.setName(name);
        f.setDataType(datatype);
        this.memoryCard.saveFiles(f);
    }
    public void printFiles()
    {
       this.memoryCard.listFiles();
    }
    public void makeCall(String number)
    {
        this.simcard.doCall(number);
    }
    public void getFreeSpace()
    {
        memoryCard.getFreeSpace();
    }
}
