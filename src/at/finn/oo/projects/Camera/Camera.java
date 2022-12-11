package at.finn.oo.projects.Camera;

import java.util.Calendar;
import java.util.Date;

public class Camera
{
    private String color;
    private int weight;
    private int pixel;
    public enum SETTINGS{small,middle,big}
    private SETTINGS setting;
    private SDCard card;
    private Lens lens;
    public Camera(SDCard card,String color,int weight,int pixel,SETTINGS setting)
    {
        this.card = card;
        this.color = color;
        this.weight = weight;
        this.pixel = pixel;
        this.setting = setting;
    }
    public void setSetting(SETTINGS setting)
    {
        this.setting = setting;
    }
    public void changeCard(SDCard card)
    {
        this.card = card;
    }
    public void takePicture(String name)
        {
            Photo f = new Photo();
            Date date = Calendar.getInstance().getTime();
            f.setDate(date);
            f.setName(name);
            if (this.setting == SETTINGS.small)
            {
                f.setSize(2);
            }
            else if (this.setting == SETTINGS.middle)
            {
                f.setSize(4);
            }
            else
            {
                f.setSize(6);
            }
            this.card.saveImage(f);
        }

    public void setLens(Lens lens)
    {
        this.lens = lens;
    }
}
