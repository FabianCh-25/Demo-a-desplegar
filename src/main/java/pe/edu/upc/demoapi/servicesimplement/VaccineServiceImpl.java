package pe.edu.upc.demoapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demoapi.entities.Vaccine;
import pe.edu.upc.demoapi.repositories.IVaccineRepository;
import pe.edu.upc.demoapi.services.IVaccineService;

import java.time.LocalDate;
import java.util.List;

@Service
public class VaccineServiceImpl implements IVaccineService{
    @Autowired
    private IVaccineRepository vR;

    @Override
    public void insert(Vaccine vaccine) {
        vR.save(vaccine);
    }

    @Override
    public List<Vaccine> list() {
        return vR.findAll();
    }

    @Override
    public List<Vaccine> buscarFecha(LocalDate fecha) {
        return vR.findBydateVaccine(fecha);
    }
}
