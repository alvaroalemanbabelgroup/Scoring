package com.example.scoring.service.impl;

import com.example.scoring.mapper.ProfesionMapper;
import com.example.scoring.mapper.RentaAnualMapper;
import com.example.scoring.models.RentaAnual;
import com.example.scoring.service.RentaAnualService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RentaAnualServiceImpl implements RentaAnualService {
    private RentaAnualMapper rentaAnualMapper;
    private ProfesionMapper profesionMapper;

    public RentaAnualServiceImpl(RentaAnualMapper rentaAnualMapper, ProfesionMapper profesionMapper) {
        this.rentaAnualMapper = rentaAnualMapper;
        this.profesionMapper = profesionMapper;
    }

    @Override
    @Transactional
    public RentaAnual insertaRentaAnual(RentaAnual rentaAnual) {
        this.rentaAnualMapper.addRentaAnual(rentaAnual);
        return rentaAnual;
    }
}
