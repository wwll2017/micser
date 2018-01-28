package springcloud.bootp.model;

import java.io.Serializable;

public class ResVo implements Serializable
{

    /** */
    private static final long serialVersionUID = -5558170732384879148L;

    int id;
    String str;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getStr()
    {
        return str;
    }

    public void setStr(String str)
    {
        this.str = str;
    }

}
