package arch.datasourceinterface;

import java.util.ArrayList;

public interface IDataItem {
    public String getCompany();

    public int getRevenue();

    public String getArea();

    public void setArea(String area);
    
    public ArrayList<String> getValues();
    
    public void addValue(String s);
}
