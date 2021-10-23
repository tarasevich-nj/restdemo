package com.tnj.restdemo;

public class Model
{
    private final long intone;
    private final long inttwo;
    private final long average;
    private final String content;

    public Model(long intone, long inttwo, long ave, String content)
    {
        this.intone = intone;
        this.inttwo = inttwo;
        this.average = (intone + inttwo) / 2;
        if ((intone==0) & (inttwo==0)) {this.content="Numbers are all null";}
            else {this.content="Average is " + this.average;}
    }

    public long getIntone()    { return intone;  }
    public long getInttwo()    { return inttwo;  }
    public long getAverage()   { return average; }
    public String getContent() { return content; }
}
