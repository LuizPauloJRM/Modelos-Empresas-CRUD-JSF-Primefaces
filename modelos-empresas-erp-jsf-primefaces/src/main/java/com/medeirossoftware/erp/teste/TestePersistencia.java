package com.medeirossoftware.erp.teste;

import com.medeirossoftware.erp.dao.EmpresaDao;
import com.medeirossoftware.erp.model.Empresa;

public class TestePersistencia {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        empresa.setNomeFantasia("Medeiros Software");
        empresa.setRazaoSocial("Medeiros Software LTDA");
        empresa.setCnpj("00.000.000/0001-00");

        EmpresaDao dao = new EmpresaDao();
        dao.salvar(empresa);

    }

}