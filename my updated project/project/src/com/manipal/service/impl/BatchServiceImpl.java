package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.DAO.BatchDAO;
import com.manipal.DAO.jdbc.JdbcBatchDAOImpl;
import com.manipal.model.Batch;
import com.manipal.service.BatchService;

public class BatchServiceImpl implements BatchService{
	private BatchDAO bd;
	
	public BatchServiceImpl() {
		bd=new JdbcBatchDAOImpl();
	}

	@Override
	public List<Batch> viewBatch() throws ClassNotFoundException, SQLException,
			IOException {
		// TODO Auto-generated method stub
		return bd.ViewBatch();
	}

	@Override
	public Batch showBatch(int m) throws ClassNotFoundException, SQLException,
			IOException {
		// TODO Auto-generated method stub
		return bd.ShowBatch(m);
	}

	@Override
	public int deleteBatch(int id, String status) {
		// TODO Auto-generated method stub
		return bd.DeleteBatch(id, status);
	}

	@Override
	public int UpdateBatch(Batch tt) {
		// TODO Auto-generated method stub
		return bd.updateBatch(tt);
	}

	@Override
	public int addBatch(int training_id, String batch_name, 
			String status) {
		// TODO Auto-generated method stub
		Batch batch = new Batch(training_id, batch_name,status) ;
		
		/*batch.setTraining_id(training_id);
		batch.setBatch_name(batch_name);
		batch.setNo_of_trainee(no_of_trainee);
		batch.setStatus(status);*/
		
		
		return bd.addBatch(batch);
	}

}
