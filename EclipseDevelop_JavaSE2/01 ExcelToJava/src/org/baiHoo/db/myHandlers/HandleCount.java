package org.baiHoo.db.myHandlers;
import java.sql.ResultSet;
public class HandleCount implements HandleResultSet{
	
	public Integer handle(ResultSet resultSet) {
		try {
			int count = 0;
			if(resultSet.next()){
				count =resultSet.getInt(1);
			}
			return count;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
