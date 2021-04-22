package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;

import br.com.fiap.dao.SetupDao;
import br.com.fiap.model.Setup;

@ManagedBean
public class setupBean {
	
	private Setup setup = new Setup();
	
	public void executar() {
		new SetupDao().save(this.setup);
		System.out.println(this.setup);
	}

	public Setup getSetup() {
		return setup;
	}

	public void setSetup(Setup setup) {
		this.setup = setup;
	}
	
	

}
