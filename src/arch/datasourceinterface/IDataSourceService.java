package arch.datasourceinterface;

import java.util.ArrayList;

public interface IDataSourceService {
	
	public void addDataSource(IDataSource dataSource);
	public void removeDataSource(IDataSource dataSource);
	public ArrayList<IDataSource> getDataSources();
}
