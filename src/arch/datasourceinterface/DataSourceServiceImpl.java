package arch.datasourceinterface;

import java.util.ArrayList;

public class DataSourceServiceImpl implements IDataSourceService {
	private ArrayList<IDataSource> dataSourceList = new ArrayList<IDataSource>();
	
	@Override
	public void addDataSource(IDataSource dataSource) {
		if ( !dataSourceList.contains(dataSource) )
			dataSourceList.add(dataSource);
	}
	
	@Override
	public ArrayList<IDataSource> getDataSources() {
		return dataSourceList;
	}

	@Override
	public void removeDataSource(IDataSource dataSource) {
		if ( dataSourceList.contains(dataSource) )
			dataSourceList.remove(dataSource);
	}
}
