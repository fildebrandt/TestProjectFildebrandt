package arch.datasourceinterface;

import java.util.ArrayList;

public class DefaultDataItem implements IDataItem {

    private String company = "";
    private int revenue = 0;
    private String area = "";
    private ArrayList<String> values = new ArrayList<String>();

    public DefaultDataItem(String company, int revenue) {
        this.company = company;
        this.revenue = revenue;
    }
    
    public DefaultDataItem(IDataItem item) {
    	this.company = item.getCompany();
    	this.revenue = item.getRevenue();
    	this.area = item.getArea();
    	this.values = (ArrayList<String>)item.getValues().clone();
    }

    @Override
    public String getCompany() {
        return this.company;
    }

    @Override
    public int getRevenue() {
        return this.revenue;
    }

    @Override
    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

	@Override
	public ArrayList<String> getValues() {
		return values;
	}
    
	@Override
    public void addValue(String s) {
    	values.add(s);
    }
}
