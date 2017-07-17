package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Batch;


public interface BatchService {

	public List<Batch> viewBatch() throws ClassNotFoundException,SQLException,IOException;
	
	public Batch showBatch(int m) throws ClassNotFoundException,SQLException,IOException;
	
	public int deleteBatch(int id, String status);
	
	public int UpdateBatch(Batch tt);
	
	public int addBatch(int training_id , String batch_name,String status);
}
