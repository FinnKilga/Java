package at.finn.oo.projects.Handy;

public class Camera
{
    public enum RESOLUTION{high,medium,low};
    private RESOLUTION resolution;
    public Camera(RESOLUTION resolution)
    {
        this.resolution = resolution;
    }
    public PhotoFile takePicture()
    {
        PhotoFile f = new PhotoFile(PhotoFile.DATATYPE.png,"photo",0);
        if(this.resolution == RESOLUTION.high)
        {
            f.setFileSize(150);
        } else if (this.resolution == RESOLUTION.medium)
        {
         f.setFileSize(100);
        }
        else
        {
            f.setFileSize(50);
        }
        return f;
    }
}
