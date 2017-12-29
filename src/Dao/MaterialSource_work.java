package Dao;

/**
 * Created by ttc on 17-12-27.
 */
public class MaterialSource_work
{
    private String MaterialName;
    private String MaterialLink;
    private String ImageLink;
    private String MaterialDate;
    private String MaterialSource;

    public MaterialSource_work()
    {
    }

    public MaterialSource_work(String materialName, String materialLink, String imageLink, String materialDate, String materialSource)
    {
        MaterialName = materialName;
        MaterialLink = materialLink;
        ImageLink = imageLink;
        MaterialDate = materialDate;
        MaterialSource = materialSource;
    }

    public String getMaterialName()
    {
        return MaterialName;
    }

    public void setMaterialName(String materialName)
    {
        MaterialName = materialName;
    }

    public String getMaterialLink()
    {
        return MaterialLink;
    }

    public void setMaterialLink(String materialLink)
    {
        MaterialLink = materialLink;
    }

    public String getImageLink()
    {
        return ImageLink;
    }

    public void setImageLink(String imageLink)
    {
        ImageLink = imageLink;
    }

    public String getMaterialDate()
    {
        return MaterialDate;
    }

    public void setMaterialDate(String materialDate)
    {
        MaterialDate = materialDate;
    }

    public String getMaterialSource()
    {
        return MaterialSource;
    }

    public void setMaterialSource(String materialSource)
    {
        MaterialSource = materialSource;
    }
}
