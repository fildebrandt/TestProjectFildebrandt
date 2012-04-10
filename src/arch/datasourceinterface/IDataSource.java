package arch.datasourceinterface;

import java.util.ArrayList;

public interface IDataSource {
    public ArrayList<IDataItem> getData();

    public String getArea();
}
