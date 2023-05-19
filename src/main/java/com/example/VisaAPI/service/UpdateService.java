package com.example.VisaAPI.service;

import java.util.List;

import com.example.VisaAPI.model.UpdateModel;

public interface UpdateService {

	public List<UpdateModel> selectuser(UpdateModel updateModel);
    public int updateuser(UpdateModel updateModel);

}

