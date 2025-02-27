/**
 * 
 */
package com.hackthon.solatech.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hackthon.solatech.model.LoginRequestBo;
import com.hackthon.solatech.model.SolaTechResponseBO;
import com.hackthon.solatech.service.LoginService;

/**
 * @author User1
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	private static final Logger lOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Override
	public SolaTechResponseBO validateUser(LoginRequestBo loginRequestBo) {
		lOGGER.info("LoginServiceImpl.validateUser has been called");
		SolaTechResponseBO solaTechResponseBO=new SolaTechResponseBO();
		 solaTechResponseBO.setMessage("User Login successfully");
		 return solaTechResponseBO;
	}

}
