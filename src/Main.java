import at.finn.oo.projects.Handy.*;

public class Main
{
    public static void main(String[] args)
    {
        PhotoFile file_one = new PhotoFile(PhotoFile.DATATYPE.jpg,"file_one",50);
        PhotoFile file_two = new PhotoFile(PhotoFile.DATATYPE.mp4,"file_two",50);
        Camera c1 = new Camera(Camera.RESOLUTION.high);
        SimCard s1 = new SimCard("1234","06763651617");
        MemoryCard m1 = new MemoryCard(1000);
        Phone p1 = new Phone(s1,m1,c1,"black");
        p1.makePhoto("photo one", PhotoFile.DATATYPE.jpg);
        p1.printFiles();
        p1.makeCall("06642221093");
        p1.getFreeSpace();
    }
}
