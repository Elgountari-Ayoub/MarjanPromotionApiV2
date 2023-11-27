package com.example.marjanpromotionapiv2test.Services;

import com.example.marjanpromotionapiv2test.DTOs.CaissierDTO;
import jdk.dynalink.linker.LinkerServices;

import java.util.List;

public interface CaissierService {

    public CaissierDTO create(CaissierDTO caissierDTO);

    public CaissierDTO update(String Caissierid , CaissierDTO caissierDTO);

    public CaissierDTO findByCaissierId(String CaissierId);

    public List<CaissierDTO> findAll();

    public void delete(String CaissierId);
}
