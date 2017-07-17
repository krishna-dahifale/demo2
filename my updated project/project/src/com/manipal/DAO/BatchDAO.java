package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Batch;



public interface BatchDAO {
	public Batch ShowBatch(int m) throws ClassNotFoundException,SQLException, IOException;
	
	public List<Batch> ViewBatch()throws ClassNotFoundException, SQLException, IOException;
	
	public int DeleteBatch(int id,String status);
	
	public int updateBatch(Batch tt);
	
	public int addBatch(Batch batch);
}
