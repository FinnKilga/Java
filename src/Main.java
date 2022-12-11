import at.finn.oo.projects.Camera.Camera;
import at.finn.oo.projects.Camera.SDCard;

public class Main
{
    public static void main(String[] args)
    {
        SDCard card = new SDCard(16);
        Camera camera = new Camera(card,"black",250,1080, Camera.SETTINGS.big);
        camera.takePicture("p1");
        camera.takePicture("p2");
        camera.setSetting(Camera.SETTINGS.small);
        camera.takePicture("p3");
        camera.takePicture("p4");
        camera.takePicture("p5");
    }
}
