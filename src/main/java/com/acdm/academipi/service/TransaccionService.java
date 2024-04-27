package com.acdm.academipi.service;

import com.acdm.academipi.entity.Transaccion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TransaccionService {

    public List<Transaccion> listarTransaccion();

    public Optional<Transaccion> listarTransaccionPorId(Integer id);

    public void guardar(Transaccion transaccion);

    public void actualizar(Transaccion transaccion);

    public void eliminar(Integer id);


}
